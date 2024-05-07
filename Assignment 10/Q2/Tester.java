package com.sunbeam.tester;

import java.util.Arrays;
import com.sunbeam.product.Product;

public class Tester {

	public static void main(String[] args) {
		Product[] p = { new Product(1, "Laptop", "Electronics", 1200.0), new Product(2, "T-shirt", "Clothing", 25.0),
				new Product(3, "Book", "Books", 15.0), new Product(4, "Smartphone", "Electronics", 800.0),
				new Product(5, "Shoes", "Footwear", 50.0), new Product(6, "Tablet", "Electronics", 400.0),
				new Product(7, "Jeans", "Clothing", 40.0), new Product(8, "Watch", "Accessories", 100.0),
				new Product(9, "Headphones", "Electronics", 50.0), new Product(10, "Backpack", "Accessories", 30.0) };

		System.out.println("Before sorting...");
		for (Product product : p) {
			System.out.println(product);
		}

		Arrays.sort(p);

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("After sorting...");
		for (Product product : p) {
			System.out.println(product);
		}
	}
}
