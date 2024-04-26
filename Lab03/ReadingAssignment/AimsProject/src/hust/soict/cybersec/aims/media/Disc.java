package hust.soict.cybersec.aims.media;

public class Disc extends Media {
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int length;
	private String directory;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
}
