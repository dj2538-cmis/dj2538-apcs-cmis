import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Grass4 extends Platforms
   {

    public void act() 
       {
        Moving();
        
        if (isAtEdge())
           {
            setLocation(80,-380);
           } // end if 
       }// end act
       
   } // end class
