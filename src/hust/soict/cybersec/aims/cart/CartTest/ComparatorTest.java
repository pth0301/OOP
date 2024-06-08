package hust.soict.cybersec.aims.cart.CartTest;
import javax.naming.LimitExceededException;

import hust.soict.cybersec.aims.cart.Cart.Book;
import hust.soict.cybersec.aims.cart.Cart.Cart;
import hust.soict.cybersec.aims.cart.Cart.DigitalVideoDisc;
import hust.soict.cybersec.aims.cart.Cart.Media;
import hust.soict.cybersec.aims.exceptions.CartFullException;
import hust.soict.cybersec.aims.cart.Cart.MediaComparatorByTitleCost;
import hust.soict.cybersec.aims.cart.Cart.MediaComparatorByCostTitle;

import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) throws LimitExceededException, CartFullException {
        Cart anOrder = new Cart();

        List<Media> itemsInOrdered = anOrder.getItemsOrdered();


        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f);
        anOrder.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star War", "Science Fiction", 24.95f);
        anOrder.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);
        Book book1 = new Book(4, "The Lion", "Animation", 19.95F);
        anOrder.addMedia(book1);
        Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

        Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
        for(Media m: itemsInOrdered){
            System.out.println(m.toString());
        }
        System.out.println();

        itemsInOrdered.sort(COMPARE_BY_COST_TITLE);
        for(Media m: itemsInOrdered){
            System.out.println(m.toString());
        }
        System.out.println();

        itemsInOrdered.sort(COMPARE_BY_TITLE_COST);
        for(Media m: itemsInOrdered){
            System.out.println(m.toString());
        }
        System.out.println();
    }
}