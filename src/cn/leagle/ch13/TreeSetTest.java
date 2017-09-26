package cn.leagle.ch13;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<Item>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4562));
		parts.add(new Item("Modem", 9912));
		System.err.println(parts);

		SortedSet<Item> sortByDescription = new TreeSet<Item>(new Comparator<Item>() {
			public int compare(Item a, Item b) {
				String descrA = a.getDescription();
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
		});
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}

}

/**
 * 
 * @ClassName: Item
 * @Description: An item with a description and a part number.
 * @author: Leagle
 * @date: 2017年9月25日 下午3:19:51
 */
class Item implements Comparable<Item> {
	private String description;
	private int partNumber;

	public Item(String aDescription, int aPartNumber) {
		this.description = aDescription;
		this.partNumber = aPartNumber;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Item [description=" + description + ", partNumber=" + partNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return description.equals(other.description) && partNumber == other.partNumber;
	}

	@Override
	public int hashCode() {
		return 13 * description.hashCode() + 17 * partNumber;
	}

	@Override
	public int compareTo(Item other) {
		return partNumber - other.partNumber;
	}

}
