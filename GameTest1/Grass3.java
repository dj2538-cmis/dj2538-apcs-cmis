import greenfoot.*; 

public class Grass3 extends Platforms
   {
    public void act() 
       {
        Moving();
        
        if (isAtEdge())
           {
            setLocation(500,-280);
           } // end if
       } // end act     
   } // end class
