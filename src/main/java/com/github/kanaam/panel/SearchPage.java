package com.github.kanaam.panel;

import com.github.kanaam.Main;
import com.github.kanaam.models.Anime;
import com.github.kanaam.models.Genre;
import com.github.kanaam.models.Platform;
import com.github.kanaam.utils.TextUtil;

import java.awt.*;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.soap.Detail;

public class SearchPage extends JFrame {

	private JPanel contentPane;

	public SearchPage(Anime anime) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel infoBlock = new JPanel();
		infoBlock.setBackground(new Color(192, 192, 192));
		infoBlock.setBounds(422, 55, 436, 413);
		contentPane.add(infoBlock);
		infoBlock.setLayout(null);

		JLabel animeName = new JLabel(TextUtil.capitalizeFirstLetter(anime.getName()));
		animeName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		animeName.setBounds(32, 24, 377, 25);
		infoBlock.add(animeName);

		JLabel genre = new JLabel(anime.getGenre().getGenre());
		genre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		genre.setBounds(32, 69, 377, 25);
		infoBlock.add(genre);

		JLabel detailsblock = new JLabel("Details");
		detailsblock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		detailsblock.setBounds(32, 112, 377, 25);
		infoBlock.add(detailsblock);

		String[] detailsLine = anime.getDetails().split("\n");
		String line1 = "";
		String line2 = "";
		String line3 = "";
		String line4 = "";
		String line5 = "";
		String line6 = "";
		String line7 = "";

		switch (detailsLine.length) {
			case 1:
				line1 = detailsLine[0];
				break;
			case 2:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				break;
			case 3:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				line3 = detailsLine[2];
				break;
			case 4:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				line3 = detailsLine[2];
				line4 = detailsLine[3];
				break;
			case 5:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				line3 = detailsLine[2];
				line4 = detailsLine[3];
				line5 = detailsLine[4];
				break;
			case 6:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				line3 = detailsLine[2];
				line4 = detailsLine[3];
				line5 = detailsLine[4];
				line6 = detailsLine[5];
				break;
			case 7:
				line1 = detailsLine[0];
				line2 = detailsLine[1];
				line3 = detailsLine[2];
				line4 = detailsLine[3];
				line5 = detailsLine[4];
				line6 = detailsLine[5];
				line7 = detailsLine[6];
				break;
		}

		JLabel Line1 = new JLabel(line1);
		Line1.setVerticalAlignment(SwingConstants.TOP);
		Line1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line1.setBounds(32, 148, 375, 25);
		infoBlock.add(Line1);

		JLabel Line2 = new JLabel(line2);
		Line2.setVerticalAlignment(SwingConstants.TOP);
		Line2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line2.setBounds(32, 179, 375, 25);
		infoBlock.add(Line2);

		JLabel Line3 = new JLabel(line3);
		Line3.setVerticalAlignment(SwingConstants.TOP);
		Line3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line3.setBounds(32, 213, 375, 25);
		infoBlock.add(Line3);

		JLabel Line4 = new JLabel(line4);
		Line4.setVerticalAlignment(SwingConstants.TOP);
		Line4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line4.setBounds(32, 247, 375, 25);
		infoBlock.add(Line4);

		JLabel Line5 = new JLabel(line5);
		Line5.setVerticalAlignment(SwingConstants.TOP);
		Line5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line5.setBounds(32, 279, 375, 25);
		infoBlock.add(Line5);

		JLabel Line6 = new JLabel(line6);
		Line6.setVerticalAlignment(SwingConstants.TOP);
		Line6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line6.setBounds(32, 311, 375, 25);
		infoBlock.add(Line6);

		JLabel Line7 = new JLabel(line7);
		Line7.setVerticalAlignment(SwingConstants.TOP);
		Line7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Line7.setBounds(32, 347, 375, 25);
		infoBlock.add(Line7);



		JLabel image = new JLabel("");
		ImageIcon showimage = Main.getImageLoader().getImage(anime.getName());
		image.setIcon(showimage);
		image.setBounds(38, 55, 350, 413);
		contentPane.add(image);

		JLabel biliBili = new JLabel("");
		Image bilibiliIcon = new ImageIcon(this.getClass().getResource("/bilibiliImage.png")).getImage();
		biliBili.setIcon(new ImageIcon(bilibiliIcon));
		biliBili.setBounds(79, 515, 65, 65);
		contentPane.add(biliBili);

