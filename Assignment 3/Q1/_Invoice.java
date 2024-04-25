package com.sunbeam.invoice;

import java.util.Scanner;

public class _Invoice {

	public static void main(String[] args) {

		class Invoice {
			private String part_Number;
			private String part_Description;
			private int quantity;
			private double price;

			public Invoice() {

			}

			public Invoice(String part_Number, String part_Description, int quantity, double price) {
				this.part_Number = part_Number;
				this.part_Description = part_Description;
				this.quantity = quantity;
				this.price = price;
			}

			public String getPart_Number() {
				return part_Number;
			}

			public void setPart_Number(String part_Number) {
				this.part_Number = part_Number;
			}

			public String getPart_Description() {
				return part_Description;
			}

			public void setPart_Description(String part_Description) {
				this.part_Description = part_Description;
			}

			public int getQuantity() {
				return quantity;
			}

			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}
		}
		Scanner sc = new Scanner(System.in);
		double invoice_Amount;

		System.out.print("Enter quantity: ");
		int q = sc.nextInt();

		System.out.print("Enter price: ");
		double p = sc.nextDouble();

		Invoice i = new Invoice("1", "Engine", q, p);

		if (i.getQuantity() < 0) {
			i.setQuantity(0);
			System.out.println("Quantity is set to zero since entered quantity is negative.");
			System.out.println("Quantity = " + i.getQuantity());
			return;
		}

		if (i.getPrice() < 0) {
			i.setPrice(0.0);
			System.out.println("Price is set to zero since entered price is negative.");
			System.out.println("Price = " + i.getPrice());
			return;
		}

		invoice_Amount = i.quantity * i.price;

		System.out.println("Amount = " + invoice_Amount);

	}
}