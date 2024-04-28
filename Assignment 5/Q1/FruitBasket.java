package com.app.tester;

import java.util.Scanner;

//import com.app.fruits.Fruit;
import com.app.fruits.*;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fruit[] basket = new Fruit[4];
		int counter = 0;

		while (true) {
			System.out.println("Choose an option:");
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name, color, weight, taste of all fresh fruits");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7. Display tastes of all stale fruits");
//			System.out.println("8. Mark all sour fruits stale (optional)");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				System.out.println("Exiting...");
				return;
			case 1:
				if (counter < basket.length) {
					System.out.print("Enter mango name: ");
					String name = scanner.nextLine();
					System.out.print("Enter mango weight: ");
					double weight = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Enter mango color: ");
					String color = scanner.nextLine();
					basket[counter++] = new Mango(color, weight, name);
					System.out.println("Mango added to the basket.");
				} else {
					System.out.println("Basket is full.");
				}
				break;
			case 2:
				if (counter < basket.length) {
					System.out.print("Enter Orange name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Orange weight: ");
					double weight = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Enter Orange color: ");
					String color = scanner.nextLine();
					basket[counter++] = new Orange(color, weight, name);
					System.out.println("Orange added to the basket.");
				} else {
					System.out.println("Basket is full.");
				}
				break;
			case 3:
				if (counter < basket.length) {
					System.out.print("Enter Apple name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Apple weight: ");
					double weight = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Enter Apple color: ");
					String color = scanner.nextLine();
					basket[counter++] = new Apple(color, weight, name);
					System.out.println("Apple added to the basket.");
				} else {
					System.out.println("Basket is full.");
				}
				break;
			case 4:
				System.out.println("Names of fruits in the basket:");
				for (int i = 0; i < counter; i++) {
					System.out.println(basket[i].getName());
				}
				break;
			case 5:
				System.out.println("Details of fresh fruits in the basket:");
				for (int i = 0; i < counter; i++) {
					if (basket[i].isFresh()) {
						System.out.println(basket[i].toString());
						System.out.println("Taste: " + basket[i].taste());
					}
				}
				break;
			case 6:
				System.out.print("Enter index to mark the fruit as stale: ");
				int index = scanner.nextInt();
				if (index >= 0 && index < counter) {
					basket[index].setFresh(false);
					System.out.println("Fruit marked as stale.");
				} else {
					System.out.println("Invalid index.");
				}
				break;
			case 7:
				System.out.println("Tastes of stale fruits in the basket:");
				for (int i = 0; i < counter; i++) {
					if (!basket[i].isFresh()) {
						System.out.println(basket[i].taste());
					}
				}
				break;
//			case 8:
//				// Mark all sour fruits as stale.
//				break;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
