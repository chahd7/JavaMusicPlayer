package dj2.core;

public class List<T extends Displayable>{
    private Node<T> head; 
    private Node<T> last;
    private int size;
    private Node<T> walker;
    private Node<T> previous;

    public List(){
        head = last = null;
        size = 0;
    }

    public void add(T toAdd){
        if(head == null){
            head = last = new Node<T>(toAdd);
        }
        else{
            last.next = new Node<T>(toAdd);
            last = last.next;
        }
        size++;
    }

    public void display(){
        
        for(Node<T> walker = head; walker != null; walker = walker.next){
            System.out.println(walker.content.display());
        }
       
    }


    public boolean search(T tosearch){
         walker = head;
        while(walker != null){
            if(walker.content.equals(tosearch)){
                return true;
            }
            walker = walker.next;
        }
        return false;

    }

    public void delete(T toDelete){
        walker = head;
        if(walker.get() == toDelete){
            head = head.next;
        }
 
        while(walker != null && walker.get() != toDelete){
            previous = walker;
            walker = walker.next;
        }
 
        if(walker == null){
            return;
        }
 
        previous.next = walker.next;
 
 
 
 
     }
     
     protected void empty(){
         head = null;
     }
 
     public boolean isEmpty(){
         if(head == null){
             return true;
         }
         return false;
     }

     protected Object[] toArray() {
        if(size == 0)
            return null;
        if(isEmpty() == true){
            System.out.println("the pb is here");
            return null;
        }
        Object[] objects = new Object[size];
        int index = 0;
        for(Node<T> walker = head; walker != null; walker = walker.next)
            objects[index++] = walker.content;
        return objects;
    }


 

}

