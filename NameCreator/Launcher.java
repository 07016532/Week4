package NameCreator;

public class Launcher {
	
	/*
	  	To generate your Star Wars first name:

		Take the first three letters of your last name
		Add to the first two letters of your first name
		To generate your Star Wars surname:

		Take the first two letter of your mother's maiden name
		Add to the first three letters of your place of birth.

	 
	 */
	
	public static void main(String [] args) {
		
		Combiner firstName = new Combiner("Sweeney", "Joseph", 3, 2);
		Combiner lastName = new Combiner("Watts", "Halifax", 2, 3);
		System.out.println("Your star wars name is "+firstName.getFinalName()+" "+lastName.getFinalName());
		
	}

}
