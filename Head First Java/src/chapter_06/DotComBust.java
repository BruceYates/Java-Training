package chapter_06;

import java.util.*;

public class DotComBust {
	//Declare and initialize the variables we'll need.
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

	public static void main(String[] args) {
		//Create the game object.
        DotComBust game = new DotComBust();
		//Tell the game object to set up the game.
        game.setUpGame();
		//Tell the game object to start the main game loop.
        game.startPlaying();
    }
		
    private void setUpGame() {
		//Make three DotCom objects, give them names, and stick them in the ArrayList.
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
	        
		//Print brief instructions for the user.
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
	        
		//Repeat with each DotCom in the list.
        for (DotCom dotComSet : dotComsList) {
			//Ask the helper for a DotCom location (an ArrayList of Strings).
            ArrayList<String> newLocation = helper.placeDotCom(3);
			//Call the setter method on this DotCom to give it the location you just got from the helper.
            dotComSet.setLocationCells(newLocation);
        }
    }	
	    
    private void startPlaying() {
		//As long as the DotCom list is NOT empty.
        while (!dotComsList.isEmpty()) {
			//Get user input.
            String userGuess = helper.getUserInput("Enter a guess");
			//Call our own checkUserGuess method.
            checkUserGuess(userGuess);
        }
		//Call our own finishGame method.
        finishGame();
    }
	    
    private void checkUserGuess(String userGuess) {
		//Increment the number of guesses the user has made.
        numOfGuesses++;
		//Assume it's a miss unless told otherwise.
        String result = "miss";
	        
        for (DotCom dotComToTest : dotComsList) {
			//Repeat with all DotComs in the list.
            result = dotComToTest.checkYourself(userGuess);
			//get out of the loop early, no point in testing the others
            if (result.equals("hit")) {
                break;
            }
			//This guys dead, so take him out of the DotComs list, then get out of the loop,
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
		//Print the results for the user.
        System.out.println(result);
    }
	    
    private void finishGame() {
		//Print a message telling the user how he did in the game.
        System.out.println("All Dot Coms are dead!  Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
}
