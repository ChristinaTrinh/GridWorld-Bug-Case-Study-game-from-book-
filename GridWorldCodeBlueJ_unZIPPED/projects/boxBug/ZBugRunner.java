import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner
{
   public static void main(String[]args)
   {
    UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
    ActorWorld world = new ActorWorld(grid);
    ZBug zb = new ZBug(7);
    world.add(new Location(3,5),zb);
    world.show();
   }
}