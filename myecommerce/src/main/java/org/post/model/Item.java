package org.post.model;

import org.apache.commons.lang3.RandomStringUtils;

public class Item {

	private String name;
	private int price;
	private int shippingCost;
	private int rating;

	public Item(int price, int shippingCost, int rating) {
		this.price = price;
		this.shippingCost = shippingCost;
		this.rating = rating;
		this.name = "Item" + RandomStringUtils.random(4, true, false);
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public int getRating() {
		return rating;
	}

	public int getTotalCost() {
		return this.price + this.shippingCost;
	}

	public float getWeightage() {
		return (float) (this.price + this.shippingCost) / rating;
	}

}
