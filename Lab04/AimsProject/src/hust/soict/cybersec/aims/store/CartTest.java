package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.Cart;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args){
        //Create a new cart
        Cart cart = new Cart();
        
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation","Roger Allers", 87, 19.75f);
        cart.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

       // Print total cost of the items in the cart
       cart.print();

       cart.searchByTitle("Aladin");

        
    }
}
