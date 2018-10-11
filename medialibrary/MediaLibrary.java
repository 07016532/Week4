package medialibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MediaLibrary {
	
		private ArrayList<Media> library = new ArrayList<>();
	
		public MediaLibrary(){

			
		}
		
		//Add new object to array
		public void addMedia(Media newMedia){
			library.add(newMedia);
			for(int i = 0; i < library.size(); i++){
			}
		}
		
		//Run through arraylist and object to print details
		public void printMedia(){
			for(int i = 0; i < library.size(); i++){
				System.out.println(library.get(i).getName());
				System.out.println(library.get(i).getDescr());	
				}
		}
		
		//Searches array list (if library array -> objectAtIndex.getName().contains(name we're looking for)
		public void findMedia(String mediaSearch){
			for(int i = 0; i < library.size(); i++){
				if(library.get(i).getName().contains(mediaSearch)){
					System.out.println(library.get(i).getName());
					System.out.println(library.get(i).getDescr());
				}
			}
		}
		
		//Start of main
		public static void main(String [] args){
			Media mySong = new Media("Joseph","My new song");
			Media anotherSong = new Media("Charlie", "Probs somethin baroque");
			MediaLibrary test = new MediaLibrary();
			
			test.addMedia(mySong);
			test.addMedia(anotherSong);
			//test.findMedia("Joseph");
			test.printMedia();
		}
			
		
}