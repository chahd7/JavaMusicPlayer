package dj2.core;

public class Album implements Displayable {
    private String title;
    private String picturePath;
    private String description;
    private String date; 
    private int numberOfTracks;
    private List<Music> list;
    private int i;

    public Album(){
        this.title = ""; 
        this.picturePath = ""; 
        this.description = "";
        this.date = ""; 
        this.numberOfTracks = 0;
        list = new List<Music>();
        i=0;
    }

    
    

    public void update(String title, String picturepath, String description, String date, int numberoftracks){
        this.title = title; 
        this.picturePath = picturepath; 
        this.description = description;
        this.date = date; 
    }

    public void addTrack(Music music){
        if(i!=numberOfTracks){
            list.add(music);
            i++;

        }
        
    }
    
    public String getName(){
        return title; 
    }

    public String getDescription(){
        return description;
    }

    public int getNumOfTracks(){
        return numberOfTracks;
    }

    public String getDate(){
        return date;
    }

    public void play(){
        list.display();
    }


    public String display(){
        return " title : " + getName() + " description : " + getDescription() + " release date : " + getDate() + "number of tracks " + getNumOfTracks();
        
    }
    

}


