import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.util.ArrayList;


public class RockCritterRunner
{
   public static void main()
   {
    ActorWorld world = new ActorWorld(); //grid);
    RockCritter rc1 = new RockCritter();

        world.add(new Location(5,5),rc1);
        world.add(new Location(4,4),new Flower());
        world.add(new Location(4,5),new Rock());
        world.add(new Location(4,6),new Flower());
        world.add(new Location(5,4),new Bug());
        world.add(new Location(5,6),new Rock());
        world.add(new Location(6,4),new Bug());   
        world.add(new Location(6,5),new Rock());
        world.add(new Location(6,6),new Rock());        
        world.show();
   }
}