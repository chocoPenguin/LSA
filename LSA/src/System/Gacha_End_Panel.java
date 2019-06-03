package System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Sul.*;

public class Gacha_End_Panel extends JPanel {

	
	Deck deck;
	Main m;
	int cnt=0;
	//my_sul_list의 이미지 정보 저장
	
	// 배경
	ImageIcon background = new ImageIcon("src/Image/main_background.png");
	Image back=background.getImage();
	ImageIcon end=new ImageIcon("src/Image/가챠20까지.png");
	Image ending=end.getImage();
	
	MouseAdapter backtomenu;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		Color cl=new Color(0, 0, 0, 100);
		g.setColor(cl);
		g.fillRect(5, 5, 1275, 715);
		g.fillRect(350, 100, 600, 400);
		g.drawImage(ending, 360, 110, 580, 380, this);
	}
	
	Gacha_End_Panel(Deck deck, Main m){
		this.m=m;
		setLayout(null);
		Color c1=new Color(255,212,001);
		Color c2=new Color(255,255,255,200);
		JLabel back = new JLabel("< Menu");
		back.setLocation(525, 520);
		back.setSize(250, 90);
		back.setFont(new Font("DX시인과나", Font.BOLD, 40));
		back.setBorder(new TitledBorder(new LineBorder(c1,5)));
		back.setForeground(c2);
		back.setHorizontalAlignment(SwingConstants.CENTER);
		add(back);

		backtomenu = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.change("Menu");
			}
		};
		
		back.addMouseListener(backtomenu);
	}
	
}

