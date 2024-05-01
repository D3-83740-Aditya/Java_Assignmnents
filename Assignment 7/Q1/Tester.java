package com.tester;

import java.util.Scanner;

import com.cricketer.*;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Cricketer[] team = new Cricketer[11];

		for (int i = 0; i < team.length; i++) {
			System.out.println("Enter details for Player " + (i + 1));
			team[i] = new Cricketer(); // Initialize with default values
			team[i].accept(scanner);
		}

		int totalRuns = 0;
		int totalWickets = 0;
		int totalMatchesPlayed = 0;

		for (Cricketer player : team) {
			totalRuns += player.getRuns();
			totalWickets += player.getWickets();
			totalMatchesPlayed += player.getMatchesPlayed();
		}

		System.out.println("Total Runs: " + totalRuns);
		System.out.println("Total Wickets: " + totalWickets);
		System.out.println("Total Matches Played: " + totalMatchesPlayed);

		for (Cricketer player : team) {
			System.out.println(player.getName() + " - Matches Played: " + player.getMatchesPlayed());
		}

		scanner.close();
	}
}
