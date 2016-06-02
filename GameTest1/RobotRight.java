import greenfoot.*;
import java.util.Random;  

public class RobotRight extends Enemy
   {  
    GifImage Robot = new GifImage("RightRobot.gif");
    
    public void act() 
       {
        MovingRight();
        fall();
        checkFall();
        Reappear();
       
        setImage( Robot.getCurrentImage() );  
       } //end act
      
    public void Reappear()
       {
        if (isAtEdge()) 
           {
            ObjectsAdded();
            
            Random generator = new Random();  
            Actor spawn = (Actor)Objects.get(generator.nextInt(Objects.size()));
            getWorld().addObject(spawn, Greenfoot.getRandomNumber(getWorld().getWidth()),getWorld().getHeight() - 390);
            
            getWorld().removeObject(this);
           } // end if
       } // end
      
    public void MoveRight()
       {
        move(1); 
       } // end move right
   }
