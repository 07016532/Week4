package medialibrary;

public class Media {
	
	private String mName;
	private String mDescription;
	
	public Media(String name, String descr){
		mName = name;
		mDescription = descr;
	}
	
	public void setName(String newName){
		mName = newName;
	}
	
	public void setDescr(String newDescr){
		mDescription = newDescr;
	}
	
	public String getName(){
		return mName;
	}
	
	public String getDescr(){
		return mDescription;
	}
	
	
	
}
