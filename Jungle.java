
/**
 * Write a description of class Jungle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jungle implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Jungle";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("So many vines and loud animal noises");
	Thread.sleep(1000);
	System.out.println(getName() + "is confronted by a giant ape.");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	return "Ruins";
    }
}
