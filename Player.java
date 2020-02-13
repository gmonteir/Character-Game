
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Collision
{
    float speed = 4;
    float vSpeed = 0;
    float acceleration = 0.5f;
    float jumpPower = 8;
    int rightFrame = 1;
    int leftFrame = 1;
    int animationCounter = 0;
    boolean isJumping = false;
    
    GreenfootImage img;
    
    GreenfootImage walk1R = new GreenfootImage("walk1.png");
    GreenfootImage walk2R = new GreenfootImage("walk2.png");
    GreenfootImage walk3R = new GreenfootImage("walk3.png");
    GreenfootImage walk4R = new GreenfootImage("walk4.png");
    GreenfootImage walk5R = new GreenfootImage("walk5.png");
    GreenfootImage walk6R = new GreenfootImage("walk6.png");
    GreenfootImage walk7R = new GreenfootImage("walk7.png");
    GreenfootImage walk8R = new GreenfootImage("walk8.png");
    GreenfootImage walk9R = new GreenfootImage("walk9.png");
    GreenfootImage walk10R = new GreenfootImage("walk10.png");
    
    GreenfootImage walk1L = new GreenfootImage("walk1.png");
    GreenfootImage walk2L = new GreenfootImage("walk2.png");
    GreenfootImage walk3L = new GreenfootImage("walk3.png");
    GreenfootImage walk4L = new GreenfootImage("walk4.png");
    GreenfootImage walk5L = new GreenfootImage("walk5.png");
    GreenfootImage walk6L = new GreenfootImage("walk6.png");
    GreenfootImage walk7L = new GreenfootImage("walk7.png");
    GreenfootImage walk8L = new GreenfootImage("walk8.png");
    GreenfootImage walk9L = new GreenfootImage("walk9.png");
    GreenfootImage walk10L = new GreenfootImage("walk10.png");
    
    public Player()
    {
        walk1L.mirrorHorizontally();
        walk2L.mirrorHorizontally();
        walk3L.mirrorHorizontally();
        walk4L.mirrorHorizontally();
        walk5L.mirrorHorizontally();
        walk6L.mirrorHorizontally();
        walk7L.mirrorHorizontally();
        walk8L.mirrorHorizontally();
        walk9L.mirrorHorizontally();
        walk10L.mirrorHorizontally();
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        animationCounter++;
    }
    
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        if (Greenfoot.isKeyDown("up") && !isJumping)
        {
            jump();
            isJumping = true;
        }
    }
    
    public void checkFall()
    {
        if (onGround())
        {
            vSpeed = 0;
            isJumping = false;
        }
        else
        {
            fall();
        }
    }
    
    public void moveLeft()
    {
        setLocation((int)(getX() - speed), getY());
        
        if (animationCounter % 8 == 0)
        {
            animateLeft();
        }
    }
    
    public void moveRight()
    {
        setLocation((int)(getX() + speed), getY());
        
        if (animationCounter % 8 == 0)
        {
            animateRight();
        }
    }
    
    public void jump()
    {
        vSpeed = -jumpPower;
        fall();
    }
    
    public boolean onGround()
    {
        Actor under = getOneTouchedObject(Ground.class);
        return under != null;
    }
    
    public void fall()
    {
        setLocation(getX(), (int)(getY() + vSpeed));
        vSpeed = vSpeed + acceleration;
    }
    
    public void animateLeft()
    {
        if (leftFrame == 1)
        {
            setImage(walk1L);
        }
        else if (leftFrame == 2)
        {
            setImage(walk2L);
        }
        else if (leftFrame == 3)
        {
            setImage(walk3L);
        }
        else if (leftFrame == 4)
        {
            setImage(walk4L);
        }
        else if (leftFrame == 5)
        {
            setImage(walk5L);
        }
        else if (leftFrame == 6)
        {
            setImage(walk6L);
        }
        else if (leftFrame == 7)
        {
            setImage(walk7L);
        }
        else if (leftFrame == 8)
        {
            setImage(walk8L);
        }
        else if (leftFrame == 9)
        {
            setImage(walk9L);
        }
        else if (leftFrame == 10)
        {
            setImage(walk10L);
            leftFrame = 1;
            return;
        }
        
        leftFrame++;
    }
    
    public void animateRight()
    {
        if (rightFrame == 1)
        {
            setImage(walk1R);
        }
        else if (rightFrame == 2)
        {
            setImage(walk2R);
        }
        else if (rightFrame == 3)
        {
            setImage(walk3R);
        }
        else if (rightFrame == 4)
        {
            setImage(walk4R);
        }
        else if (rightFrame == 5)
        {
            setImage(walk5R);
        }
        else if (rightFrame == 6)
        {
            setImage(walk6R);
        }
        else if (rightFrame == 7)
        {
            setImage(walk7R);
        }
        else if (rightFrame == 8)
        {
            setImage(walk8R);
        }
        else if (rightFrame == 9)
        {
            setImage(walk9R);
        }
        else if (rightFrame == 10)
        {
            setImage(walk10R);
            rightFrame = 1;
            return;
        }
        
        rightFrame++;
    }
}
