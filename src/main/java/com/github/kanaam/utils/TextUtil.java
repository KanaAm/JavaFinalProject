package com.github.kanaam.utils;

public final class TextUtil {

	public static String capitalizeFirstLetter(String word) {
		String newWord = String.valueOf(word.charAt(0)).toUpperCase();

		return newWord + word.substring(1);
	}

	public static String addLineByCollection(String[] array) {

		StringBuilder textHolder = new StringBuilder();
		boolean isFirstTime = true;

		for (String line : array) {

			if (isFirstTime) {
				textHolder.append(line);
				isFirstTime = false;
			} else {
				textHolder.append("-").append(line);
			}

		}

		return textHolder.toString();
	}
}
