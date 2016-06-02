import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 3;
    private int direction = 1;
    
    private GreenfootImage run1r = new GreenfootImage("LinkRight1.png");
    private GreenfootImage run2r = new GreenfootImage("LinkRight2.png");
    private GreenfootImage run3r = new GreenfootImage("LinkRight3.png");
    private GreenfootImage run4r = new GreenfootImage("LinkRight4.png");
    private GreenfootImage run1rs = new GreenfootImage("LinkRightStill.png");
    private int frame = 1;
    private int animationCounter = 0;
    
    public void act() 
       {
        moving();
        
       }    
    
    public void moving()
       {
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-6);
            direction = 1;
            moveLeft();
        }
       
       }
        
    public void moveLeft()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 10 == 0)
        {
            animateRight();
        }
    }

    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(run1rs);
        }
        else if(frame == 2)
        {
            setImage(run1r);
        }
        else if(frame == 3)
        {
            setImage(run2r);
        }
        else if(frame == 4)
        {
            setImage(run3r);
            frame = 1;
            return;
        }
        else if(frame == 5)
        {
            setImage(run4r);
            frame = 1;
            return;
        }
        frame++;
    }
   
    
       
    
}
