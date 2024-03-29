
public class Cart {
	private int qtyOrdered; //the number of discs in cart
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // list contains discs
	
	public Cart(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public Cart() {
		
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < MAX_NUMBERS_ORDERED;i++) {
				if (itemsOrdered[i] == null) {
					itemsOrdered[i] = disc;
					qtyOrdered++;
					System.out.println("The disc has been added");
				}
			}
		}
		else {
			System.out.println("The cart is almost full");
		}
		
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] != null && itemsOrdered[i].equals(disc)) {
                itemsOrdered[i] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
            }
        }
        
        System.out.println("The disc is not in the order.");
	}
	public double totalCost() {
		double sum = 0.0;
		for(int i = 0; i < itemsOrdered.length; i++) {
			if (itemsOrdered[i] != null) {
				sum += itemsOrdered[i].getCost();
			}
		}
		return sum;
	}
}
