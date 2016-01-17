package ClassCompositionP1;
import java.util.ArrayList;

public class MyPod 
   {
    private String color;
    private int MemoryCapacity; //GB
    private ArrayList<String> songLibrary;
    private ArrayList<String> songs;
    
    public MyPod()
       {
        this.color = new String( "Black");
        this.MemoryCapacity = 32; 
        this.songLibrary = new ArrayList<String>(); 
       } // end zero-arg constructor
       
    public MyPod( String color, int MemoryCapacity)
       {
        this.songLibrary = new ArrayList<songs>();
        this.songLibrary.add( "Roses" );
        this.songLibrary.add( "Roll With Me " );
        this.songLibrary.add( "Middle" );        
       } // end multi constructor
       
    public String toString()
       {
        String output = new String();
        
        output = "The color of this MyPod is: " + color + "\n" +
                 "The memory capacity is: " + MemoryCapacity + "\n"; 
       
        for( String s : songLibrary)
           {
            System.out.println( s );              
           }
                 
        return output;  
       } // end method toString 
    
   } // end class