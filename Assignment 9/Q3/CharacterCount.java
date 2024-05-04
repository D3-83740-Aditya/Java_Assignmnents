package com.sunbeam;

public class CharacterCount {
	public static void main(String[] args) {
		String data = "The class String includes methods for examining individual characters of the sequence, for comparing strings,"
				+ " for searching strings, for extracting substrings, and for creating a copy of a string with all characters"
				+ " translated to uppercase or to lowercase."
				+ " Case mapping is based on the Unicode Standard version specified by the Character class";

		data = data.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim();

		String[] words = data.split(" ");

		int wordCount = words.length;

		System.out.println("Number of words: " + wordCount);
	}
}
