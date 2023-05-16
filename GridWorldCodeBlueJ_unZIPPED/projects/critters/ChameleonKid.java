import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;
import info.gridworld.grid.Grid;

/**
 * ChameleonKid - >>>>>> Mr. Marques' version! <<<<<
 * 
*/

public class ChameleonKid extends ChameleonCritter
{

    public ChameleonKid()
    {
        setColor(Color.YELLOW);    
    }
    
    public ArrayList<Actor> getActors()
    {
    ArrayList<Actor> actors = new ArrayList<Actor>();
    Grid<Actor> g = getGrid();
    Actor a;

        Location loc = getLocation();    
        Location locFront = loc.getAdjacentLocation(getDirection() + Location.AHEAD);
        Location locBehind = loc.getAdjacentLocation(getDirection() + Location.HALF_CIRCLE);
        
        if (g.isValid(locFront)) {
            a = g.get(locFront);
            if (a != null)
                actors.add(a);
        }
        if (g.isValid(locBehind)) {
            a = g.get(locBehind);
            if (a != null)
                actors.add(a);
        }        

        return actors;    
    }
    
}


