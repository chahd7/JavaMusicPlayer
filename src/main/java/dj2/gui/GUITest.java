package dj2.gui;


import dj2.core.*;
import dj2.gui.*;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;
public class GUITest {
    public GUITest() {
        super();
    }

    public static void main(String[] args) throws Exception {
        try{
            CatalogStyle catalog = new CatalogStyle();
            Style pop = new Style("pop");
            Style rock = new Style("rock");
            Style ballad = new Style("ballad");
            Style rnb = new Style("RNB");
    
            catalog.addStyle(pop);
            catalog.addStyle(rock);
            catalog.addStyle(ballad);
            catalog.addStyle(rnb);   
            RecentPlaylist playlistTwo = new RecentPlaylist();
                Music musicOne = new Music("friends", (float)3.02, "music\\friends.wav", "album", playlistTwo, pop);
                Music musicTwo = new Music("blackswan", (float)4.50, "music\\blackswan.wav", "single", playlistTwo, pop);
                Music musicThree = new Music("zeze", (float)3.25, "music\\zeze.wav", "concert", playlistTwo, ballad);
                Music musicFour = new Music("blueming", (float)3.25, "music\\blueming.wav", "album", playlistTwo, rnb); 
            Group group = new Group();
                group.update("bts", "https://btsbio.com", "bts is a seven members korean group");
                group.addMember(new Member("suga", "suga is a member of bts"));
                group.addMember(new Member("jimin", "jimin is a member of bts"));
                group.addMember(new Member("rm", "rm is a member of bts"));
                group.addMember(new Member("j-hope", "j-hope is a member of bts"));
                group.addMember(new Member("jin", "jin is a member of bts"));
                group.addMember(new Member("Taehyung", "taehyung is a member of bts"));
                group.addMember(new Member("jungkook", "jungkook is a member of bts"));
                musicOne.setAuthor(group);
                musicTwo.setAuthor(group);
                group.addSingles(musicOne); 
                group.addSingles(musicTwo);
    
                Artist artist = new Artist();
                artist.update("iu", "https:/pictureofiu", "iu is a korean singer");
                musicThree.setAuthor(artist);
                musicFour.setAuthor(artist);
                
                ManualPlaylist playlistOne = new ManualPlaylist();

                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                RecentPlaylistPane recentPlaylistPane = new RecentPlaylistPane(playlistTwo);
                PersonalizedPlaylistPane personal = new PersonalizedPlaylistPane();
                ManualPlaylistPane manualPlaylistPane = new ManualPlaylistPane(recentPlaylistPane, playlistOne, personal);
                PlayingPane playing = new PlayingPane();
                

               MainFrame mainFrame = new MainFrame(catalog, recentPlaylistPane, manualPlaylistPane, playing, personal);
            }catch(IllegalDurationException a){
                System.out.println(a.getMessage());
            }

            
        }
    
    }

 
