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
    private int speed = 0;
    private int direction = 1;
    int score = 0;
    private boolean jumping;
    private int jumpStrength = 15;
    
    private GreenfootImage standing = new GreenfootImage("LinkStanding.png");
    private GreenfootImage run1r = new GreenfootImage("LinkLeft1.png");
    private GreenfootImage run2r = new GreenfootImage("LinkLeft2.png");
    private GreenfootImage run3r = new GreenfootImage("LinkLeft3.png");
    private GreenfootImage run4r = new GreenfootImage("LinkLeft4.png");
    private GreenfootImage run1rs = new GreenfootImage("LinkLeftStill.png");
    private GreenfootImage run1l = new GreenfootImage("LinkRight1.png");
    private GreenfootImage run2l = new GreenfootImage("LinkRight2.png");
    private GreenfootImage run3l = new GreenfootImage("LinkRight3.png");
    private GreenfootImage run4l = new GreenfootImage("LinkRight4.png");
    private GreenfootImage run1ls = new GreenfootImage("LinkRightStill.png");
    private int frame = 0;
    private int animationCounter = 0;
    
    public void act() 
       {
        moving();
        eat();
        fall();
        checkFall();
        exit();
        platformAbove();
       }    
    
    public void moving()
       {
        if(Greenfoot.isKeyDown("Left"))
        {
            speed = -4;
            moveLeft();
        }
        
        if(Greenfoot.isKeyDown("Right"))
        {
            speed = 4;
            moveRight();
        }
        
        if(Greenfoot.isKeyDown("up") && jumping == false)
        {
            jump();
        }
       
       }
        
    public void moveLeft()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 5 == 0)
        {
            animateLeft();
        }
        else
        {
            setImage(standing);
        }
    }
    
    public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 5 == 0)
        {
            animateRight();
        }
        else
        {
            setImage(standing);
        }
    }
    
    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall(); 
    }

    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(run1ls);
        }
        else if(frame == 4)
        {
            setImage(run1l);
        }
        else if(frame == 7)
        {
            setImage(run2l);
        }
        else if(frame == 10)
        {
            setImage(run3l);            
        }
        else if(frame == 13)
        {
            setImage(run4l);
            frame = 0;
            return;
        }
        frame++;
    }
    
    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(run1rs);
        }
        else if(frame == 4)
        {
            setImage(run1r);
        }
        else if(frame == 7)
        {
            setImage(run2r);
        }
        else if(frame == 10)
        {
            setImage(run3r);            
        }
        else if(frame == 13)
        {
            setImage(run4r);
            frame = 0;
            return;
        }
        frame++;
    } 
    
        
    public void eat()
       {
        Actor heart;
        heart = getOneObjectAtOffset(0,0,Heart.class);
     
        if( heart != null)
           {
            World world;
            world = getWorld();
            world.removeObject(heart); 
            score = score + 1;
           
            getWorld().addObject(new Heart(), Greenfoot.getRandomNumber(getWorld().getWidth()),
            Greenfoot.getRandomNumber(getWorld().getHeight()-60));

           }  
           
       }
       
    public void fall()
       {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
           {
            vSpeed = vSpeed + acceleration;
           }
           jumping = true;
       }
    
    public void moveToGround(Actor ground)
       {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
       }
    
    public boolean onGround()
       {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Stage.class);
        if(ground == null)
           {
            jumping = true;
            return false;
           }
        else
           {
            moveToGround(ground);
            return true;
           }
       }
       
    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, Stage.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    
    public void checkFall()
       {
        if(onGround())
           {
            vSpeed = 0;
           }
        else
           {
            fall();
           }
       }
       
     public void exit() // If Player has the key, they can open the door.
    {
        if (getX() == getWorld().getWidth()-1) Greenfoot.setWorld(new RightWorld());
        if (getX() == getWorld().getWidth()-600) Greenfoot.setWorld(new LeftWorld());
       
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
       
        
        public int getScore()
    {    
        return score;
    }  
}
