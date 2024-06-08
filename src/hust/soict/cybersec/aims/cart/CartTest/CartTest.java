package hust.soict.cybersec.aims.cart.CartTest;

import hust.soict.cybersec.aims.cart.Cart.Cart;
import hust.soict.cybersec.aims.cart.Cart.DigitalVideoDisc;
import hust.soict.cybersec.aims.exceptions.CartFullException;

public class CartTest {
    public static void main(String[] args) throws CartFullException {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new  objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "Geoger Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        //Remove a disc form cart
        anOrder.removeMedia(dvd2);
//        anOrder.removeDigitalVideoDisc(dvd3);
        //print total cost of the items in the cart
        anOrder.print();

        anOrder.searchTitle("Aladin");
    }
}
