import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingArea extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public StartingArea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        String[] lvls = {"fpath3", "fpath2", "fpath1", "StartingArea", "Area2", "CastleGate", "Castle"};
        addObject(new back1(), 300, 200);
        addObject(new road(), 300, 400);
        addObject(new char1(lvls, 3), 300, 310);
        addObject(new char2(), 500, 310);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
