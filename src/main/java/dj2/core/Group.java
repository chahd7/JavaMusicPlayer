package dj2.core;

public class Group extends Author{
    private List<Member> members;
    
    public Group(){
        super();
        members = new List<Member>();
    }


    public void addMember(Member member){
        members.add(member);
    }
    
}

