package hust.soict.cybersec.aims.cart.Cart;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
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
	
	private List<String> authors = new ArrayList<>();
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	} 
	public void addAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (!authors.contains(authorName)) {
				authors.add(authorName);
			}
			System.out.println("The authorName has been added.");
		}
	}
	public void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.contains(authorName)) {
				authors.remove(authorName);
			}
			System.out.println("The authorName has been removed.");
		}
	}
	
}
