
/**
 * Write a description of class Boss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boss implements Location
{
    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "Boss";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	System.out.println("it's too quite");
	Thread.sleep(1000);
	System.out.println("it's too dark for" + getName() + "to see!");
	Thread.sleep(1000);
	System.out.println("SKELETON FOR " + getName());
	Thread.sleep(1000);
	System.out.println("GAME OVER");
	Thread.sleep(1000);
	return "GameOver";
    }
}
