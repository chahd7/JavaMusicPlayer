package dj2.core;

public class Member implements Displayable{
    private String name; 
    private String bio; 

    public Member(String name, String bio){
        this.name = name; 
        this.bio = bio;
    }

    public void play(){
        System.out.println("name : " + name);
    }

    public String display(){
        return"name : " + name;
    }
}
