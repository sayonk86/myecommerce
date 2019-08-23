package org.post.model;

import static java.util.stream.Collectors.*;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

public class Category {

	private String name;
	private List<Item> items;

	public Category(List<Item> items) {
		this.items = items;
		this.name = "Category" + RandomStringUtils.random(4, true, false);
	}

	public String getName() {
		return name;
	}

	public List<Item> getItems() {
		return items;
	}

	public List<Item> getItemsSortedByWeightage() {
		return items.stream().sorted(Comparator.comparingDouble(Item::getWeightage)).collect(toList());
	}

}
