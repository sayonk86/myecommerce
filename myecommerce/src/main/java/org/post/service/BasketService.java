package org.post.service;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

import org.post.model.Basket;
import org.post.model.Category;
import org.post.model.Item;
import org.post.model.builder.CategoryBuilder;

public class BasketService {

	private List<Category> generateCategoriesWithItems() {
		return IntStream.range(1, 21).mapToObj(i -> CategoryBuilder.build()).collect(toList());
	}

	public static void main(String[] args) {
		int totalPrice = 0;
		BasketService service = new BasketService();
		service.printOutput(service.prepareBasket(totalPrice));
	}

	private void printOutput(Basket basket) {
		printBasketLineItems(basket);
		printTotalCost(basket);
		printCumulativeRating(basket);
	}

	private Basket prepareBasket(int totalPrice) {
		List<Category> categories = generateCategoriesWithItems();
		Basket basket = new Basket();
		for (int i = 0; i <= categories.size(); i++) {
			Category category = categories.get(i);
			Item item = category.getItemsSortedByWeightage().get(i);
			totalPrice = totalPrice + item.getTotalCost();
			if (totalPrice > 50) {
				break;
			}
			basket.addLineItem(category.getName(), item);
		}
		return basket;
	}

	public void printBasketLineItems(Basket basket) {
		basket.getLineItems().stream().map(i -> i.getCategoryName() + ":" + i.getItem().getName() + ":"
				+ i.getItem().getTotalCost() + ":" + i.getItem().getRating()).forEach(System.out::println);
	}

	public void printTotalCost(Basket basket) {
		System.out.println("Total Cost: "
				+ basket.getLineItems().stream().map(i -> i.getItem().getTotalCost()).reduce(0, Integer::sum));
	}

	public void printCumulativeRating(Basket basket) {
		System.out.println("Cumulative rating: "
				+ basket.getLineItems().stream().map(i -> i.getItem().getRating()).reduce(0, Integer::sum));

	}
}
