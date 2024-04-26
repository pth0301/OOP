package hust.soict.cybersec.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	
	
	public DigitalVideoDisc(String title) {
		super();
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
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
