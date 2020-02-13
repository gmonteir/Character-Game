import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastleGate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleGate extends World
{

    /**
     * Constructor for objects of class CastleGate.
     * 
     */
    public CastleGate(String[] lvls)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Gate(), 300, 200);
        addObject(new road(), 300, 400);
        addObject(new char1(lvls, 6), 300, 310);
        addObject(new char2(), 500, 310);
        
    }
}
