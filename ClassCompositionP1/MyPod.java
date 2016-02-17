package ClassCompositionP1;

public class MyPod 
   {
    private String color;
    private int MemoryCapacity; //GB
    private String[] songLibrary; 
    
    public MyPod()
       {
        this.color = new String( "Black" );
        this.MemoryCapacity = 32; 
        this.songLibrary = new String[3]; 
       } // end zero-arg constructor
       
    public MyPod( String color, int MemoryCapacity)
       {
        this.color = new String( color );
        this.MemoryCapacity = MemoryCapacity;
        this.songLibrary = new String[3];
        songLibrary[0] = new String( "Roses" );
        songLibrary[1] = new String( "Roll With Me" );
        songLibrary[2] = new String( "Middle" );
       } // end multi constructor
       
    public String toString()
       {
        String output = new String();
        
        output = "The color of this MyPod is: " + color + "\n" +
                 "The memory capacity is: " + MemoryCapacity + "\n"; 
       
        for( String s : songLibrary)
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
