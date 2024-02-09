package dj2.core;

import javax.print.attribute.standard.RequestingUserName;

public abstract class Playlist {
    protected MusicList list;
  
    public Playlist(){
        list = new MusicList();
    }


    public abstract void add(Music music);

    public abstract void play();

    public String forDisplay(){
       return list.display();
    }

    public Music[] getTracks(){
        return list.toArray();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }


}
