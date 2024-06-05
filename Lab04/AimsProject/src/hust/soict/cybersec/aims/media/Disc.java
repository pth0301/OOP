package hust.soict.cybersec.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	
	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}
	public Disc(String title, String category, String director){
		super(title, category);
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString(){
		return super.toString() + "-" + getLength() + "-" + getDirector();
	}
	@Override
	public void play() {
		throw new UnsupportedOperationException("Unimplemented method 'play'");
	}
	
}
