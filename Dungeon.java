
/**
 * Write a description of class Dungeon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dungeon implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Dungeon";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("It's dark and scary in here!");
	Thread.sleep(1000);
	System.out.println(getName() + "Runs into a moster and is eaten alive.");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	Thread.sleep(1000);
	return "Shop";
    }
}
