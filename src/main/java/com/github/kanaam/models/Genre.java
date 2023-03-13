package com.github.kanaam.models;

public enum Genre {

	HAREM("Harem"),
	ROMANCE("Romance"),
	DRAMA("Drama"),
	ACTION("Action"),
	FANTASY("Fantasy"),
	COMEDY("Comedy"),
	HORROR("Horror"),
	SPORT("Sport");

	private final String genre;

	Genre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
}
