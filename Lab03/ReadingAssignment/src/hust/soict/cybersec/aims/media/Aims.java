package hust.soict.cybersec.aims.media;
import java.util.Scanner;
import hust.soict.cybersec.aims.store.Store;

	
public class Aims {
	
	// Create a new store 
	public static Store store = new Store();
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("----------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. exit");
		System.out.println("----------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("----------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("----------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("----------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("----------------------------");
		System.out.println("Please choose a number: 0-1-2");
	
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("----------------------------");
		System.out.println("1. Filter media in cart");
		System.out.println("2. Sort media in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("----------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void cartOption() {
		int choice;
		do {
			cartMenu();
			System.out.println("Your choice is: ");
			choice = sc.nextInt();
			
		}
		while (choice > 5 || choice < 0);
		switch (choice) {
		case 1: 
			order.print();
		}
	}
}
