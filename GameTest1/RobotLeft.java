import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class RobotLeft extends Enemy
   {
    GifImage Robot = new GifImage("LeftRobot.gif");
    
    public RobotLeft()
        {
        GreenfootImage image = getImage();
        image.scale(55,55);
        setImage(image);  
        } // end
    
    public void act() 
       {
       MoveRight();
       fall();
       checkFall();
       Reappear();
          
       setImage( Robot.getCurrentImage() );  
       } // end act
       
    public void Reappear()
       {
        if (isAtEdge()) 
           {
            ObjectsAdded();
            
            Random generator = new Random();  
            Actor spawn = (Actor)Objects.get(generator.nextInt(Objects.size()));
            getWorld().addObject(spawn, Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight() - 390);
            
            getWorld().removeObject(this);
           } // end if  
       } // end 
       
    public void MoveRight()
       {
        move(-1.1); 
       }// end move
       
   }
