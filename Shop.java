
/**
 * Write a description of class Shop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shop implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Shop";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("So many items to choose from");
	Thread.sleep(1000);
	System.out.println(getName() + "buys a potion");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	Thread.sleep(1000);
	return "ARENA";
    }
}
