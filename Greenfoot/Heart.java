import greenfoot.*;  

public class Heart extends Interactives
   {
    private int vSpeed = 0;
    private int acceleration = 1;
    private int speed = 4;
    
    public void act() 
       {
        fall();
        checkFall();
        
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
   }
