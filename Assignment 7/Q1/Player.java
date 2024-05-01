package com.cricketer;

import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;

	public Player() {
	}

	public void accept(Scanner sc) {
		System.out.println("Enter ID:");
		this.id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Name:");
		this.name = sc.nextLine();

		System.out.println("Enter Age:");
		this.age = sc.nextInt();

		System.out.println("Enter Matches Played:");
		this.matchesPlayed = sc.nextInt();
	}

	public void display() {
		System.out.println("Player name: " + name);
		System.out.println("Player matches played: " + matchesPlayed);
	}

	@Override
	public String toString() {
		return "Player{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", matchesPlayed=" + matchesPlayed
				+ '}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		Player player = (Player) o;
//		return id == player.id;
//	}
}
