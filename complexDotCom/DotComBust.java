package complexDotCom;

import java.util.ArrayList;

public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList <DotCom> dotComsList = new ArrayList <DotCom>();	//arraylist holding dotcom objects
	private int numOfGuesses = 0;
	
	/*
	 This method initialises DotCom objects, sets their name and adds them to the dotcom list arraylist.
	 It also sets the location by calling on the helper class methods
	 */
	public void setUpGame() {
		
		DotCom dot1 = new DotCom();
		dot1.setName("Google.com");
		
		DotCom dot2 = new DotCom();
		dot2.setName("Amazon.com");
		
		DotCom dot3 = new DotCom();
		dot3.setName("Yahoo.com");
		
		dotComsList.add(dot1);
		dotComsList.add(dot2);
		dotComsList.add(dot3);

		System.out.println("Try to destroy 3 dot coms!");
		System.out.println("Google.com, Amazon.com, Yahoo.com");
		
		for(DotCom dotComToSet : dotComsList) {							//For each dot com object stored in the array
			ArrayList<String> newLocation = helper.placeDotCom(3);		//Create arraylist called new location to get 3 coordinates
			dotComToSet.setLocationCells(newLocation);					//dotComToSet gets a location, which means the object its "at" in the for loop is equal to that
		}
		
	}
	
	public void startPlaying() {
		while(!dotComsList.isEmpty()) {								//while dotcom arraylist still has unremoved dotcoms
			String guess = helper.getUserInput("Enter a guess");		//guess = user input but through helper class
			CheckUserGuess(guess);									//Run checkuserguess with returned value
		}
		finishGame();												
	}
	
	public void CheckUserGuess(String guess) {						
		numOfGuesses++;
		String result = "miss";										//default is miss to be changed throughout if necessary
		for(DotCom dotComToTest : dotComsList) {						//for each dotcomlist object
			result = dotComToTest.checkYourself(guess);				//whichever object currently "at", run checkyourself method 
			if(result.equals("hit")) {								//remember - checkyourself returns result
				break;
			}
			if(result.equals("Kill")) {
				dotComsList.remove(dotComToTest);					//remove the object currently "at"
				result = "That was a killing hit";
				break;
			}
		}
		System.out.println(result);
	}
	
	public void finishGame() {
		System.out.println("All Dot Coms have been killed");
		if(numOfGuesses <= 18) {
			System.out.println("You only needed "+numOfGuesses+" guesses");
			System.out.println("Well Done!");
		}else {
			System.out.println("You took "+numOfGuesses+" guesses");
			System.out.println("...could've done better");
		}
	}
	
	public static void main(String [] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
