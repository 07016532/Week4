package NameCreator;

import java.util.Scanner;

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
		
		Scanner kboard = new Scanner(System.in);
		
		String surname;
		String forename;
		String motherName;
		String birthPlace;
		
		System.out.println("Welcome to the Star Wars name creator, please enter the following information");
		System.out.println("1. Your surname");
		surname = kboard.next();
		System.out.println("2. Your forename");
		forename = kboard.next();
		System.out.println("3. Your mother's maiden name");
		motherName = kboard.next();
		System.out.println("4. Your birthplace");
		birthPlace = kboard.next();
		
		Combiner firstName = new Combiner(surname, forename, 3, 2);
		Combiner lastName = new Combiner(motherName, birthPlace, 2, 3);
		System.out.println("Your star wars name is "+firstName.getFinalName()+" "+lastName.getFinalName());
		
		kboard.close();
		
	}

}
