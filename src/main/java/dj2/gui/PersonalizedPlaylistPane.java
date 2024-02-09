package dj2.gui;

import dj2.core.ManualPlaylist;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PersonalizedPlaylistPane extends AbstractMusicPane {
    private String name;
    private JPanel elementsPane = new JPanel();
    public PersonalizedPlaylistPane(){
        super("your playlists (please check the tabs)");
        this.name = name;
        this.setBackground(new Color(243, 227, 237));
        
    }

    public void create(ManualPlaylist manual, String name, RecentPlaylistPane recent){
        elementsPane.add(new SpecificPlaylist(manual, name, recent));
        this.add(name, elementsPane);
    }

    public void update(){

    }


}
