package hust.soict.cybersec.aims.store;
import java.util.ArrayList;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Media;


public class Store {
	private int qtyDisc;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public int getQtyDisc() {
		return qtyDisc;
	}
	public void setQtyDisc(int qtyDisc) {
		this.qtyDisc = qtyDisc;
	}
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void setItemsInStore(ArrayList<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (!itemsInStore.contains(disc)) {
			
			itemsInStore.contains(disc);
			qtyDisc++;
		}
		else {
			
			System.out.println("The disc has been added.");
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		if (itemsInStore.contains(disc)) {
			itemsInStore.remove(disc);
			qtyDisc--;
			
			
		}
		else {
			
			System.out.println("The disc has been removed.");
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
	
}
