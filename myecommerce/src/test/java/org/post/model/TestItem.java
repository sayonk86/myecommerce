package org.post.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.post.model.builder.ItemBuilder;

public class TestItem {

	@Test
	public void createItem() {
		Item item = new ItemBuilder().build();
		assertTrue(() -> item.getPrice() >= 1 && item.getPrice() <= 20, "Item price should be between 1 & 20");
		assertTrue(() -> item.getShippingCost() >= 2 && item.getShippingCost() <= 5 , "Item shipping cost should be between 2 & 5");
		assertTrue(() -> item.getRating() >= 1 && item.getRating() <= 5 , "Item rating should be between 1 & 5");
	}
	
}
