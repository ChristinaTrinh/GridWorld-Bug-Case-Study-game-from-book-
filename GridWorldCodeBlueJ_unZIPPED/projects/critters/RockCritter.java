
/**
 * RockCritter:  Eats / Gets rid of any rocks around it.
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

public class RockCritter extends Critter
{
    public RockCritter()
    {
        setColor(Color.GRAY);
    }
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Rock)
                a.removeSelfFromGrid();
        }
    } // processActors
}  // RockCritter



