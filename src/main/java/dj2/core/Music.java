package dj2.core;


import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


import javax.sound.sampled.*;

import javax.swing.JOptionPane;

public class Music implements Displayable{

public String title;
private Style style;
private float duration;
private Author author;
private String path;
private Concert concert;
private Album album;
private String type;
private static RecentPlaylist recent ;




    public Music(String title, float duration, String path, String type, RecentPlaylist playlist, Style style) throws IllegalDurationException{
        this.title = title; 
        
        if(duration<0){
           throw new IllegalDurationException();
        }
        this.duration = duration;
        this.path = path;
        this.type = type; 
        this.style = style;
        author = new Author();
        concert = new Concert();
        album = new Album();
        this.recent = playlist;
        this.style = style;
        style.addToStyle(this);
        
       
        

    }

    void update(String name, float duration, String path, String type){
        this.title = name; 
        this.duration = duration; 
        this.path = path;
        this.type = type; 
        this.style = style;
    }

    

    public void setAuthor(Author author){
        this.author = author;
    }


    public void setConcert(Concert concert){
        this.concert = concert;
    }
    public void setAlbum(Album album){
        this.album = album;
    }

    public void type(){
        if(type.equalsIgnoreCase("album") == true){
            author.addSingles(this);
        }
        if(type.equalsIgnoreCase("album") == true){
            author.addAlbum(album);
            album.addTrack(this);     
        }
        if(type.equalsIgnoreCase("concert") == true){
            author.addConcert(concert);
            concert.addTrack(this);
        }
    }

    public String display(){
        return title + " by " + author.getNameAuthor();
    }

   
    public void play(){
        recent.add(this);
        
        
        try{
            //String filePath = System.getProperty("user.dir") + File.separator + path;
            File temp = new File(path);
            String path = temp.getAbsolutePath();
            System.out.println(path);
            File musicPath = new File(path);
            Clip play = null;

            if(musicPath.exists()){
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
                play = AudioSystem.getClip();
                play.open(audioInputStream);
                FloatControl volume = (FloatControl)play.getControl(FloatControl.Type.MASTER_GAIN);
                volume.setValue(1.0f);
                play.start();
                
                JOptionPane.showMessageDialog(null, "do you want to stop ?");
                play.stop();
                play.drain();

            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error");


        }
}
}

        

