package dj2.gui;
import dj2.core.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {

    private JPanel mainPanel = new JPanel();
    private JPanel eastPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private CatalogPane catalogPane;
    private RecentPlaylistPane recentPane;
    private ManualPlaylistPane manualPane;
    private PlayingPane playingPane;
    private PersonalizedPlaylistPane personal;

    
    public MainFrame(CatalogStyle catalog, RecentPlaylistPane recent, ManualPlaylistPane manual, PlayingPane playing, PersonalizedPlaylistPane personal){
        this.recentPane = recent; 
        this.manualPane = manual;
        this.playingPane = playing;
        this.personal = personal;
        RecentPlaylist r = recent.recentPlaylist;
        ManualPlaylist m = manual.manualPlaylist;
        catalogPane = new CatalogPane(catalog, manual, recent, playing);
        

        JLabel versionLabel = new JLabel("Media player v1.0");
        versionLabel.setFont(new Font("Verdana", Font.BOLD, 12));

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(versionLabel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(catalogPane, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        mainPanel.add(playingPane, BorderLayout.NORTH);
        //mainPanel.add(manualPane, BorderLayout.SOUTH);


        eastPanel.setLayout(new BorderLayout());
        //eastPanel.add(playingPane, BorderLayout.NORTH);
        //eastPanel.add(manualPane, BorderLayout.CENTER);
        eastPanel.add(recentPane, BorderLayout.CENTER);
        eastPanel.setPreferredSize(new Dimension(420, 700));

        southPanel.setLayout(new BorderLayout());
        southPanel.add(manualPane, BorderLayout.EAST);
        southPanel.add(personal, BorderLayout.CENTER);

        setTitle("Media Player");
        setJMenuBar(new MenuBar()); 
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
