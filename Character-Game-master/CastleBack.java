import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastleBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleBack extends Actor
{   
    /**
     * 
     */
    public CastleBack()
    {
       GreenfootImage image = getImage();
       image.scale(image.getWidth() - 200, image.getHeight()-200);
       setImage(image);
    }
    /**
     * Act - do whatever the CastleBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
