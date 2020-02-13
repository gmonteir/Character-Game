import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class char1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class char1 extends Actor
{
    private String[] lvls;
    
    public char1(String[] levels, int lvl)
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() + 30, image.getHeight() + 30);
       setImage(image);
       int current = lvl;
    }
    /**
     * Act - do whatever the char1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        
    }
    public void jump()
    {
        
    }
    
    public void nextArea()
    {
        if(getX() == getWorld().getWidth() - 1)
        {
            
        }
        else if (getX() == 1)
        {
            
        }
    }
}
