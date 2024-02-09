package dj2.core;

public class Style {
    private String name; 
    public MusicList list;
    public static int size = 0;

    public Style(String name){
        this.name = name;
        list = new MusicList();
    }

    public void addToStyle(Music music){
        list.add(music);
        size++;
    }

    public String getName(){
        return name;
    }


    public void display(){
        list.display();
    }

    public Music[] getTracks(){
        return list.toArray();
    }

    public void displayTrack(){
        Music[] musics = getTracks();
        for(int i = 0; i<list.size; i++){

            System.out.println(musics[i].display());
        
    }
}




}
