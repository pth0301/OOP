package hust.soict.cybersec.aims;
import java.util.List;
import java.util.Scanner;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.Cart;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.Track;
import hust.soict.cybersec.aims.store.Store;

	
public class Aims {
	//Create a new cart
	public static Cart cart = new Cart();
	public static List<Media> itemsOrdered = cart.getItemsOrdered();
	// Create a new store 
	public static Store store = new Store();
	public static List<Media> itemsInStore = store.getItemsInStore();
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
	
	public static void cartOption(){
		int choice;
		do{
			cartMenu();
			System.out.println("Your choice is: ");
			choice = sc.nextInt();
		}
		while (choice > 5|| choice < 0);
			switch (choice){
				case 1: {
					cart.print();
					System.out.println("Choosing option: ");
					System.out.println("1: Filter by id");
					System.out.println("2: Filter by title");
					int number = sc.nextInt();
					if (number == 1){
						System.out.println("Enter the id: ");
						int id = sc.nextInt();
						Media searchMedia = cart.searchId(id);
						if (searchMedia != null){
							System.out.println(searchMedia.toString());
						}
					}
					else if (number == 2){
						System.out.println("Enter the title: ");
						sc.nextLine();
						String title = sc.nextLine();
						Media  searchMedia = cart.searchByTitle(title);
						if (searchMedia != null){
							System.out.println(searchMedia.toString());
						}
					}
					else {
						System.out.println("Valid choice");
					}
					cartOption();
					break;
				}
				case 2: {
					System.out.println("Choosing option: ");
					System.out.println("1: Sort by title");
					System.out.println("2: Sort by cost");
					int number = sc.nextInt();
					if (number == 1){
						itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
						cart.print();
					}
					else if (number == 2){
						itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
						cart.print();
					}
					else{
						System.out.println("Valid choice");
					}
					cartOption();
					break;
				}
				case 3:{
					cart.print();
					System.out.println("Enter the media title yout want to remove: ");
					sc.nextLine();
					String title = sc.nextLine();
					Media searchTitle = cart.searchByTitle(title);
					cart.removeMedia(searchTitle);
					cart.print();
					choosingOption();
					break;
				}
				case 4: {
					System.out.println("Enter the title: ");
					sc.nextLine();
					String title = sc.nextLine();
					Media searchTitle = cart.searchByTitle(title);
					playMedia(searchTitle);
					cartOption();
					break;
				}
				case 5: {
					System.out.println("An order is created. Please check your email to confirm the order");
					cart.print();
					itemsOrdered.clear();
				}
				case 0: {
					choosingOption();
				}
			}


	}
	
