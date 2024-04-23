package Q1;

import java.util.Scanner;

public class credit_Limit_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();

		System.out.print("Enter pending balance at the beginning of the month: ");
		int pendingBalance = scanner.nextInt();

		System.out.print("Enter total items charged this month: ");
		int totalCharges = scanner.nextInt();

		System.out.print("Enter total credits applied this month: ");
		int totalCredits = scanner.nextInt();

		System.out.print("Enter allowed credit limit: ");
		int allowedCredit = scanner.nextInt();

		int newBalance = pendingBalance + totalCharges - totalCredits;
		System.out.println("New balance for next month: " + newBalance);

		if (newBalance > allowedCredit) {
			System.out.println("Credit limit exceeded for account number " + accountNumber);
		} else {
			System.out.println("Credit limit not exceeded for account number " + accountNumber);
		}

//		scanner.close();
	}
}
