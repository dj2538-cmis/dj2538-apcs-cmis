import greenfoot.*;  
import java.util.ArrayList;
import java.util.Random;

public class Enemy extends SmoothMover implements Gravity
   { 
    ArrayList Objects = new ArrayList(3);
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 0;
    
    public void act() 
       {
        MovingRight();
        MovingLeft();
        fall();
        checkFall();
        
       } // end 
    
    public void fall()
       {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <= 9)
           {
            vSpeed = vSpeed + acceleration;
           } // end if
       
       } // end fall
       
    public void moveToGround(Actor ground)
       {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
       } // end movetogriund
       
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
       } // end onground
    
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
       } 
       
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
    
    public void MovingRight()
       {
        move(1.1);    
       } // end move right 
       
    public void MovingLeft()
       {
        move(-1.1);
       } // end move left
       
   }

