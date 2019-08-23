package org.post.model.builder;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import org.post.model.Category;
import org.post.model.Item;

public class CategoryBuilder {

	public static Category build() {
		return new Category(createItems(1, 10));
	}

	public static Item createItem() {
		return new ItemBuilder().setPrice(getRandomNumberInRange(1, 20)).setShippingCost(getRandomNumberInRange(2, 5))
				.setRating(getRandomNumberInRange(1, 5)).build();
	}

	private static List<Item> createItems(int from, int limit) {
		return IntStream.range(from, from + limit).mapToObj(i -> createItem()).collect(toList());
	}

	public static int getRandomNumberInRange(int min, int max) {
		return new Random().ints(min, (max + 1)).limit(1).findFirst().getAsInt();
	}

}
