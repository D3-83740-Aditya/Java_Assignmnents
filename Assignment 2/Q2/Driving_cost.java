import java.util.Scanner;

public class Driving_cost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total miles driven per day.");
		float miles = sc.nextFloat();
		System.out.println("Total miles driven per day: " + miles);
		
		System.out.println("-------------------------------------");

		System.out.println("Enter cost per gallon of gasoline.");
		float gasoline_cost = sc.nextFloat();
		System.out.println("Cost per gallon of gasoline: " + gasoline_cost);

		System.out.println("-------------------------------------");
		
		System.out.println("Enter average miles per gallon.");
		float avg_miles_per_gallon = sc.nextFloat();
		System.out.println("Average miles per gallon: " + avg_miles_per_gallon);

		System.out.println("-------------------------------------");
		
		System.out.println("Enter parking fees per day.");
		float parking_fees = sc.nextFloat();
		System.out.println("Parking fees per day: " + parking_fees);

		System.out.println("-------------------------------------");
		
		System.out.println("Enter tolls per day.");
		float tolls_per_day = sc.nextFloat();
		System.out.println("Tolls per day: " + tolls_per_day);

		System.out.println("-------------------------------------");
		
		float totalCost = (miles * gasoline_cost / avg_miles_per_gallon) + parking_fees + tolls_per_day;
		
		System.out.println("Total cost: " + String.format("%.2f", totalCost));
		System.out.println("Total cost: " + totalCost);

	}

}
