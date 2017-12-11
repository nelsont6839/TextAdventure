
/**
 * Write a description of class Ruins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ruins implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Ruins";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("A broken down city in front of you");
	Thread.sleep(1000);
	System.out.println(getName() + "is confronted by Banits");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	return "Dungeon";
    }
}
