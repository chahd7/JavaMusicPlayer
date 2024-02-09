package dj2.core;

import java.io.File;
import java.io.FileNotFoundException;

public class Dj2Test {
    public static void main(String[] args) {

       
        try{
            CatalogStyle catalog = new CatalogStyle();
            Style one = new Style("pop");
            Style two = new Style("rock");
            Style three = new Style("classical");
            Style four = new Style("ballad");
            catalog.addStyle(one);
            catalog.addStyle(two);
            catalog.addStyle(three);
            catalog.addStyle(four);
    
            RecentPlaylist playlisttwo = new RecentPlaylist();
            Music musicone = new Music("friends", (float)3.02, "friends.wav", "album", playlisttwo, one);
            Music musictwo = new Music("blackswan", (float)4.50, "blackswan.mp3", "single", playlisttwo, two);
            Music musicthree = new Music("zeze", (float)3.25, "https://zeze.com", "concert", playlisttwo, three);
            Music musicfour = new Music("blueming", (float)3.25, "https://blueming.com", "album", playlisttwo, four);
   musicone.play();
            Group group = new Group();
            group.update("bts", "https://btsbio.com", "bts is a seven members korean group");
            group.addMember(new Member("suga", "suga is a member of bts"));
            group.addMember(new Member("jimin", "jimin is a member of bts"));
            group.addMember(new Member("rm", "rm is a member of bts"));
            group.addMember(new Member("j-hope", "j-hope is a member of bts"));
            group.addMember(new Member("jin", "jin is a member of bts"));
            group.addMember(new Member("Taehyung", "taehyung is a member of bts"));
            group.addMember(new Member("jungkook", "jungkook is a member of bts"));
            musicone.setAuthor(group);
            musictwo.setAuthor(group);
            group.addSingles(musicone); 
            group.addSingles(musictwo);
          
            
            
    
            Artist artist = new Artist();
            artist.update("iu", "https:/pictureofiu", "iu is a korean singer");
            musicthree.setAuthor(artist);
            musicfour.setAuthor(artist);
        
    
            Album albumone = new Album();
            albumone.update("proof", "https://proofpic.com", "proof was released by bts", "22/06/22", 20);
            musicone.setAlbum(albumone);
            Album albumfour = new Album();
            albumfour.update("love poem", "https://lovepoempic.com", "love poem was released by iu", "22/06/20", 7);
            musicfour.setAlbum(albumfour);
    
    
            Concert concertone = new Concert();
            concertone.update("the red bullet", "https://theredbulletpic.com", "the red bullet is a bts concert", "2014", 20);
            musicthree.setConcert(concertone);
    
            musicone.type();
            musictwo.type();
            musicthree.type();
            musicfour.type();
    
            ManualPlaylist playlistone = new ManualPlaylist();
            playlistone.add(musicone);
            playlistone.add(musictwo);
            playlistone.add(musicthree);
            playlistone.play();
    
            System.out.println("----------------------------------------------------");
            ManualPlaylist playlistthree = new ManualPlaylist();
            playlistthree.add(musicfour);
            playlistthree.add(musictwo);
            playlistthree.play();
            
            
    
            System.out.println("----------------------------------------------------");
    
            playlisttwo.play();
        }
        catch(IllegalDurationException a){
            System.out.println(a.getMessage());
        }//catch(FileCantOpenException b){
            //System.out.println(b.getMessage());
        //}
        catch(Exception error){
           System.out.println("error");
        }
    
    
        }
}
