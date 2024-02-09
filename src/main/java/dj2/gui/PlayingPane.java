package dj2.gui;
import dj2.core.*;
public class PlayingPane extends AbstractMusicPane{
    private Music current;

    public PlayingPane(){
        super("now playing ...");
    }

    public void getMusic(Music music){
        current = music;
    }

    public void update(){
        textArea.setText(current.display());
    }


}
