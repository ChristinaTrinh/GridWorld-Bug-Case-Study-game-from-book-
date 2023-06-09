/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;

import java.awt.Color;

/**
 * This class runs a world that contains chameleon critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ChameleonRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(2, 8), new Rock(Color.BLUE));
        world.add(new Location(5, 5), new Rock(Color.PINK));
        world.add(new Location(1, 5), new Rock(Color.RED));
        world.add(new Location(7, 2), new Rock(Color.YELLOW));
        world.add(new Location(4, 4), new ChameleonCritter());
        world.add(new Location(5, 8), new ChameleonCritter());
        
        
        world.add(new Location(0,0), new Bug());        
/*        
        //  --------------  Part 4 Ex 2 - 6 ------------
        //  NOTE: Ex 1 is inside of ChameleonCritter itself.
        // Ex 2
        world.add(new Location(5,0), new ChameleonKid());
        world.add(new Location(4,0), new Actor());        
        
        // Ex 3
        world.add(new Location(1,1), new RockHound());    
        world.add(new Location(0,1), new Rock(Color.PINK));
        world.add(new Location(2, 1), new Rock(Color.RED));
        
        // Ex 4
        // See Solutions
        
*/        
        
        world.show();
    }
}