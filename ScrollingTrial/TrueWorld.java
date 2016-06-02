import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrueWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrueWorld extends ScrollingWorld
{

    /**
     * Constructor for objects of class TrueWorld.
     * 
     */
    public TrueWorld()
    {
      super(600, 400, 1);//creates an infinite scrolling world with a screen size of 600 x 400;
        //if you want to limitate the scrolling world you have to use this constructor:
        //super(600, 400, 1, scrollingWidth, scrollingHeight);
        setScrollingBackground(new GreenfootImage("Wall.jpg"));
    }
    
    
}
