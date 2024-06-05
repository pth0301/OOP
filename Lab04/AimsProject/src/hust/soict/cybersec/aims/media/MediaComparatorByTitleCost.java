package hust.soict.cybersec.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	@Override
	public int compare(Media m1, Media m2) {
		int costComparation = Double.compare(m1.getCost(), m2.getCost());
			if (costComparation != 0) {
				return costComparation;
			}
			return m1.getTitle().compareTo(m2.getTitle());
	}

}
