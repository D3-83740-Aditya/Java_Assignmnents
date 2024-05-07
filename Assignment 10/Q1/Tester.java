package com.sunbeam.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.sunbeam.student.Student;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] s = { new Student(1, "Tushar", 75), new Student(2, "Ashish", 80), new Student(3, "Ganesh", 85),
				new Student(4, "Mukesh", 68), new Student(5, "Prathamesh", 82) };

		System.out.println("Before sorting.");
//		System.out.println();

		for (Student student : s) {
			System.out.println(student);
		}

		Arrays.sort(s);
		System.out.println("-----------------------------------------------");
		System.out.println("After sorting.");
//		System.out.println();

		for (Student student : s) {
			System.out.println(student);
		}
	}

}
