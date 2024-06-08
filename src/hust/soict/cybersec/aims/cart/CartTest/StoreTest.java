package hust.soict.cybersec.aims.cart.CartTest;

import hust.soict.cybersec.aims.cart.Cart.DigitalVideoDisc;
import hust.soict.cybersec.aims.cart.Cart.Store;

public class StoreTest {
	 public static void main(String[] args) {
	        Store store = new Store();
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f);
	        store.addMedia(dvd1);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star War", "Science Fiction", 24.95f);
	        store.addMedia(dvd2);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", 18.99f);
	        store.addMedia(dvd3);
	        store.print();
	    }
	}