package hust.soict.cybersec.aims.cart.Cart;

import hust.soict.cybersec.aims.exceptions.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
	private int length;
	
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director);
		this.length = length;
	}
	public DigitalVideoDisc(int id, String title, String director, float cost) {
		super(id, title, director, cost);
	}
	
	public int getLength() {
		return length;
	}

	public String toString() {
        return String.format("DVD - %s - %d : %.2f $", getDirector(), length, getCost());
    }
	public boolean isMatch(String title) {
		
			
		return  this.getTitle().equals(title);
		
		
	}

	@Override
    public void play() throws PlayerException {
        if(this.getLength() <= 0){
            System.err.println("ERROR: DigitalVideoDisc length is non-positive.");
            throw new PlayerException("DigitalVideoDisc length is non-positive.");
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}