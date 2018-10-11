package NameCreator;

public class Combiner {
	
	private Name mName1;
	private Name mName2;
	private String mFinalName;
	
	public Combiner(String name1, String name2, int letterLimit1, int letterLimit2) {	
		this.mName1 = new Name(name1, letterLimit1);
		this.mName2 = new Name(name2, letterLimit2);
		this.setFirst();
		this.setLast();
		setFinalName();
	}
	
	public void setFirst() {
		this.mName1.takeLetters();
	}
	
	public void setLast() {
		this.mName2.takeLetters();
	}
	
	public void setFinalName() {
		this.mFinalName = (this.mName1.getName())+(this.mName2.getName());
	}
	
	public String getFinalName() {
		return this.mFinalName;
	}
	
	public String testReturn1() {
		String test = mName1.getName();
		return test;
	}
	
	public String testReturn2() {
		String test = mName2.getName();
		return test;
	}
	
	
}
