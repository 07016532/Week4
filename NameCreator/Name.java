package NameCreator;

public class Name {
	
	private String mName;
	private int mLetterNum;
	
	public Name(String name, int LetterNum) {
		mName = name;
		mLetterNum = LetterNum;
	}
	
	public void setName(String replaceName) {
		mName = replaceName;
	}
	
	//toString kind of replaces this
	public String getName() {
		return mName;
	}
	
	public void setLetterNum(int replaceNum) {
		mLetterNum = replaceNum;
	}
	
	public int getLetNum() {
		return mLetterNum;
	}
	
	public void takeLetters() {
		int letterNum = mLetterNum;								//Letters to take i.e. first 3 (int 3)
		char letter;												//Ready to hold each individual letter for charAt
		String letterString;										//Ready to convert char to string
		String stringHolder = "";								//Ready to hold full String eg. of first 3 letters
		for(int i = 0; i < letterNum; i++) {						//run loop from first letter to limit of letters to take eg. 3
			letter = mName.charAt(i);							
			letterString = Character.toString(letter);
			stringHolder = stringHolder.concat(letterString);
		}
		mName = stringHolder;									//Get name we need for the object to combine it into something
		
	}
	
	public String toString() {
		mName = ""+mName;
		return mName;
	}
	

}
