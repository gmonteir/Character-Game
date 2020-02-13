import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class char2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class char2 extends Actor
{
    public char2()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() + 30, image.getHeight() + 30);
       setImage(image);   
    }
    /**
     * Act - do whatever the char2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Actor icon = new speak();
       icon.getImage().setTransparency(0);
       getWorld().addObject(icon, getX(), getY() - 75);
       if(isTouching(char1.class))
       {
           icon.getImage().setTransparency(100);
       }
       else if (!isTouching(char1.class))
       {
           icon.getImage().setTransparency(0);
       }
    }    
}
