package hust.soict.cybersec.aims.store;
import java.util.ArrayList;

import hust.soict.cybersec.aims.media.Media;


public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsInStore(){
		return itemsInStore;
	}
	public void addMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			
			itemsInStore.add(media);	
		}
		else {
			
			System.out.println("The media has been added.");
		}
	}
	public void removeDVD(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
		}
		else {
			
			System.out.println("The media has been removed.");
		}
	}
	public void print() {
		if (itemsInStore != null) {
			
			for (int i = 0; i < itemsInStore.size(); i++) {
				if (itemsInStore.get(i) != null) {
					
					System.out.println(itemsInStore.get(i));
				}
			}
		}
	}
	
	public Media searchByTitle(String title){
		Media item = null;
		for (int i = 0; i < itemsInStore.size(); i++){
			if (itemsInStore.get(i).isMatch(title)){
				return itemsInStore.get(i);
			}
		}
		return item;
	}
}
