import java.util.ArrayList;
import java.util.List;

/**
 * Implementaiton of text adventure game involving a first year teacher
 * starting at a new school teaching CS.
 * @author Sean Stern
 * @version 1.0
 */
public class AdventureForSoftwareEngineering implements Game{

    @Override
    public List<Location> getLocations(){
	List<Location> levels = new ArrayList<Location>();
	levels.add(new ApartmentWakeUp());
	levels.add(new Capital());
	levels.add(new Jungle());
	levels.add(new Ruins());
	levels.add(new Dungeon());
	levels.add(new Shop());
	levels.add(new ARENA());
	levels.add(new Boss());
	
	return levels;
    }

    @Override
    public Player getPlayer(){
	return new Teacher();
    }
}