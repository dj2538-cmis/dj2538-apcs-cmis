import greenfoot.*;  

public class Background extends SmoothMover 
   { 
    public void act() 
       {
        Moving();
       } // end act
       
    public void Moving()
       {
        setLocation(getX(),getY()+1);
        if (isAtEdge())
           {
            setLocation(getX(),0);
           }   
       } // end moving
   } // end class
