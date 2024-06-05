package hust.soict.cybersec.aims.media;

public class Track {
	private int length;
	private String title;
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public Track(){
		
	}
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
		System.out.println("Playing DVD: " + title);
		System.out.println("DVD length: " + length);
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
