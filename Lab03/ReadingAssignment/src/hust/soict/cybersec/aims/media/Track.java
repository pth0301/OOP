package hust.soict.cybersec.aims.media;

public class Track {
	public Track(int length, String title) {
		super();
		this.length = length;
		this.title = title;
	}
	private int length;
	private String title;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track track = (Track) o;
			return track.title.equals(title) && getLength() == this.getLength();
		}
		return false;
	}
}
