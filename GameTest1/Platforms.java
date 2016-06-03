import greenfoot.*;  

public abstract class Platforms extends Actor
  {
    public abstract void act(); 
          
    public void Moving()
       {
        setLocation(getX(),getY()+1);
       } // end moving
   } // end class
