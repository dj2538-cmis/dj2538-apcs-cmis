import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Interactives extends Actor implements Gravity
   {
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;
    
    public void act() 
       {
        fall();
        checkFall();
       } // end act
       
    public void Edge()
       {
        if(isAtEdge())
           {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
           } // end if 
           
       }// end edge
      
    public void fall()
       {
        setLocation(getX(), getY() + vSpeed);
        
        if(vSpeed <=9)
           {
            vSpeed = vSpeed + acceleration;
           } // end if
           
       }// end fall
       
    public void moveToGround(Actor ground)
       {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
       } // end movetoground
       
    public boolean onGround()
       {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        
        if(ground == null)
           {
            return false;
           } // end if
        else
           {
            moveToGround(ground);
            return true;
           } // end else
       } // end on ground
    
    public void checkFall()
       {
        if(onGround())
           {
            vSpeed = 0;
           } // end if
        else
           {
            fall();
           } // end else
       } // end checkfall
   } // end class
