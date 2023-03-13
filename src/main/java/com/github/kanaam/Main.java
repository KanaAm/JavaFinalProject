package com.github.kanaam;

import com.github.kanaam.models.ImageLoader;
import com.github.kanaam.panel.Homepage;

import java.awt.*;
import java.io.IOException;

public class Main {
	private static ImageLoader loader;
	public static void main(String[] args) throws IOException {

		// Always load
		AnimeRegister.loadFile();
		loader = new ImageLoader();
		loader.load();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public static ImageLoader getImageLoader(){
		return loader;
	}

}
