import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import java.util.ArrayList;
import java.awt.Color;

/**
 * RockHound - removes all rocks from the list of neighbors.
 **/

public class RockHound extends Critter
{

    public RockHound()
    {
        setColor(Color.WHITE);   
    }

    public void processActors(ArrayList<Actor> actors)
    {
        
        for (Actor a : actors)
            if (a instanceof Rock)
                a.removeSelfFromGrid();                
    }
    

}
