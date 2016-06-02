import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightWorld extends World
{

    /**
     * Constructor for objects of class LeftWorld.
     * 
     */
    public RightWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Floor floor = new Floor();
        addObject(floor,308,391);
        floor.setLocation(299,390);
        Link link = new Link();
        addObject(link,0,339);
        link.setLocation(0,339);
        Score score = new Score();
          addObject(score,539,26);
     }
    }

