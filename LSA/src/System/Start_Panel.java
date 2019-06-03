package System;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import Sul.*;

public class Start_Panel extends JPanel {
	Main m;
	
	JLabel start = new JLabel("Start");
	JLabel quit = new JLabel("Quit");
	
	ImageIcon background = new ImageIcon("src/Image/Start.png");
	Image back=background.getImage();
	
	MouseAdapter sstart;
	MouseAdapter qquit;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
	
	Start_Panel(Deck d, Main m){
		this.m=m;
		setLayout(null);
		
		Color c1=new Color(255, 255, 255, 0);
		start.setLocation(70, 250);
		start.setSize(300, 100);
		start.setFont(new Font("DX시인과나",Font.BOLD,80));
		start.setBackground(c1);
		start.setHorizontalAlignment(SwingConstants.CENTER);
		add(start);
		quit.setLocation(70, 400);
		quit.setSize(300, 100);
		quit.setFont(new Font("DX시인과나",Font.BOLD,80));
		quit.setBackground(c1);
		quit.setHorizontalAlignment(SwingConstants.CENTER);
		add(quit);
		
		sstart=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Color c2=new Color(0, 0, 0, 100);
				//start.setBackground(c1);
				//repaint();
				m.change("Menu");
			}
		};
		
		qquit=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Server Stop");
				System.exit(0);
			}
		};
		
		start.addMouseListener(sstart);
		quit.addMouseListener(qquit);
	}
	
}