		JLabel netFlix = new JLabel("");
		Image netFlixIcon = new ImageIcon(this.getClass().getResource("/netFlix.png")).getImage();
		netFlix.setIcon(new ImageIcon(netFlixIcon));
		netFlix.setBounds(213, 515, 65, 65);
		contentPane.add(netFlix);

		JLabel disneyPlus = new JLabel("");
		Image disneyPlusIcon = new ImageIcon(this.getClass().getResource("/disneyPlus.png")).getImage();
		disneyPlus.setIcon(new ImageIcon(disneyPlusIcon));
		disneyPlus.setBounds(348, 515, 65, 65);
		contentPane.add(disneyPlus);

		JLabel aisPlay = new JLabel("");
		Image aisPlayIcon = new ImageIcon(this.getClass().getResource("/aisPlay.png")).getImage();
		aisPlay.setIcon(new ImageIcon(aisPlayIcon));
		aisPlay.setBounds(487, 515, 65, 65);
		contentPane.add(aisPlay);

		JLabel amazonPrime = new JLabel("");
		Image amazonPrimeIcon = new ImageIcon(this.getClass().getResource("/amazonPrime.png")).getImage();
		amazonPrime.setIcon(new ImageIcon(amazonPrimeIcon));
		amazonPrime.setBounds(620, 515, 65, 65);
		contentPane.add(amazonPrime);

		JLabel muse = new JLabel("");
		Image museIcon = new ImageIcon(this.getClass().getResource("/muse.png")).getImage();
		muse.setIcon(new ImageIcon(museIcon));
		muse.setBounds(754, 515, 65, 65);
		contentPane.add(muse);

		JPanel BilbilTf = new JPanel();
		if(!anime.isAvailable(Platform.BILIBILI))
			BilbilTf.setBackground(new Color(255, 0, 0));
		else
			BilbilTf.setBackground(new Color(64, 234, 84));
		BilbilTf.setBounds(89, 591, 44, 37);
		contentPane.add(BilbilTf);

		JPanel netflixTf = new JPanel();
		if(!anime.isAvailable(Platform.NETFLIX))
			netflixTf.setBackground(new Color(255, 0, 0));
		else
			netflixTf.setBackground(new Color(64, 234, 84));
		netflixTf.setBounds(223, 591, 44, 37);
		contentPane.add(netflixTf);

		JPanel disneyplusTf = new JPanel();
		if(!anime.isAvailable(Platform.DISNEY_PLUS))
			disneyplusTf.setBackground(new Color(255, 0, 0));
		else
			disneyplusTf.setBackground(new Color(64, 234, 84));
		disneyplusTf.setBounds(358, 591, 44, 37);
		contentPane.add(disneyplusTf);

		JPanel aisPlayTf = new JPanel();
		if(!anime.isAvailable(Platform.AISPLAY))
			aisPlayTf.setBackground(new Color(255, 0, 0));
		else
			aisPlayTf.setBackground(new Color(64, 234, 84));
		aisPlayTf.setBounds(497, 591, 44, 37);
		contentPane.add(aisPlayTf);

		JPanel amazonPrimeTf = new JPanel();
		if(!anime.isAvailable(Platform.AMAZON_PRIME))
			amazonPrimeTf.setBackground(new Color(255, 0, 0));
		else
			amazonPrimeTf.setBackground(new Color(64, 234, 84));
		amazonPrimeTf.setBounds(630, 591, 44, 37);
		contentPane.add(amazonPrimeTf);

		JPanel museTf = new JPanel();
		if(!anime.isAvailable(Platform.MUSE))
			museTf.setBackground(new Color(255, 0, 0));
		else
			museTf.setBackground(new Color(64, 234, 84));
		museTf.setBounds(764, 591, 44, 37);
		contentPane.add(museTf);

		JButton returnButton = new JButton("Return");
		returnButton.setBounds(769, 11, 89, 23);
		contentPane.add(returnButton);
		returnButton.addActionListener(e -> {
			Homepage homepage = new Homepage();
			homepage.setLocation(getLocation());
			dispose();
			homepage.setVisible(true);
		});
	}

}
