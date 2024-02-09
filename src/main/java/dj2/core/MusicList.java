package dj2.core;

public class MusicList {
    private MusicNode head; 
    private MusicNode last;
    public int size = 0; 
    private MusicNode walker;
    private MusicNode prev;

    

    public MusicList(){
        head = last = null;
        size = 0;
        
    }

   
    
    public void add(Music music){
        if(head == null){
            head = last = new MusicNode(music);
        }
        else{
            last.next = new MusicNode(music);
            last = last.next;
        }
        size++;
    }

    public Music[] toArray(){
        Music[] musics = new Music[size];
        int index = 0; 
        for(MusicNode walker = head; walker != null; walker = walker.next){
            musics[index++] = walker.music;

          
        }
return musics;
    }

    public String display(){
        StringBuffer musicForDisplay = new StringBuffer();
        for(MusicNode walker = head; walker != null; walker = walker.next)
            musicForDisplay.append(walker.music.display() + "\n");
        return musicForDisplay.toString();
    }

    public boolean search(Music music){
        MusicNode walker = head;
        while(walker != null){
            if(walker.music.equals(music)){
                return true;
            }
            walker = walker.next;
        }
        return false;

    }

    public void delete(Music music){
       walker = head;
       if(walker.getMusic() == music){
           head = head.next;
       }

       while(walker != null && walker.getMusic() != music){
           prev = walker;
           walker = walker.next;
       }

       if(walker == null){
           return;
       }

       prev.next = walker.next;




    }
    
    protected void empty(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void play(){
       
        for( walker = head; walker != null; walker = walker.next){
            walker.music.play();
        }
    }

    } 
    
 