// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 280, 273);
        Worm worm =  new  Worm();
        addObject(worm, 475, 172);
        Worm worm2 =  new  Worm();
        addObject(worm2, 405, 416);
        Worm worm3 =  new  Worm();
        addObject(worm3, 178, 149);
        Worm worm4 =  new  Worm();
        addObject(worm4, 141, 409);
        Worm worm5 =  new  Worm();
        addObject(worm5, 127, 281);
        Worm worm6 =  new  Worm();
        addObject(worm6, 458, 322);
        worm.setLocation(378, 37);
        worm6.setLocation(470, 209);
        worm5.setLocation(78, 203);
        worm3.setLocation(272, 119);
        worm4.setLocation(85, 446);
        worm2.setLocation(421, 496);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 278, 516);
    }
}
