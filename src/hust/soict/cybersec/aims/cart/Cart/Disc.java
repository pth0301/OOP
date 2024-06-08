package hust.soict.cybersec.aims.cart.Cart;

import hust.soict.cybersec.aims.exceptions.PlayerException;

public class Disc extends Media implements Playable{
	private int length;
	private String director;
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	
	public Disc(int id, String title, String category, float cost, String director) {
		super(id, title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, String director){
		super(title, category);
		this.director = director;
	}
	public Disc(String title, String director, float cost) {
		super(title, director, cost);
	}

	public Disc(int id, String title, String director, float cost) {
		super(id, title, cost);
		this.director = director;
	}

	public Disc() {
		// TODO Auto-generated constructor stub
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
	public void play() throws PlayerException {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
