import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrontWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrontWorld extends World
{

    /**
     * Constructor for objects of class FrontWorld.
     * 
     */
    public FrontWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Floor floor = new Floor();
        addObject(floor,308,391);
        floor.setLocation(299,390);
        Link link = new Link();
        addObject(link,0,339);
        link.setLocation(0,339);

        link.setLocation(283,284);
        Score score = new Score();
        addObject(score,539,26);
        Heart heart = new Heart();
        addObject(heart,463,101);
        link.setLocation(200,336);
    }
}
