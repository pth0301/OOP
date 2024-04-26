package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class StoreTest {
	// Test 2 methods addDVD and removeDVD
	public static void main(String[] args) {
		Store st = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		st.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		st.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		st.addDVD(dvd3);
		st.print();
	}
}
