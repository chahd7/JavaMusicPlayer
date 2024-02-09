package dj2.core;
public class IllegalDurationException extends Exception {
    public IllegalDurationException(){

    }

    public String getMessage(){
        return "The duration of your track is negatif. Please enter another duration";
    }
}


