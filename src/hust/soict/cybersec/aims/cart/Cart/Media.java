package hust.soict.cybersec.aims.cart.Cart;

import java.util.Comparator;
import java.util.Objects;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title, String category, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(){

	}
	public Media(int id, String title, String category, float cost){
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title, String category){
		this.title = title;
		this.category = category;
	}
	
	public Media(int id, String title, float cost) {
		this.id = id; 
		this.title = title;
		this.cost = cost;
	}
	public boolean isMatch(String title2) {
		return Objects.equals(this.getTitle(), title);
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media media = (Media) o;
			return media.title.equals(title);
		}
		return false;
	}
	@Override
	public String toString() {
        return String.format("%d - %s - %s - %.2f $", id, title, category, getCost());
    }
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
}
