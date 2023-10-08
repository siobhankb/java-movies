/*
A program that takes an ArrayList and stores your favorite movies. 
The program should keep track of 
    the title of the movie(String), 
    the year they were released(Integer), 
    the lead actor in the movie(String), 
    and rotten tomato score(Boolean).
*/

import java.util.*;

public class FavoriteMovies
{
}

class Movie implements Comparable<Movie>{
    
    // attributes
    private String name;
    private int year;
    private String lead;
    private boolean tomato;
    
    // constructor
    public Movie(String name, int year, String lead, Boolean tomato)
    {
        this.name = name;
        this.year = year;
        this.lead = lead;
        this.tomato = tomato;
    }
    
    // Accessors
    
    public String getName(){
        return this.name;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String getLead(){
        return this.lead;
    }
    
    public boolean getTomato(){
        return this.tomato;
    }
    
    
    // Mutators
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setYear(int newYear){
        this.year = newYear;
    }
    
    public void setLead(String newLead){
        this.lead = newLead;
    }
    
    public void getTomato(boolean newTomato){
        this.tomato = newTomato;
    }
    
    
    // compareTo - compares this Movie to another Movie
    // use title then date
    public int compareTo(Movie other){
        if (name.equals(other.name)){
            return year - other.year;
        } else {
            return name.toLowerCase().compareTo(other.name.toLowerCase());
        }
    }
    
    // toString method for printing
    public String toString(){
        String tomatoString = "";
        if (tomato){
            tomatoString = "> 50%";
        } else {
            tomatoString = "<= 50%";
        }
        
        return String.format(
                                "\n---------------\n"+
                                "Title: %s\n" +
                                "Released: %d\n" +
                                "Lead: %s\n" +
                                "Rotten Tomatoes: %s\n"+
                                "---------------\n",
                                name,
                                year,
                                lead,
                                tomatoString
                            );
    }
}    

class Driver {
    public static void main(String[] args){
        
        Movie movie1 = new Movie("Buckaroo Bonsai", 1984, "Weller, Peter", true);
        Movie movie2 = new Movie("Last Sharknado, The", 2018, "Ziering, Ian", false);
        Movie movie3 = new Movie("Synecdoche New York", 2008, "Seymour Hoffman, Philip", true);
        Movie movie4 = new Movie("Jojo Rabbit", 2019, "Griffin Davis, Roman", true);
        
        
        // make the list
        ArrayList<Movie> MovieList = new ArrayList<>(
            List.of(movie1, movie2, movie3, movie4));
        
        // print the list
        System.out.println(MovieList);
        
        // sort the list
        Collections.sort(MovieList);
        
        // print the sorted list
        System.out.println(MovieList);
    }
}

