package org.post.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<LineItem> lineItems = new ArrayList<>();

	public void addLineItem(String categoryName, Item item) {
		lineItems.add(new LineItem(categoryName, item));
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

}
