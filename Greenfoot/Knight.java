import greenfoot.*;  

public class Knight extends Actor
   {
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;
    
    private GreenfootImage GoLeft = new GreenfootImage("KnightLeft.png");
    private GreenfootImage GoRight = new GreenfootImage("KnightRight.png");
    
    public void act() 
       {
        moving();
        eat();
        fall();
        checkFall();
        UpLadder();
        DownLadder();
       }    
    
    public void moving()
       {
        if(Greenfoot.isKeyDown("d"))
           {
            move(6); 
            setImage(GoRight); 
           }
        if(Greenfoot.isKeyDown("a"))
           {
            move(-6);    
            setImage(GoLeft);
           }   
        }
   
    public void UpLadder()
       {
        Actor ladder;
        ladder = getOneObjectAtOffset(0, 0, Ladder.class);
        if (ladder != null)
           {
            if (Greenfoot.isKeyDown("up"))
               {
                setLocation(getX(), getY() - 10);
                setLocation(getX(), getY() - 5);
                setLocation(getX(), getY() - 10);
               }
            if (Greenfoot.isKeyDown("down"))
               {
                setLocation(getX(), getY() + 10);
                setLocation(getX(), getY() + 5);
                setLocation(getX(), getY() + 10);
               }
           }   
       }    
       
    public void AvoidFloor()
      {
       Actor Floor; 
       Floor = getOneObjectAtOffset(0, 0, Floor.class);
       if (Floor != null)
          {
           if (Greenfoot.isKeyDown("up"))
               {
                setLocation(getX(), getY() - 10);
                setLocation(getX(), getY() - 5);
                setLocation(getX(), getY() - 10);
               }
           if (Greenfoot.isKeyDown("down"))
               {
                setLocation(getX(), getY() + 10);
                setLocation(getX(), getY() + 5);
                setLocation(getX(), getY() + 10);
               } 
          }   
       
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
       }
    
    public void moveToGround(Actor ground)
       {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
       }
    
    public boolean onGround()
       {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Floor.class);
        if(ground == null)
           {
            return false;
           }
        else
           {
            moveToGround(ground);
            return true;
           }
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
       
    public void DownLadder()
       {
        Actor ladder;
        ladder = getOneObjectAtOffset(0, 0, Ladder.class);
        if (ladder != null)
           {
            setLocation(getX(), getY() + vSpeed);
            if(vSpeed <=9)
              {
               vSpeed = vSpeed + acceleration;
              }
           }
        }
        
   }
