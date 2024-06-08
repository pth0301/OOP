package hust.soict.cybersec.aims.cart.Cart;

import java.util.ArrayList;
import java.util.List;

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
	public void input() {
        
        addMedia(new Book(1, "Calculate", "Education", 78.0f));
        addMedia(new Book(2, "Computer Architecture", "Education", 10.0f));
        addMedia(new Book(3, "Data Structures", "Education", 35.0f));
        addMedia(new Book(4, "Databases", "Education", 88.0f));
        addMedia(new Book(5, "Machine Learning", "Education", 45.0f));
        addMedia(new Book(6, "Speaking", "English", 22.5f));
        addMedia(new Book(7, "Listening", "Engllish", 29.7f));
        addMedia(new Book(8, "Writing", "English", 50.0f));

        // DigitalVideoDisc
        addMedia(new DigitalVideoDisc(1, "The Matrix", "Action", 45.0f));
        addMedia(new DigitalVideoDisc(2, "Inception", "Sci-Fi", 42.0f));
        addMedia(new DigitalVideoDisc(3, "Forrest Gump", "Drama", 40.0f));
        addMedia(new DigitalVideoDisc(4, "The Godfather", "Crime", 44.0f));
        addMedia(new DigitalVideoDisc(5, "Pulp Fiction", "Crime", 41.0f));
        addMedia(new DigitalVideoDisc(6, "The Shawshank Redemption", "Drama", 43.0f));


        List<Track> tracks1 = new ArrayList<>();
        tracks1.add(new Track("Song 1", 0));
        tracks1.add(new Track("Song 2", 0));
        tracks1.add(new Track("Song 3", 0));
        CompactDisc cd1 = new CompactDisc(1, "Album A", "Pop", 24.9f, "Dua Lipa", tracks1);
        addMedia(cd1);

        List<Track> tracks2 = new ArrayList<>();
        tracks2.add(new Track("Project1", 9));
        tracks2.add(new Track("Story", 10));
        tracks2.add(new Track("Storytelling", 7));
        CompactDisc cd2 = new CompactDisc(2, "Album B", "Rock", 14.0f, "Justin Baber", tracks2);
        addMedia(cd2);

        
    }
}
	

