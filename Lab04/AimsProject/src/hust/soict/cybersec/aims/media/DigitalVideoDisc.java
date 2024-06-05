package hust.soict.cybersec.aims.media;


public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, float cost){
		super(title, category, cost);
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public String toString() {
        return String.format("DVD - %s - %s - %s - %d : %.2f $", director, length, getCost());
    }
	public boolean isMatch(String title) {
		
			
		return  this.getTitle().equals(title);
		
		
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
