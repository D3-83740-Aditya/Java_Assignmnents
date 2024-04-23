import java.util.Scanner;

class MenuItem {
	String name;
	double price;

	MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

public class FoodMenu {
	private MenuItem[] menu;
	private int[] cart;

	public FoodMenu() {
		menu = new MenuItem[4]; // Adjust the size based on the number of items
		menu[0] = new MenuItem("Dosa", 50);
		menu[1] = new MenuItem("Samosa", 20);
		menu[2] = new MenuItem("Idli", 30);
		// Add more items as needed
		cart = new int[menu.length];
	}

	public void displayMenu() {
		System.out.println("Menu:");
		for (int i = 0; i < menu.length; i++) {
			MenuItem menuItem = menu[i];
			if (menuItem != null) {
				System.out.println((i + 1) + ". " + menuItem.name + " - $" + menuItem.price);
			}
		}
	}

	public void addToCart(int itemNumber, int quantity) {
		if (itemNumber >= 1 && itemNumber <= menu.length) {
			cart[itemNumber - 1] += quantity;
		} else {
			System.out.println("Invalid item number.");
		}
	}

	public void generateBill() {
		double totalBill = 0;
		System.out.println("\nGenerating Bill:");
		for (int i = 0; i < menu.length; i++) {
			MenuItem menuItem = menu[i];
			int quantity = cart[i];
			if (menuItem != null && quantity > 0) {
				double itemPrice = menuItem.price;
				double totalItemPrice = itemPrice * quantity;
				totalBill += totalItemPrice;
				System.out.println(menuItem.name + ": " + quantity + " x $" + itemPrice + " = $" + totalItemPrice);
			}
		}
		System.out.println("\nTotal Bill: $" + totalBill);
	}

	public static void main(String[] args) {
		FoodMenu menu = new FoodMenu();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu.displayMenu();
			System.out.print("Enter item number to add to cart (or '10' to generate bill): ");
			int choice = scanner.nextInt();

			if (choice == 10) {
				menu.generateBill();
				break;
			}

			System.out.print("Enter quantity: ");
			int quantity = scanner.nextInt();
			menu.addToCart(choice, quantity);
		}

		scanner.close();
	}
}