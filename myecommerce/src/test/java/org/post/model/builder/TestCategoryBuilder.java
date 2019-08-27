package org.post.model.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.post.model.builder.CategoryBuilder.build;

import org.junit.jupiter.api.Test;
import org.post.model.Category;

public class TestCategoryBuilder {

	@Test
	public void testCategoryCreation() {
		Category category = build();
		assertTrue(() -> category.getItems().size() == 1, "Category should have 10 items");
	}
	
}
