package ClassCompositionP5;
import java.util.ArrayList;

public class MyPod2 
   {
    private String color;
    private int MemoryCapacity; //GB
    private ArrayList<String> Songs = new ArrayList<String>();
    //private String[] songLibrary; 
    
    public MyPod2()
       {
        this.color = new String( "Black" );
        this.MemoryCapacity = 32; 
       } // end zero-arg constructor
       
    public MyPod2( String color, int MemoryCapacity)
       {
        this.color = new String( color );
        this.MemoryCapacity = MemoryCapacity;
        Songs.add( "Roses" );
        Songs.add( "Roll With Me" );
        Songs.add( "Middle" );
        //this.songLibrary = new String[3];
        //songLibrary[0] = new String( "Roses" );
        //songLibrary[1] = new String( "Roll With Me" );
        //songLibrary[2] = new String( "Middle" );
       } // end multi constructor
       
    public String toString()
       {
        String output = new String();
        
        output = "The color of this MyPod is: " + color + "\n" +
                 "The memory capacity is: " + MemoryCapacity + "\n\n" +
                 "Number of songs: " + Songs.size() + "\n"; 
       
        for( String s : Songs)
           {
            output += s + "\n";  
           }
                 
        return output;  
       } // end method toString 
    
<<<<<<< HEAD
   } // end class
=======
   } // end class

>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
