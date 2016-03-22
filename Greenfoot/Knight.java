import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Actor
{
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     move(0); 
     if(Greenfoot.isKeyDown("left"))
        {
         turn(-3);   
        }
     if(Greenfoot.isKeyDown("right"))
        {
         turn(3);   
        }
    }    
}
