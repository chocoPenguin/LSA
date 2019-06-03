package System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Sul.*;

public class Gacha_Panel extends JPanel {

	Random random= new Random();
	Deck deck;
	Main m;
	int cnt=0;
	//my_sul_list의 이미지 정보 저장
	
	// 배경
	ImageIcon background = new ImageIcon("src/Image/main_background.png");
	Image back=background.getImage();
	
	MouseAdapter backtomenu;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		Color cl=new Color(0, 0, 0, 100);
		g.setColor(cl);
		g.fillRect(5, 5, 1275, 715);
		g.drawImage(gacha_image, 500, 100, 308, 400, this);
	}
	
	
	
	Gacha_Panel(Deck deck, Main m){
		this.m=m;
		setLayout(null);
		JLabel back = new JLabel("< Menu");
		Color c1=new Color(255,212,001);
		Color c2=new Color(255,255,255,200);
		back.setLocation(530, 520);
		back.setSize(240, 90);
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
	
	Image gacha_image;

	public void changeimage(ArrayList<Sul_Base> sul){
		gacha_image = deck.my_sul_list.get(deck.my_sul_list.size()-1).icon1.getImage();
		repaint();
		
	}
	
	public void count_and_reset() {
		Calendar c=Calendar.getInstance();
		int hour, minute, second;
		hour=c.get(Calendar.HOUR);
		minute=c.get(Calendar.MINUTE);
		second=c.get(Calendar.SECOND);
		//System.out.print(hour+" "+minute+" "+second);
		
		if (hour==0&&minute==0&&second>0&&second<10) {
			cnt=0;
		}
				
	}
/*
	class backtomenu implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			m.change("Menu");
		}
	}
	*/
}

