package complexDotCom;

import java.util.ArrayList;

public class DotCom {
	
	private ArrayList<String> locationCells;
	private String mName;
	
	//
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);	//Checks array list indexes to see if it matches input
		
		if(index >= 0) {									//Returns index number of match, or -1 if no match
			locationCells.remove(index);					//Remove the index if it matches
			
			if(locationCells.isEmpty()) {				//if the arraylist is empty
				result = "kill";
				System.out.println("You sunk "+mName);
			
			}else {
				result = "hit";
			}
		
		}
		return result;
	}
	
	//Takes Arraylist parameter from ...
	public void setLocationCells(ArrayList<String> newLocation) {
		locationCells = newLocation;
	}
	
	public void setName(String name) {
		mName = name;
	}

}
