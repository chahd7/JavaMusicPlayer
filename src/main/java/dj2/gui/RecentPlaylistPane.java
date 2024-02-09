package dj2.gui;

import dj2.core.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class RecentPlaylistPane extends AbstractMusicPane{
    private Music music;
    public static RecentPlaylist recentPlaylist;
    private JButton playButton;

    public RecentPlaylistPane(RecentPlaylist recent){
        super("Recent Playlist");
        this.recentPlaylist = recent;
        this.setSize(20, 20);
        playButton = new JButton("play");
        playButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(recentPlaylist.isEmpty() == true){
                JOptionPane.showMessageDialog(null, "You haven't played any track yet!");
                    return;
                }
                    play();
            }
        });
        JPanel southPane = new JPanel();
        southPane.add(playButton); //FlowLayout for JPanel, by default
        pane.add(southPane, BorderLayout.SOUTH);
        pane.setPreferredSize(new Dimension(350, 200));
        //update();
    }

    public void update(){
        textArea.setText(recentPlaylist.forDisplay());
        //update();
       }


    private void play(){
        update();
        recentPlaylist.play();
        
    }

    
}

