package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Sul.*;
//import Gacha_Panel;



public class Main_Panel extends JPanel{
	Random random=new Random();
	Deck d;
	Main m;
	//Deck d;
	//Gacha g;
	
	ImageIcon push = new ImageIcon("src/Image/역따봉1.png");
	Image puush = push.getImage();
	ImageIcon ga = new ImageIcon("src/Image/버튼300,100.png");
	Image gaa=ga.getImage();
	
	JLabel feed = new JLabel("먹이기");
	JLabel warning=new JLabel("덱이 비어있습니다...");
	JLabel deck = new JLabel("덱");
	JLabel Gacha = new JLabel("뽑기");
	JLabel send = new JLabel(push);

	MouseAdapter changetoGacha;
	MouseAdapter changetoDeck;
	MouseAdapter changetofeed;
	MouseAdapter send_message;
	MouseAdapter warning_label;
	
	ImageIcon background = new ImageIcon("src/Image/main_background.png");
	Image back=background.getImage();	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(main_image, 50, 0, 710, 710, this);
		Color c=new Color(0,0,0,150);
		g.setColor(c);
		g.fillRect(820, 110, 300, 100);
		g.fillRect(820, 310, 300, 100);
		g.fillRect(820, 510, 300, 100);

	}
	
	//JLabel gacha_image;
	
	public void gacha (Deck deck) {
		int ran_num=random.nextInt(320);
		//System.out.println(ran_num);
		if(ran_num<80) {
			//For Apple
			if(ran_num<41)  { deck.my_sul_list.add(new Sul_Apple(1));}
			if(ran_num>=41 && ran_num<66){deck.my_sul_list.add(new Sul_Apple(2));}
			if(ran_num>=66 && ran_num<75){deck.my_sul_list.add(new Sul_Apple(3));}
			if(ran_num==76){deck.my_sul_list.add(new Sul_Apple(4));}
			if(ran_num>=77 && ran_num<80){deck.my_sul_list.add(new Sul_Apple(5));}
		}else if(ran_num<160) {
			//For Beer
			if(ran_num<121)  {deck.my_sul_list.add(new Sul_Beer(1));}
			if(ran_num>=121 && ran_num<146){deck.my_sul_list.add(new Sul_Beer(2));}
			if(ran_num>=146 && ran_num<155){deck.my_sul_list.add(new Sul_Beer(3));}
			if(ran_num==156){deck.my_sul_list.add(new Sul_Beer(4));}
			if(ran_num>=157 && ran_num<160){deck.my_sul_list.add(new Sul_Beer(5));}
		}else if(ran_num<240) {
			//For fresh
			if(ran_num<201)  {deck.my_sul_list.add(new Sul_Fresh(1));}
			if(ran_num>=201 && ran_num<226){deck.my_sul_list.add(new Sul_Fresh(2));}
			if(ran_num>=226 && ran_num<235){deck.my_sul_list.add(new Sul_Fresh(3));}
			if(ran_num==236){deck.my_sul_list.add(new Sul_Fresh(4));}
			if(ran_num>=237 && ran_num<240){deck.my_sul_list.add(new Sul_Fresh(5));}
		}else if(ran_num<320) {
			//For  wine
			if(ran_num<281)  {deck.my_sul_list.add(new Sul_Wine(1));}
			if(ran_num>=281 && ran_num<306){deck.my_sul_list.add(new Sul_Wine(2));}
			if(ran_num>=306 && ran_num<315){deck.my_sul_list.add(new Sul_Wine(3));}
			if(ran_num==316){deck.my_sul_list.add(new Sul_Wine(4));}
			if(ran_num>=317 && ran_num<320){deck.my_sul_list.add(new Sul_Wine(5));}
		}
		//for (int i=0;i<deck.my_sul_list.size();i++) {
		//	System.out.println(deck.my_sul_list.get(i).name);
		//}
		//System.out.print("\n");
		deck.current_sul=deck.my_sul_list.get(deck.my_sul_list.size()-1);
		//gacha_image=new JLabel(deck.my_sul_list.get(deck.my_sul_list.size()-1).icon1);
		//gacha_image.setLocation(300, 100);
		//gacha_image.setSize(700, 700);
		//gacha_image.setVerticalAlignment(SwingConstants.TOP);
		//gacha_image.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	Image main_image;
	
	Main_Panel(Deck d, Main m){
		this.m = m;
		Color c1=new Color(255,212, 001);
		Color c2=new Color(255, 255, 255, 200);
		setLayout(null);
		feed.setLocation(820, 110);
		feed.setSize(300, 100);
		feed.setFont(new Font("DX시인과나",Font.BOLD,50));
		feed.setBorder(new TitledBorder(new LineBorder(c1,5)));
		feed.setForeground(c2);
		feed.setHorizontalAlignment(SwingConstants.CENTER);
		add(feed);
		deck.setLocation(820, 310);
		deck.setSize(300, 100);
		deck.setFont(new Font("DX시인과나",Font.BOLD,50));
		deck.setForeground(c2);
		deck.setBorder(new TitledBorder(new LineBorder(c1,5)));
		deck.setHorizontalAlignment(SwingConstants.CENTER);
		add(deck); 
		Gacha.setLocation(820, 510);
		Gacha.setSize(300, 100);
		Gacha.setFont(new Font("DX시인과나",Font.BOLD,50));
		Gacha.setForeground(c2);
		Gacha.setBorder(new TitledBorder(new LineBorder(c1,5)));
		Gacha.setHorizontalAlignment(SwingConstants.CENTER);
		add(Gacha);
		send.setLocation(10, 630);
		send.setSize(50, 50);
		add(send);
		warning.setSize(700,100);
		warning.setLocation(100,510);
		warning.setHorizontalAlignment(SwingConstants.CENTER);
		warning.setOpaque(true);
		warning.setFont(new Font("DX시인과나",Font.BOLD,50));
		Color c=new Color(0,0,0,150);
		warning.setForeground(Color.white);
		warning.setBackground(c);
		warning.setVisible(false);
		warning.setEnabled(false);
		add(warning);
		
		changetoGacha=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				m.gacha_panel.count_and_reset();
				m.gacha_panel.cnt++;
				//System.out.println(m.gacha_panel.cnt);
				if (m.gacha_panel.cnt>10) {
					m.change("End");
				}
				else {
					gacha(d);
					m.gacha_panel.changeimage(d.my_sul_list);
			
					m.change("Gacha");
				}
			}
		};
		changetoDeck=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				m.change("deck");
			}
		};
		
		changetofeed=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(!void_check(d)) {
					m.threadStart();
					m.change("game");
				} else {
					warning.setVisible(true);
					warning.setEnabled(true);
				}
			}
		};
		
		send_message=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String message = JOptionPane.showInputDialog("개발자에게 평가를 보내주세요.");
				if (message!=null) {
					// 소켓전송
					User u = new User(message);
					//System.out.print("Qodor");
					u.run();
					JOptionPane.showMessageDialog(null, "더 좋은 서비스로 찾아뵙겠습니다.");	
				}
			}
		};
		warning_label=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				warning.setVisible(false);
				warning.setEnabled(false);
			}
		};
		
		deck.addMouseListener(changetoDeck);
		Gacha.addMouseListener(changetoGacha);
		send.addMouseListener(send_message);
		feed.addMouseListener(changetofeed);
		warning.addMouseListener(warning_label);
			
		this.setFocusable(true);
	
	}
/*
	class send_message implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String message = JOptionPane.showInputDialog("개발자에게 평가를 보내주세요.");
			if (message!=null) {
				// 소켓전송
				User u = new User(message);
				//System.out.print("Qodor");
				u.run();
				JOptionPane.showMessageDialog(null, "더 좋은 서비스로 찾아뵙겠습니다.");	
			}
		}
	}
	*/
	
	public void changemain(ArrayList<Sul_Base> sul, Deck deck) {
		main_image = deck.first_sul.icon2.getImage();
		repaint();
	}
	
	public boolean void_check(Deck deck) {
		if(deck.first_sul.name=="None"&&
		   deck.second_sul.name=="None"&&
		   deck.third_sul.name=="None"&&
		   deck.fourth_sul.name=="None") {
			return true;
		}
		else return false;
	}
}
