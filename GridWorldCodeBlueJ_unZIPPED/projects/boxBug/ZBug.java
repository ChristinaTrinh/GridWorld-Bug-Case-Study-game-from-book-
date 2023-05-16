import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
/**
* A ZBug traces out a Z pattern of a given size.
*/

public class ZBug extends Bug {
private int segmentLength; // the number of flowers in each segment
private int steps; // the number of steps in the current side
private int segment; // which segment of the Z the ZBug is on
/**
* Constructs a Zbug that traces a Z pattern in which each segment
* of the Z has the given length
* When the Z is drawn, the ZBug stops.
* @param length the segment length
*/

    public ZBug(int length)
    {
        setDirection(Location.EAST);
        steps = 0;
        segment = 1;
        segmentLength = length;
    }
    public void act()
    {
        if (segment <= 3 && steps < segmentLength) {
            if (canMove()) {
                move();
                steps++;
            }
        } else if (segment == 1) {
            setDirection(Location.SOUTHWEST);
            steps = 0;
            segment++;
        } else if (segment == 2) {
            setDirection(Location.EAST);
            steps = 0;
            segment++;
        } 
        
     }

}