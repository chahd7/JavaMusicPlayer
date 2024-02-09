package dj2.core;


public class RecentPlaylist extends Playlist{
    
    public RecentPlaylist(){
       super();
    }

    public void add(Music music){
        if(list.search(music) == false){
        list.add(music);

    }
}

   public void play(){
    
    list.play();
    

   }
}
