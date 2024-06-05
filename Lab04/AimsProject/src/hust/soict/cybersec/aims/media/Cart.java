package hust.soict.cybersec.aims.media;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	// Create addMedia, removeMedia
	public void addMedia(Media media) { // use contain() method to ensure that a similar object is not added to the list
		if (!itemsOrdered.contains(media)) { // contains()-check a variety if conditions in order to confirm that 2 tracks are identical
			itemsOrdered.add(media);
		
		}
		else {
			System.out.println("The media is already in the items");
		}
	}
			
		
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}
		else {
			System.out.println("The media is not in the items");
		}
		
	}
	
	public double totalCost() { // compute the total of money must be paid
		double sum = 0.0;  // initialize 
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i) != null) {
				sum += itemsOrdered.get(i).getCost();
			}
		}
		return sum;
	}
	//Create a new method to print the list of ordered items of a cart, the price of each item, and the total price
	public void print() {
		System.out.println("**************CART************");
		System.out.println("Ordered items:");
		if (itemsOrdered != null) {
			
			for (int i = 0; i < itemsOrdered.size(); i++) {
				if (itemsOrdered.get(i) != null) {
					
					System.out.println((i+1) + "." + itemsOrdered.get(i).toString());
				}
			}
			System.out.printf("Total cost: %.2f",totalCost());
		}else {
			System.out.println("No disc ordered");
		}
		
		System.out.println();
		System.out.println("******************************");
		
	}
	// Search by title method
	public Media searchByTitle(String title) {
		Media item = null;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i) != null && itemsOrdered.get(i).isMatch(title)) {
				return itemsOrdered.get(i);
			}
		}
		
		System.out.println("The disc is not found");
		return item;
			
	}
	public Media searchId(int Id){
		Media item = null;
		for (int i = 0; i < itemsOrdered.size(); i++){
			if (itemsOrdered.get(i).getId() == Id){
				return itemsOrdered.get(i);
			}
		}
		System.out.println("No items found");
		return item;
	}
	
}
