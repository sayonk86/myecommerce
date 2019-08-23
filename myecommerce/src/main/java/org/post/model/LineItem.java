package org.post.model;

public class LineItem {

	private String categoryName;
	private Item item;

	public LineItem(String categoryName, Item item) {
		this.categoryName = categoryName;
		this.item = item;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Item getItem() {
		return item;
	}

}
