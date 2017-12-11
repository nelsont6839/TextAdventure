import java.util.Scanner;

/**
 * Starting location for a school based text adventure game
 * @author Sean Stern
 * @version 1.0
 * @see AdventureForSoftwareEngineering
 */
public class ApartmentWakeUp implements Location{

    private int timeHr = 4;
    private String month = "September";
    private int day = 8;

    @Override
    public String getName(){
	// Location name will match class name for convenience
	return "ApartmentWakeUp";
    }

    @Override
    public String enter(Player p) throws InterruptedException{
	
	 decideToGetUp(p);

	String nextLocationName;
      if(timeHr > 8){
	    // After 8:30 MT, you're going to be late :-(
	    int hrsLate = timeHr - 1;
	    int ptsOff = hrsLate * 20;
 	    System.out.format("\n##\n##RUNNING %d HRS LATE.\n" +
			      "##LOSE %d HEALTH!\n##\n\n", hrsLate, ptsOff);
	    p.changeHealth(ptsOff);
	    Thread.sleep(1000);
	    System.out.println("'Oh gosh, I'm late. I won't be able to take a quest!'");
	    Thread.sleep(1000);
	    System.out.println("'I should get my clothes and dagger...'");
	    Thread.sleep(1000);
	    System.out.println("'And head to the Capital'");
	    Thread.sleep(1000);
	    nextLocationName = "Capital";
	}
	else if(timeHr > 6){
	    // After 6:30 MT, you have just enough time to go
	    System.out.println("'Ugh morning already?'");
	    Thread.sleep(1000);
	    System.out.println("'Ugh morning already?'");
	    Thread.sleep(1000);
	    System.out.println("'I should get my dagger...'");
            Thread.sleep(1000);
            // TBD: Create inventory items including cash, keys, phone
            // and add this to player inventory for future locations
            // e.g.
            // Item bills = new Money("Money", 20);
            // Item keys = new Keys("Keys", 5);
            // Item phone = new Phone("Phone");
	    nextLocationName = "Capital";
	}
	else{
	    // 6:30 MT or earlier, enough time to shower, eat, grab
            // all stuff
	    System.out.println("'It's pretty early maybe I should work out...'");
	    Thread.sleep(1000);
	    System.out.println("'...Ah, that's one...Two...Three...four'");
	    Thread.sleep(1000);
	    System.out.println("'Let's get dressed...'");
	    Thread.sleep(1000);
	    System.out.println("'LETS GO!'");
            Thread.sleep(1000);
            System.out.println("'Wait... I forgot my dagger" +
			       "'");
	    Thread.sleep(1000);
            // TBD: Create inventory items including cash, keys, phone,
            // student quizzes this to player inventory for future
	    // locations
            // e.g.
            // Item bills = new Money("Money", 20);
            // Item keys = new Keys("Keys", 5);
            // Item phone = new Phone("Phone");
	    // Item quizzes = new Quizzes("Quiz", 28);
	    nextLocationName = "Capital";
	}

	// Before leaving the location, always 
        //  -check if we've hit game over (player is dead)
        //  -update the day and time for the next time player enters
	if(p.getHealth() <= 0){
	    nextLocationName = "GameOver";
	}
	timeHr = 4;
	day++;
        // TBD: update month correctly

	return nextLocationName;
    }

    private void decideToGetUp(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);

	String sound = "beep!";
	for(int i = 0; i < 2; i++){
	    System.out.println();
	    for(int j = 0; j < 3; j++){
		System.out.println(sound);
		// Pauses command line for 750 ms (0.75 sec)
		Thread.sleep(750);
	    }
	    System.out.print("\n**\n** Press [enter] TO CONTINUE\n**\n> ");
	    // Pauses command line until user hits enter
	    sc.nextLine();
            sound = sound.toUpperCase();
	    Thread.sleep(1000);
	}
        
        System.out.format("\n%d:30 (MT) on %s %d.\n", timeHr, month, day );
	Thread.sleep(1000);
        System.out.println("I'm exhausted.'");
        Thread.sleep(1000);

	String options = "sdw";
        int selectedIdx = -1;
        while(!(selectedIdx >= 0)){
	    System.out.print("**\n**[s] TO SNOOZE\n**[d] TO DISMISS\n"+
			     "**[w] TO WAKE UP\n**\n> ");
            String userInput = sc.next();
	    Thread.sleep(1000);
	    selectedIdx = options.indexOf(userInput);
            if(selectedIdx == 0){
                snooze(p);
	    }
	    else if(selectedIdx == 1){
		dismiss(p);
	    }
        }
    }

    private void snooze(Player p) throws InterruptedException{
	timeHr+=1;
	// Snoozing gives 10 health points
        p.changeHealth(10);
	System.out.println("\n##\n##SNOOZING ALARM.\n##GAINED 10 HEALTH!\n" + 
			   "##\n");
	Thread.sleep(1000);
	decideToGetUp(p);
    }

    private void dismiss(Player p) throws InterruptedException{
        timeHr+=2;
	// Dismissing gives 20 health points  
        p.changeHealth(20);
	System.out.println("\n##\n##DISMISSING ALARM.\n##GAINED 20 HEALTH!\n" +
			   "##\n");
	Thread.sleep(1000);
	decideToGetUp(p);
    }
    
    
    
}