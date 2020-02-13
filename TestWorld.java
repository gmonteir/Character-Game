import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld extends World
{

    /**
     * Constructor for objects of class TestWorld.
     * 
     */
    public TestWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Player(), getWidth() / 2, getHeight() / 2);
        addObject(new Ground(), getWidth() / 2, getHeight() / 2 + 130);
        setPaintOrder(Player.class, Ground.class);
    }
}
