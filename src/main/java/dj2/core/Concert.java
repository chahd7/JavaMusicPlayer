package dj2.core;

public class Concert extends Album{
    private String location;

    public Concert(){
        super();
        this.location = "";
    }

    public void updateLocation(String location){
        this.location = location;
    }
    
    public String display(){
        return " title : " + getName() + " description : " + getDescription() + " release date : " + getDate() + "number of tracks " + getNumOfTracks() + " location : " + location;
        
    }
}
