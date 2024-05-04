package com.sunbeam.tester;

import com.sunbeam.exception.*;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String input = sc.nextLine();
			sc.close();
			int length = input.length();

			if (length > 10) {
//				throw new ExceptionLineTooLong();
				throw new ExceptionLineTooLong("length is too long");
			}

			System.out.println("Length of the string: " + length);
		} catch (ExceptionLineTooLong e) {
			System.out.println(e);
		}
	}
}
