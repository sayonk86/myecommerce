package org.post.model.builder;

import org.post.model.Item;

public class ItemBuilder {

	private int price;
	private int shippingCost;
	private int rating;

	public Item build() {
		return new Item(this.price, this.shippingCost, this.rating);
	}

	public ItemBuilder setPrice(int price) {
		this.price = price;
		return this;
	}

	public ItemBuilder setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
		return this;
	}

	public ItemBuilder setRating(int rating) {
		this.rating = rating;
		return this;
	}

}
