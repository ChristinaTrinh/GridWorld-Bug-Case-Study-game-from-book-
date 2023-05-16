
 
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs.
 * This class is not tested on the AP CS A and AB exams.
 */
public class CircleBugRunner
{
    public static void main(String[]args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug lavern = new CircleBug(1);
        lavern.setColor(Color.ORANGE);
        CircleBug shirley = new CircleBug(2);
        world.add(new Location(7, 8), lavern);
        world.add(new Location(5, 5), shirley);
        world.show();
    }
}



