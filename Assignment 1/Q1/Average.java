import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values n1 and n2.");
		System.out.println("n1: ");

		if (sc.hasNextDouble()) {
			double n1 = sc.nextDouble();
			System.out.println("n2: ");

			if (sc.hasNextDouble()) {
				double n2 = sc.nextDouble();
				System.out.println("Average is: " + (n1 + n2) / 2);
			} else {
				System.out.println("Please enter double values");
			}

		} else {
			System.out.println("Please enter double values");
		}

	}
}
