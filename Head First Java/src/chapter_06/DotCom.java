package chapter_06;

import java.util.*;

public class DotCom {
	
	//DotCom's instance variables.
    private ArrayList<String> locationCells;
	private String name;
	    
	//A setter method that updates the DotCom's location.
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
		
	//Basic setter method.
    public void setName(String string) {
        name = string;
    }
	    
    public String checkYourself(String userInput) {
        String result = "miss";
		//If the user guess is one of the entries in the ArrayList, indexOf() will return its ArrayList location index or -1 if not found.
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
			//Delete an entry in the ArrayList.
            locationCells.remove(index);
			//Check to see if all the locations have been guessed.
            if (locationCells.isEmpty()) {
                result = "kill";
				System.out.println("Ouch! You sunk " + name);
            } else {
                result = "hit";
            }
        }
		//Return 'miss', 'hit' or 'kill'.
        return result;
    }
}