	public static void detailOption(Media media){
		int choice;
		do {
			mediaDetailsMenu();
			System.out.print("Your choice is: ");
			choice = sc.nextInt();
		}
		while (choice > 2 || choice < 0);
		switch(choice){
			case 1: {
				cart.addMedia(media);
				choosingOption();
				break;
			}
			case 2: {
				boolean checkError = true;
				try{
					CompactDisc DVD = (CompactDisc) media;
					DVD.play();
					checkError = false;
				}
				catch (Exception e){
					
				}
				try {
                    DigitalVideoDisc chosenDVD = (DigitalVideoDisc) media;
                    chosenDVD.play();
                    checkError = false;
                }
                catch (Exception e){

                }
				if (checkError){
					System.out.println("The chosen media is not a CD or DVD");
					break;
				}
				choosingOption();
				break;
			}
			case 0: {
				choosingOption();
			}
		}
		
	}
	public static void seeAMediaDetail(Media searchTitle){
		int choice;
		do{
			mediaDetailsMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
		} while(choice > 2|| choice < 0);
		switch(choice){
			case 1: {
				cart.addMedia(searchTitle);
				cart.print();
				choosingOption();
				break;
			}
			case 2: {
				playMedia(searchTitle);
				choosingOption();
				break;
			}
			case 0: {
				choosingOption();
				break;
			}
		}
	}
	public static void playMedia(Media searchTitle){
		boolean isDVD = false;
		boolean isCD = false;
		try{
			CompactDisc media = (CompactDisc) searchTitle;
			media.play();
			isCD = true;
		}
		catch(Exception e){

		}
		try{
			DigitalVideoDisc media = (DigitalVideoDisc) searchTitle;
			media.play();
			isDVD = true;
		}
		catch(Exception e){

		}
        if (!isCD && !isDVD){
            System.out.println("The chosen media is not a CD or DVD \n");
        }
    }
    public static void choosingOption(){
        int choice;
        do {
            storeMenu();
            System.out.print("Your choice is: ");
            choice = sc.nextInt();
        }
        while(choice > 4 || choice < 0);
        switch (choice){
            case 1: {
                store.print();
                System.out.print("Enter the media title: ");
                sc.nextLine();
                String title = sc.nextLine();
                Media searchedMedia = store.searchByTitle(title);
                if(searchedMedia != null){
                    seeAMediaDetail(searchedMedia);
                }
                else{
                    System.out.println("No valid media");
                    choosingOption();
                }
                break;
            }
            case 2: {
                store.print();
                System.out.print("Enter the media title: ");
                sc.nextLine();
                String title = sc.nextLine();
                Media searchedMedia = store.searchByTitle(title);
                if (searchedMedia.getTitle() != null){
                    cart.addMedia(searchedMedia);
                }
                cart.print();
                choosingOption();
                break;
            }
            case 3: {
                store.print();
                System.out.println("Enter the title: ");
                sc.nextLine();
                String title = sc.nextLine();
                Media searchedMedia = store.searchByTitle(title);
                if (searchedMedia.getTitle() != null){
                    playMedia(searchedMedia);
                }
                choosingOption();
                break;
            }
            case 4: {
                cart.print();
                cartOption();
                break;
            }
            case 0: {
                menuOption();
                break;
            }
        }
    }
	public static void addBooktoStore(){
        String breakpoint = "";
        System.out.println("Enter Book id: ");
        int id = sc.nextInt();
        System.out.println("Enter Book title: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Enter Book category: ");
        String category = sc.nextLine();
        System.out.println("Enter Book cost: ");
        float cost = sc.nextFloat();
        System.out.println("Enter authors: ");
        sc.nextLine();
        Book book = new Book (id, title, category, cost);

        while (!breakpoint.equals("#")){
            System.out.println("Enter author name: ");
            String authorName = sc.nextLine();
            book.addAuthor(authorName);
            System.out.println("Enter anything to continue adding, enter # to end adding");
            breakpoint = sc.nextLine();
        }

        store.addMedia(book);

    }
    public static void addDVDtoStore(){
        System.out.println("Enter DVD title: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Enter DVD category: ");
        String category = sc.nextLine();
        System.out.println("Enter DVD cost: ");
        float cost = sc.nextFloat();
        System.out.println("Enter DVD length: ");
        int length = sc.nextInt();
        System.out.println("Enter DVD director: ");
        sc.nextLine();
        String director = sc.nextLine();

        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        store.addMedia(dvd);
    }
    public static void addCDtoStore(){
        String breakpoint = "";
        System.out.println("Enter CD title: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Enter CD category: ");
        String category = sc.nextLine();
        System.out.println("Enter CD director: ");
        sc.nextLine();
        String director = sc.nextLine();
        System.out.println("Enter CD artist: ");
        String artist = sc.nextLine();
        System.out.println("Enter track list: ");

        CompactDisc cd = new CompactDisc(title, category, director, artist);

        while (!breakpoint.equals("#")){
            System.out.println("Enter track name: ");
            String trackName = sc.nextLine();
            System.out.println("Enter track length: ");
            int trackLength = sc.nextInt();
            Track track = new Track(trackName, trackLength);
            cd.addTrack(track);
            System.out.println("Enter anything to continue adding, enter # to end adding");
            sc.nextLine();
            breakpoint = sc.nextLine();
        }

        store.addMedia(cd);

    }
    public static void updateOption(){
        System.out.println("Update options: ");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("Select the option: ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Select the type of media: ");
            System.out.println("1. Book");
            System.out.println("2. DVD");
            System.out.println("3. CD");
            int mediaChoice = sc.nextInt();
            switch (mediaChoice){
                case 1: {
                    addBooktoStore();
                    store.print();
                    menuOption();
                    break;
                }
                case 2: {
                    addDVDtoStore();
                    store.print();
                    menuOption();
                    break;
                }
                case 3: {
                    addCDtoStore();
                    store.print();
                    menuOption();
                    break;
                }
            }
        }
        else if(choice == 2){
            store.print();
            System.out.println("Enter media title: ");
            sc.nextLine();
            String scTitle = sc.nextLine();
            Media searchedMedia = store.searchByTitle(scTitle);
            store.removeDVD(searchedMedia);
            store.print();
            menuOption();
        }
    }
    public static void menuOption(){
        int choice;
        do {
            showMenu();
            System.out.print("Your choice is: ");
            choice = sc.nextInt();
        }
        while(choice > 3 || choice < 0);

        switch (choice){
            case 1: {
                choosingOption();
                break;
            }
            case 2: {
                updateOption();
                break;
            }
            case 3: {
                cart.print();
                cartOption();
                break;
            }
            case 0: break;
        }

    }
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.75f);
        store.addMedia((Media) dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "Geoger Lucas", 87, 24.95f);
        store.addMedia((Media) dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia((Media) dvd3);
        Book book1 = new Book("Book 1", "Category 1", 40.26f);
        store.addMedia((Media) book1);
        Scanner sc = new Scanner(System.in);
        menuOption();
    }
}