package dj2.core;

public class MusicNode {
    public Music music; 
    public MusicNode next;

    public MusicNode(Music music){
        this.music = music; 
        next = null;

    }

   public Music getMusic(){
        return music;
    }
}  