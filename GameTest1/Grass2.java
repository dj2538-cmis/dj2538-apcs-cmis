import greenfoot.*;  

public class Grass2 extends Platforms
   {
    public void act() 
       {
        Moving();
        
        if (isAtEdge())
           {
            setLocation(80,-180);
           }// end if
       }  // end act
       
   } // end class
