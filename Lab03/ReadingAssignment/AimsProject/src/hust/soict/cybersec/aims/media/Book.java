package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;


public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	

	
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
	
}

