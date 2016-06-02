import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Link extends Actor implements Gravity
   {
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 0;
    private int direction = 1;
    int score = 0;
    private boolean jumping;
    private int jumpStrength = 16;
    
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
        Dead();
       } // end act
    
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
       
       } // end move
        
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
       } // end move left
    
    public void moveRight()
       {
        setLocation(getX()+speed, getY());
        
        if(animationCounter % 5 == 0)
           {
            animateRight();
           } // end if 
        else
           {
            setImage(standing);
           } // end else
           
       } // end moveright
    
    public void jump()
       {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall(); 
       } // end jump

    public void animateRight()
       {
        if(frame == 1)
           {
            setImage(run1ls);
           } // end frame 1
        else if(frame == 4)
           {
            setImage(run1l);
           } // end frame 4
        else if(frame == 7)
           {
            setImage(run2l);
           } // end frame 7
        else if(frame == 10)
           {
            setImage(run3l);            
           } // end frame 10
        else if(frame == 13)
           {
            setImage(run4l);
            frame = 0;
            return;
           } // end frame 13
        frame++;
        
       }// end animate right
    
    public void animateLeft()
       {
        if(frame == 1)
           {
            setImage(run1rs);
           } // end frame 1
        else if(frame == 4)
           {
            setImage(run1r);
           } // end frame 4
        else if(frame == 7)
           {
            setImage(run2r);
           } // end fram 7
        else if(frame == 10)
           {
            setImage(run3r);            
           } // end frame 10
        else if(frame == 13)
           {
            setImage(run4r);
            frame = 0;
            return;
           } // end frame 13
        frame++;
    } // end animate left
    
    public void Dead()
       {
        Actor Enemy;
        Enemy = getOneObjectAtOffset(0,0,Enemy.class);
        
        if (getY() >= getWorld().getHeight() - 15)
           {
            Greenfoot.stop();
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
           } // end for  
        else if(Enemy != null)
           {
            Greenfoot.stop();
            getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);   
           }
       } // end
        
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

           }   // end if 
           
       } // end eat
       
       
    public void fall()
       {
        setLocation(getX(), getY() + vSpeed);
        
        if(vSpeed <= 9)
           {
            vSpeed = vSpeed + acceleration;
           }
           
        jumping = true;
       } // end fall
       
    public void moveToGround(Actor ground)
       {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
       } // end move to 
       
    public boolean onGround()
       {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        
        if(ground == null)
           {
            jumping = true;
            return false;
           }// end if
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
           }
        else
           {
            fall();
           }
       } // end checkfall

    public int getScore()
       {    
        return score;
       }  // end getscore
       
   } // end class
