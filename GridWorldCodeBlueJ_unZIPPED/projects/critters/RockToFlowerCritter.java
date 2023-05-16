
/**
 * RockToFlowerCritter : Changes Rocks to Flowers
 */

import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class RockToFlowerCritter extends Critter
{
    public RockToFlowerCritter()
    {
        setColor(Color.GRAY);
    }
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
          if (a instanceof Rock)
          {
          // Long Way:
          // Location flowerLocation = a.getLocation();
          //  a.removeSelfFromGrid();
          //  Flower f = new Flower(this.getColor());
          //  f.putSelfInGrid(getGrid(),flowerLocation); 
            
          // Short Way:
            Flower f = new Flower(this.getColor());
            f.putSelfInGrid(getGrid(), a.getLocation());
              
          }
        }
    } // processActors
}  // RockToFlowerCritter



/*
 * 
 * 
            Location flowerLocation = a.getLocation();
            a.removeSelfFromGrid();
            Flower f = new Flower(this.getColor());
            f.putSelfInGrid(getGrid(),flowerLocation);
 */


