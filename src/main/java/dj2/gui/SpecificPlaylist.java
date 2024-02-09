package dj2.gui;
import dj2.core.*;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecificPlaylist extends JPanel{
    private ManualPlaylist manual;
    private String name;
    private RecentPlaylistPane recent;
    private JButton playButton;
    private FlowLayout flow = new FlowLayout();
    private JTextArea playlistTextArea = new JTextArea();
    public SpecificPlaylist(ManualPlaylist manual, String name, RecentPlaylistPane recent){
        //super(name);
        this.manual = manual;
        this.name = name;
        this.recent = recent;
        this.setLayout(flow);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.setBackground(new Color(230, 224, 236));
        flow.setHgap(20);
        flow.setVgap(20);
        this.setSize(300, 200);
        playlistTextArea.setEditable(false);
        playlistTextArea.setLineWrap(true);
        playlistTextArea.setText(manual.forDisplay());
        playButton = new JButton("play");
        playButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(manual.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Your playlist is empty!");
                    return;
                }
                    play();
            }
        });
        JPanel southPane = new JPanel();

        this.add(playlistTextArea);
        southPane.add(playButton);
        this.add(southPane, BorderLayout.SOUTH);
        



    }

    private void play(){
        manual.play();
        recent.update();
    }

}
