package hust.soict.cybersec.aims.ManagerScreen;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Track;
import hust.soict.cybersec.aims.store.Store;

public class StoreMenu {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        CompactDisc cd2 = new CompactDisc("Star Wars", "Science Friction", "Director 1", "Artist 1");
        CompactDisc cd4 = new CompactDisc("Star Wars 2", "Science Friction","Director 2", "Artist 2");
        CompactDisc cd6 = new CompactDisc("Star Wars 3", "Science Friction", "Director 3", "Artist 3");
        Track track1 = new Track("Track1", 50);
        cd2.addTrack(track1);
        Track track2 = new Track("Track2", 40);
        cd2.addTrack(track2);
        Track track3 = new Track("Track3", 20);
        cd2.addTrack(track3);
        cd4.addTrack(track3);
        cd6.addTrack(track1);
        store.addMedia(cd2);
        store.addMedia(cd4);
        store.addMedia(cd6);
        
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King 2", "Animation","Roger Allers",56, 19.12f);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Animation", "Roger Allers", 90, 30f);
        store.addMedia(dvd3);
        
        Book book1 = new Book("Aladin", "Animation", 18.99f);
        Book book2 = new Book("The Lion King", "Animation", 19.4f);
        Book book3 = new Book("Aladin2", "Animation", 35.7f);
        Book book4 = new Book("Aladin3", "Animation", 34.7f);
        Book book5 = new Book("Star Wars", "Science Fiction", 25.9f);
        Book book6 = new Book("Star Wars2", "Science Fiction", 24.89f);
        Book book7 = new Book("Aladin1", "Animation", 19.39f);
        book1.addAuthor("Author 1");
        book2.addAuthor("Author 2");
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        store.addMedia(book5);
        store.addMedia(book6);
        store.addMedia(book7);
        new StoreManagerScreen(store);
    }
}
