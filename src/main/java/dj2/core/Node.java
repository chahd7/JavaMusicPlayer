package dj2.core;

public class Node<T>{
    public T content;
    public Node<T> next;

    public Node(T value){
        this.content = value; 
        next = null;
    }

    public T get(){
        return content;
    }
}
