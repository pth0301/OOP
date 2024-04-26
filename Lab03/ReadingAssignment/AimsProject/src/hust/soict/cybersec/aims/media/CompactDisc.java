package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ArrayList<Track> getTracks() {
		return (ArrayList<Track>) tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
		}
		else {
			System.out.println("The track is already in the list");
		}
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		}
		else{
			System.out.println("The track is not in the list");
		}
		
	}
	public int getLength() {
		int sum = 0;
		for (int i = 0; i < tracks.size(); i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tracks.size(); i++) {
			((Playable) tracks.get(i)).play();
		}
	}
}
