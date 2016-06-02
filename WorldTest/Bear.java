import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    private int level;
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bear()
    {
        level = 1;
    }
    public void act() 
    {
      checkKeys();  
      checkNextLevel();
    }    
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") )
        {
          
        }
        if (Greenfoot.isKeyDown("right") )
        {
         
        }
       
    }    
    private void checkNextLevel()
    {
        if (getX() == getWorld().getWidth()-1) {
            if (level == 1) {
                level = 2;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level2(this));
            }
            else {
                level = 1;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level1(this));
            }
        }
    }
}
