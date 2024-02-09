package dj2.gui; 
import dj2.core.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
//import oracle.jdeveloper.layout.XYConstraints;
//import oracle.jdeveloper.layout.XYLayout;

public class MusicPane extends JPanel {
    private Music music;
    private JTextArea musicTextArea = new JTextArea();
    private JButton addToPlaylistButton = new JButton();
    private JButton playButton = new JButton();
    private FlowLayout flow = new FlowLayout();
    private ManualPlaylistPane manualP;
    private RecentPlaylistPane recentP;
    ManualPlaylist manual;
    RecentPlaylist recent;
    private PlayingPane playP;
    
    public MusicPane(Music music, ManualPlaylistPane manualPlaylistPane, RecentPlaylistPane recentPlaylistPane, PlayingPane playingP){
        this.music = music;
        manualP = manualPlaylistPane;
        recentP = recentPlaylistPane;
        playP = playingP;
        manual = manualP.manualPlaylist;
        recent = recentP.recentPlaylist;

        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jbInit(){
        this.setLayout(flow);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.setBackground(new Color(230, 224, 236));
        flow.setHgap(20);
        flow.setVgap(20);
        this.setSize(265, 90);
        musicTextArea.setEditable(false);
        musicTextArea.setLineWrap(true);
        musicTextArea.setText(music.display());
        musicTextArea.setBackground(new Color(195, 230, 234));
        addToPlaylistButton.setText("add to Playlist");
        playButton.setText("play");
        addToPlaylistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                manual.add(music);
                manualP.update();                
            }
        });
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                playP.getMusic(music);
                playP.update();
                recent.add(music);
                recentP.update();
                music.play();
                     
            }
        });
        this.add(addToPlaylistButton, BorderLayout.SOUTH);
        this.add(playButton, BorderLayout.SOUTH);
        this.add(musicTextArea, BorderLayout.NORTH);
       
        


    }




}
