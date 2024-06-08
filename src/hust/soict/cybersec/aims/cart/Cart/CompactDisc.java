package hust.soict.cybersec.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.cybersec.aims.exceptions.PlayerException;

public class CompactDisc extends Disc implements Playable{
	public CompactDisc(String title, String category, float cost, String director, String artist, List<Track> tracks){
		super(title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title, String category, String director, String artist){
		super(title, category, director);
		this.artist = artist;
	}
	public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
		super(id, title, category, cost, director);
		this.artist = artist;
		
	}
	public CompactDisc(int id, String title, String category, float cost, String director, List<Track> tracks) {
		super(id, title, category, cost, director);
		this.tracks = tracks;
	}
		private String artist;
	private List<Track> tracks = new ArrayList<>();
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public List<Track> getTracks() {
		return tracks;
	}
	public int getLength(List<Track> tracks) {
		int sum = 0;
		for (int i = 0; i < tracks.size(); i++) {
			sum += i;
		}
		return sum;
	}
	public void addTrack(Track trackName) {
		if (!tracks.contains(trackName)) {
			tracks.add(trackName);
		}
		else {
			System.out.println("The track is already in the list.");
		}
	}
	public void removeTrack(Track trackName) {
		if (tracks.contains(trackName)) {
			tracks.remove(trackName);		
		}
		else {
			System.out.println("The track is not found.");
		}
	}
	@Override
    public void play() throws PlayerException {
        if(this.getLength() > 0){
            Iterator iter = tracks.iterator();
            Track nextTrack;
            while (iter.hasNext()){
                nextTrack = (Track) iter.next();
                try{
                    nextTrack.play();
                }
                catch (PlayerException e){
                    throw e;
                }
            }
        }
        else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }
	public int getLength() {
		int sum = 0;
		for (int i = 0; i < tracks.size(); i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
		
	}
}
