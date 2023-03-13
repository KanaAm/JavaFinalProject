package com.github.kanaam;

import com.github.kanaam.models.Anime;
import com.github.kanaam.models.Genre;
import com.github.kanaam.models.Platform;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AnimeRegister {

	private static final Map<String , Anime> byName = new HashMap<>();

	public static Anime getByName(String name) {
		return byName.get(name);
	}

	public static void loadFile() throws IOException {

		File toRead = new File(Paths.get("").toAbsolutePath() + "\\anime.dat");
		if(!toRead.exists()) 
			toRead.createNewFile();
		BufferedReader reader = new BufferedReader(new FileReader(toRead));

		Anime anime;
		String temp,name;

		while ( (temp = reader.readLine()) != null ) {

			String[] data = temp.split(",");

			name = data[0];
			String date = data[1];
			String[] details = data[2].split("-");
			String[] platforms = data[3].split("-");
			String genre = data[4];

			anime = new Anime(name , date , Genre.valueOf(genre));
			anime.setDetails(details);

			List<Platform> platformList = new ArrayList<>();

			for (int i = 0; i < platforms.length; i++) {

				Platform pl = Platform.valueOf(platforms[i]);
				platformList.add(pl);
			}

			Platform[] platArray = new Platform[platformList.size()];

			for (int i = 0; i < platformList.size(); i++) {

				platArray[i] = platformList.get(i);
			}

			anime.setPlatform(platArray);

			byName.put(name , anime);
		}
	}
}
