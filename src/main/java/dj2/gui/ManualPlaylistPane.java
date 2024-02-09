package dj2.gui;
import dj2.core.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class ManualPlaylistPane extends AbstractMusicPane {
    public static ManualPlaylist manualPlaylist;
    private JButton playButton;
    private JButton deleteButton;
    private RecentPlaylistPane recentPlaylistPane;
    private JButton createButton;
    private static PersonalizedPlaylistPane personal;
    private String name;

    protected ManualPlaylistPane(RecentPlaylistPane recentPlaylistPane, ManualPlaylist manual, PersonalizedPlaylistPane personal) {
        //ManualPlaylist manual,
        super("ManualPlaylist");
        this.manualPlaylist = manual;
        this.personal = personal;
        this.recentPlaylistPane = recentPlaylistPane;
        
        /*playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(manualPlaylist.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Your playlist is empty!");
                    return;
                }
                    play();
            }
        });*/

        createButton = new JButton("Create");
        createButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                name = JOptionPane.showInputDialog("please enter the name of your playlist");
                personal.create(manualPlaylist, name, recentPlaylistPane);
                //manual.deletePlaylist();
                //update();
                
            }
        });
        deleteButton = new JButton("Clear");
        deleteButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(manualPlaylist.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Your playlist is empty!");
                    return;
                }
                JOptionPane.showMessageDialog(null, "are you sure ?");
                delete();
            }
        });
        JPanel southPane = new JPanel();
        //southPane.add(playButton); //FlowLayout for JPanel, by default
        southPane.add(deleteButton);
        southPane.add(createButton);
        pane.add(southPane, BorderLayout.SOUTH);
        pane.setPreferredSize(new Dimension(350, 200));
        update();
    }

    protected void update(){
    textArea.setText(manualPlaylist.forDisplay());
    }

    private void play(){
        manualPlaylist.play();
        update();
        recentPlaylistPane.update();
    }

    private void delete(){
        manualPlaylist.deletePlaylist();
        update();
    }

}

