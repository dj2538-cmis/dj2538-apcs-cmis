package Fundemental8;


public class Fundamentals8
{
    public static void main(String[] args)
    {
    String[] artist = {"Jaymes Young", "Flume", "Imagine Dragons"};
    for (int index = 0; index < artist.length;index++)
    {
     System.out.println(artist[index]);    
    }
    System.out.println("\n");
    artist[(int)(Math.random()*3)] = "Michael Jackson";
    for (int index = 0; index < artist.length;index++)
    {
     System.out.println(artist[index]);    
    }
    System.out.println("\n");
    for (int index = 0; index < artist.length;index++)
    {
     if(artist[index].equals("Michael Jackson")) 
     {
      System.out.println("Michael Jackson found"); 
     }
     else 
     {
      System.out.println("Michael Jackson not found["+index+"]"); 
     }
     
    }
    
    
   
    
    
    }
}