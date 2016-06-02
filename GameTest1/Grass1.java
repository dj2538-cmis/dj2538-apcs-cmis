import greenfoot.*;  

public class Grass1 extends Platforms
   {
    public void act() 
       {
        Moving();
        if (isAtEdge())
           {
            setLocation(500,-80);
           } // end if 
           
       } // end act
       
   } // end class
