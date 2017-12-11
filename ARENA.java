
/**
 * Write a description of class ARENA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ARENA implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "ARENA";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("A challenger has appeared.");
	Thread.sleep(1000);
	System.out.println(getName() + "is confronted the challenger");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	Thread.sleep(1000);
	return "Boss";
    }
}
