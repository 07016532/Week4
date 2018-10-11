package JavaLib1Strings;

public class Launcher {
	
	public static void main(String [] args) {
		
		String list = "Giraffe,bear,tiger";
		printList(seperator(list));
	}
	
	
	public static String [] seperator(String commaList) {
		String[] seperatedList = commaList.split(",");
		return seperatedList;
	}
	
	public static void printList(String [] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
