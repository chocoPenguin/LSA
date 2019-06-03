package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Sul.*;

public class Result_Panel extends JPanel{
	Result_Panel(Deck deck, Main m, double d, int i){
		JLabel Goal=new JLabel("Goal: "+0.1);
		JLabel Score=new JLabel("Score: "+d);
		JLabel Cost=new JLabel("Cost: "+i);
		JLabel Result=new JLabel();
		JLabel Go_To_Menu=new JLabel("Menu >");
		
		MouseAdapter backtomenu;
		
		Color c1=new Color(255,212,001);
		Color c2=new Color(255,255,255,200);
		
		Go_To_Menu.setFont(new Font("DX시인과나", Font.BOLD, 40));
		Go_To_Menu.setBorder(new TitledBorder(new LineBorder(c1,5)));
		Go_To_Menu.setForeground(c2);
		Go_To_Menu.setHorizontalAlignment(SwingConstants.CENTER);
		Go_To_Menu.setLocation(1000,600);
		Go_To_Menu.setSize(240,70);
		add(Go_To_Menu);
		
		setSize(1280,720);
		setLayout(null);
		setBackground(Color.black);
		
		if(d>=0.1) Result.setText("SUCCESS");
		else Result.setText("FAIL");
		
		Goal.setSize(500,100);
		Goal.setForeground(Color.white);
		Goal.setFont(new Font("DX시인과나",Font.BOLD,32));
		Goal.setLocation(390,150);
		Goal.setHorizontalAlignment(SwingConstants.CENTER);
		
		Score.setSize(500,100);
		Score.setForeground(Color.white);
		Score.setFont(new Font("DX시인과나",Font.BOLD,32));
		Score.setLocation(390,220);
		Score.setHorizontalAlignment(SwingConstants.CENTER);
		
		Cost.setSize(500,100);
		Cost.setForeground(Color.white);
		Cost.setFont(new Font("DX시인과나",Font.BOLD,32));
		Cost.setLocation(390,290);
		Cost.setHorizontalAlignment(SwingConstants.CENTER);
		
		Result.setSize(500,100);
		Result.setForeground(Color.white);
		Result.setFont(new Font("DX시인과나",Font.BOLD,32));
		Result.setLocation(390,360);
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(Goal);
		add(Score);
		add(Cost);
		add(Result);
		
		backtomenu = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.change("Menu");
			}
		};
		
		Go_To_Menu.addMouseListener(backtomenu);
	}
}
