package dj2.core;

public class CatalogStyle{
    private Style[] styles;
   
    private static final int MAX = 20;
    int number;
    public CatalogStyle(){
        styles = new Style[MAX];
        number = 0;
    }

    public void addStyle(Style style){
        styles[number++] = style;
    }

    public Style[] getStyles(){
        Style[] cats = new Style[number];
        for(int i = 0; i < number; i++)
            cats[i] = styles[i];        
        return cats;

    }

    }

