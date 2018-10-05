package NameCreator;

public class Combiner {
	
	private Name mName1;
	private Name mName2;
	private String mFinalName;
	
	public Combiner(String name1, String name2, int letterLimit1, int letterLimit2) {	
		mName1 = new Name(name1, letterLimit1);
		mName2 = new Name(name2, letterLimit2);
		mName1.takeLetters();
		mName2.takeLetters();	
	}
	
	public void setFinalName() {
		String finalName = mName1.toString();
		mFinalName = mFinalName.concat(mName2.toString());
	}
	
	public String getFinalName() {
		return mFinalName;
	}
	
	
}
