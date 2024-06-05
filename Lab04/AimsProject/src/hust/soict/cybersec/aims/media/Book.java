package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;


public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	public Book(int id, String title, String category, float cost){
		super(id, title, category,cost);
	}
	public Book(String title, String category, float cost){
		super(title, category,cost);
	}
	public Book(String title, String category, float cost, List<String> authors){
		super(title, category, cost);
		this.authors = authors;
	}

	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
	// Create method for Book class
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
		}
		else {
			System.out.println("The author is already in the ArrayList");
		}
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else {
			System.out.println("The author is not present in the ArrayList");
		}
	}
	public static void main(String[] args){
		
	}

	@Override
	public void play() {
		throw new UnsupportedOperationException("Unimplemented method 'play'");
	}

}

