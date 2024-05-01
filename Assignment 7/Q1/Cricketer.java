package com.cricketer;

import java.util.Scanner;

public class Cricketer extends Player implements Bowler, Batter {
	private int runs;
	private int wickets;

	public Cricketer() {
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter runs: ");
		runs = sc.nextInt();

		System.out.println("Enter wickets: ");
		wickets = sc.nextInt();
	}

	@Override
	public void display() {
		super.display();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public int getMatchesPlayed() {

		return super.getMatchesPlayed();
	}

}
