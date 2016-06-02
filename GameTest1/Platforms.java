import greenfoot.*;  

public abstract class Platforms extends Actor
  {
    public void act() 
       {
        Moving();
        } // end act
        
    public void Moving()
       {
        setLocation(getX(),getY()+1);
       } // end moving
   } // end class
