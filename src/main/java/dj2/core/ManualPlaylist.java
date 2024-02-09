package dj2.core;

public class ManualPlaylist extends Playlist {
  

    public ManualPlaylist(){
        super();
        
       
    }

    public void add(Music music){
        list.add(music);
    }

    public void deleteMusic(Music music){
        list.delete(music);
    }

    public void deletePlaylist(){
        list.empty();
    }

    public void play(){
        //System.out.println("now playing... " + name + " playlist");
        list.play();
        //System.out.println("end");
    }

    

} 

