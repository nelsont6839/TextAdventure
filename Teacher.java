/**
 * Sample player for school based text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public class Teacher implements Player{
    
    @Override
    public int getHealth(){
        // Teachers are always 100% healthy
	return 100;
    }

    @Override
    public void changeHealth(int delta){
	// Teachers are always 100% healthy
        return;
    }

    @Override
    public Inventory getInventory(){
        // Teachers have nothing but their education to
        // make it through school
        return null; 
    }
}