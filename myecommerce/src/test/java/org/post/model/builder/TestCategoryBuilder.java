package org.post.model.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.post.model.builder.CategoryBuilder.*;

import org.junit.jupiter.api.Test;
import org.post.model.Item;

public class TestCategoryBuilder {

	@Test
	public void testGetRandomNumberInRange() {
		int num = getRandomNumberInRange(1, 20);
		assertTrue(() -> num >= 1 && num <= 20, "Number should be between 1 & 20");
	}
	
	@Test
	public void testCreateItem() {
		Item item = createItem();
		assertTrue(() -> item.getPrice() >= 1 && item.getPrice() <= 20, "Item price should be between 1 & 20");
		assertTrue(() -> item.getShippingCost() >= 2 && item.getShippingCost() <= 5 , "Item shipping cost should be between 2 & 5");
		assertTrue(() -> item.getRating() >= 1 && item.getRating() <= 5 , "Item rating should be between 1 & 5");
	}

}
