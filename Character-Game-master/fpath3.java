import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fpath3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fpath3 extends World
{

    /**
     * Constructor for objects of class fpath3.
     * 
     */
    public fpath3(String[] lvls)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new fback3(), 300, 200);
        addObject(new road(), 300, 400);
        addObject(new char1(lvls, 0), 300, 310);
        addObject(new char2(), 500, 310);
        
    }
}
