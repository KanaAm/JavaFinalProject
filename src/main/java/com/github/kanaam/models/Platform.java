package com.github.kanaam.models;

public enum Platform {

	BILIBILI("Bilibili"),
	NETFLIX("Netflix"),
	DISNEY_PLUS("Disney Plus"),
	AISPLAY("Aisplay"),
	AMAZON_PRIME("Amazon Prime"),
	MUSE("Muse");

	private final String name;

	Platform(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
