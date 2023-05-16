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
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[]args)
    {
        ActorWorld world = new ActorWorld();
        //       world.add(new Bug());

        // for Part 3, pg 22 Question Set 5 
        Bug b = new Bug();
        world.add(b);

        // #4 (a)
        //b.putSelfInGrid(b.getGrid(),b.getLocation());  //  <-- run-time error!
        // #4 (b)
        //b.removeSelfFromGrid();
        //b.removeSelfFromGrid();  // <-- run-time error!
        //#4 (c) 
        /*
        Actor a = new Actor();
        world.add(a);
        Grid g = a.getGrid();
        a.removeSelfFromGrid();

        Bug b2 = new Bug();
        Location aLoc = new Location(2,2);
        b2.putSelfInGrid(g,new Location(aLoc.getRow(),aLoc.getCol()));
        a.putSelfInGrid(g,new Location(aLoc.getRow()+1,aLoc.getCol()+1));
         */
        //world.add(new Bug());        
        world.add(new Rock());
        world.show();
    }
}
