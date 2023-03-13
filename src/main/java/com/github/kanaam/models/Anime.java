package com.github.kanaam.models;

import com.github.kanaam.utils.TextUtil;

import java.io.*;
import java.nio.file.Paths;

public final class Anime implements Serializable {

	private final String name;
	private final String date;
	private final Genre genre;

	private Platform[] platform;
	private String[] details;

	public Anime(String name, String date , Genre genre) {
		this.name = name;
		this.date = date;
		this.genre = genre;
	}

	public boolean isAvailable(Platform platform) {

		for (Platform pf : this.platform)
			if (pf.equals(platform))
				return true;

		return false;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getDetails() {

		StringBuilder details = new StringBuilder();
		boolean firstTime = true;

		for (String lore : this.details) {
			if (firstTime) {
				details.append(lore);
				firstTime = false;
			} else {
				details.append("\n").append(lore);
			}
		}

		return details.toString();
	}

	public void setDetails(String[] details) {
		this.details = details;
	}

	public Platform[] getPlatform() {
		return platform;
	}

	public void setPlatform(Platform[] platform) {
		this.platform = platform;
	}

	public void saveToFile() throws IOException {

		File output = new File(Paths.get("").toAbsolutePath() + "\\anime.dat");

		if (!output.exists())
			output.createNewFile();

		BufferedWriter writer = new BufferedWriter(new FileWriter(output , true));

		writer.write(this.getName() + "," + this.getDate() + ",");

		writer.write(TextUtil.addLineByCollection(details) + ",");

		StringBuilder platformData = new StringBuilder();
		boolean isFirstTime = true;
		for (Platform plat : getPlatform()) {

			if (isFirstTime) {
				platformData.append(plat.name());
				isFirstTime = false;
			} else {
				platformData.append("-").append(plat.name());
			}
		}

		writer.write(platformData.toString());

		writer.write("," + this.getGenre().name());

		writer.close();
	}
}
