import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Random;

public class MyWorld extends World
   {
    ArrayList Objects = new ArrayList(2);
    
    public MyWorld()
       {    
        super(600, 400, 1); 
        ObjectsAdded();
        prepare();
        HeartAppear();

        int i = 0;
        while (i < 1) 
           {
            Random generator = new Random();  
            Actor spawn = (Actor)Objects.get(generator.nextInt(Objects.size()));
            addObject(spawn, Greenfoot.getRandomNumber(getWidth()),getHeight() - 360);
            i++;
           } // end while
        
       } // end 
       
    public void ObjectsAdded()
       {
         for(int i = 0; i < 2; i++)
            {
             Actor[] actor ={new RobotRight(), new RobotLeft()};
             int ColorNumber = Greenfoot.getRandomNumber(2);
             Objects.add(new RobotRight());
             Objects.add(new RobotLeft());
            } // end for 
       } // end
       
    public void prepare() 
       {
        Wall brick = new Wall();
        addObject(brick, 300, 300); 
        Grass1 grass = new Grass1();
        addObject(grass, 500, 380); 
        Grass2 grass2 = new Grass2();
        addObject(grass2, 80, 280); 
        Grass3 grass3 = new Grass3();
        addObject(grass3, 500, 180); 
        Grass4 grass4 = new Grass4();
        addObject(grass4, 80, 80); 
        Link player = new Link();
        addObject(player, 28, 210); 
        Score score = new Score();
        addObject(score,539,26);
        
       }// end prepare
       
    public void HeartAppear()
       {
        for (int i = 0; i < 2; i++) 
           {
            addObject(new Heart(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
           }       
       } // end heartappear
       
   } // end class
