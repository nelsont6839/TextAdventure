
/**
 * Write a description of class Capital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Capital implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Capital";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("Ah, the city is so loud");
	p.changeHealth(100);
	Thread.sleep(1000);
	System.out.println(getName() + "so many people (Health: " + p.getHealth() + ")");
	Thread.sleep(1000);
	System.out.println("I" + getName() + "will go to the Jungle!");
	Thread.sleep(1000);
	return "Jungle";
    }
}
