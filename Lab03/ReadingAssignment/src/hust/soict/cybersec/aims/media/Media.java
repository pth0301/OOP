package hust.soict.cybersec.aims.media;

import java.util.Comparator;

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
	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
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
