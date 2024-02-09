package dj2.core;

public class Author {
   
    private String name;
    private String imagePath; 
    private String bio; 
    private MusicList singles;
    private List<Album> albums;
    private List<Concert> concerts;
    private int i = 0;
    private static final int MAX = 100;


   public Author(){
    this.name = ""; 
    this.imagePath = ""; 
    this.bio = "";
    singles = new MusicList();
    albums = new List<Album>();
    concerts = new List<Concert>();
}

public void update(String name, String path, String bio){
    this.name = name;
    this.imagePath = path;
    this.bio = bio;
}

   public void addSingles(Music music){
    singles.add(music);
   }

   public void addAlbum(Album album){
    albums.add(album);

    }
   

   public void addConcert(Concert concert){
    concerts.add(concert);
    
   }

   public String getNameAuthor(){
       return name;
   }

   public String display(){
    return " name : " + name + " bio : " + bio;

   }


   


}
 

