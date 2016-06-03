import greenfoot.*;  

public abstract class Background extends SmoothMover
   { 
    public abstract void act();   
       
    public void Moving()
       {
        setLocation(getX(),getY()+1);
        if (isAtEdge())
           {
            setLocation(getX(),0);
           }   
       } // end moving
   } // end class
