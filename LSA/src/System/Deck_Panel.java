package System;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import Sul.*;

// 버튼에 해당하는 술 사진넣기, 데이터 적기
// 덱에서 캐릭터 바꾸기

public class Deck_Panel extends JPanel{
	Main m;
	//Deck d;
	
	// 배경
	ImageIcon background = new ImageIcon("src/Image/main_background.png");
	Image back=background.getImage();
	Image ch1;
	
	// 메뉴가는 버튼
	JLabel Go_To_Menu = new JLabel("< Menu");
	
	
	// 캐릭터 선택 버튼
	/*
	JButton ch1_face=new JButton();
	JLabel ch1_damage=new JLabel("Damage", SwingConstants.CENTER);
	JLabel ch1_cost=new JLabel("Cost", SwingConstants.CENTER);
	JLabel ch1_charm=new JLabel("Charm", SwingConstants.CENTER);
	JButton ch2_face=new JButton();
	JLabel ch2_damage=new JLabel("Damage", SwingConstants.CENTER);
	JLabel ch2_cost=new JLabel("Cost", SwingConstants.CENTER);
	JLabel ch2_charm=new JLabel("Charm", SwingConstants.CENTER);
	JButton ch3_face=new JButton();
	JLabel ch3_damage=new JLabel("Damage", SwingConstants.CENTER);
	JLabel ch3_cost=new JLabel("Cost", SwingConstants.CENTER);
	JLabel ch3_charm=new JLabel("Charm", SwingConstants.CENTER);
	JButton ch4_face=new JButton();
	JLabel ch4_damage=new JLabel("Damage", SwingConstants.CENTER);
	JLabel ch4_cost=new JLabel("Cost", SwingConstants.CENTER);
	JLabel ch4_charm=new JLabel("Charm", SwingConstants.CENTER);	
	*/
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		Color cl=new Color(0, 0, 0, 100);
		g.setColor(cl);
		g.fillRect(5, 80, 315, 630);
		g.fillRect(323, 80, 315, 630);
		g.fillRect(641, 80, 315, 635);
		g.fillRect(959, 80, 315, 635);
		Color c2=new Color(0,0,0,150);
		g.setColor(c2);
		g.fillRect(10, 490, 308, 60);
		g.fillRect(10, 555, 308, 60);
		g.fillRect(10, 620, 308, 60);
		g.fillRect(328, 490, 308, 60);
		g.fillRect(328, 555, 308, 60);
		g.fillRect(328, 620, 308, 60);
		g.fillRect(646, 490, 308, 60);
		g.fillRect(646, 555, 308, 60);
		g.fillRect(646, 620, 308, 60);
		g.fillRect(964, 490, 308, 60);
		g.fillRect(964, 555, 308, 60);
		g.fillRect(964, 620, 308, 60);
		
		Color c3=new Color(255, 255, 255);
		g.setColor(c3);
		add(ch1_face);
		add(ch2_face);
		add(ch3_face);
		add(ch4_face);
		add(ch1_damage);
		add(ch2_damage);
		add(ch3_damage);
		add(ch4_damage);
		add(ch1_cost);
		add(ch2_cost);
		add(ch3_cost);
		add(ch4_cost);
		add(ch1_charm);
		add(ch2_charm);
		add(ch3_charm);
		add(ch4_charm);
	}
	
	JButton ch1_face;
	JButton ch2_face;
	JButton ch3_face;
	JButton ch4_face;
	JLabel ch1_damage;
	JLabel ch2_damage;
	JLabel ch3_damage;
	JLabel ch4_damage;
	JLabel ch1_cost;
	JLabel ch2_cost;
	JLabel ch3_cost;
	JLabel ch4_cost;
	JLabel ch1_charm;
	JLabel ch2_charm;
	JLabel ch3_charm;
	JLabel ch4_charm;
	
	
	Deck_Panel(Deck deck, Main m){
		//this.d=d;
		this.m = m;
		
		MouseAdapter choosedeck1;
		MouseAdapter choosedeck2;
		MouseAdapter choosedeck3;
		MouseAdapter choosedeck4;
		MouseAdapter backtomenu;
		
		setLayout(null);
		
		//메뉴로 가는 버튼 추가
		Color c1=new Color(255,212,001);
		Color c2=new Color(255,255,255,200);

		Go_To_Menu.setFont(new Font("DX시인과나", Font.BOLD, 40));
		Go_To_Menu.setBorder(new TitledBorder(new LineBorder(c1,5)));
		Go_To_Menu.setForeground(c2);
		Go_To_Menu.setHorizontalAlignment(SwingConstants.CENTER);
		Go_To_Menu.setLocation(10,5);
		Go_To_Menu.setSize(240,70);
		add(Go_To_Menu);
			
		
		ch1_face=new JButton(deck.first_sul.icon1);
		ch1_damage=new JLabel("Damage: " + String.valueOf(deck.first_sul.attack_damage), SwingConstants.CENTER);
		ch1_cost=new JLabel("Cost: "+String.valueOf(deck.first_sul.cost), SwingConstants.CENTER);
		ch1_charm=new JLabel("Charm: "+String.valueOf(deck.first_sul.charm_type1)+" / "+String.valueOf(deck.first_sul.charm_type2), SwingConstants.CENTER);
		ch2_face=new JButton(deck.second_sul.icon1);
		ch2_damage=new JLabel("Damage: "+String.valueOf(deck.second_sul.attack_damage), SwingConstants.CENTER);
		ch2_cost=new JLabel("Cost: "+String.valueOf(deck.second_sul.cost), SwingConstants.CENTER);
		ch2_charm=new JLabel("Charm: "+String.valueOf(deck.second_sul.charm_type1)+" / "+String.valueOf(deck.second_sul.charm_type2), SwingConstants.CENTER);
		ch3_face=new JButton(deck.third_sul.icon1);
		ch3_damage=new JLabel("Damage: "+String.valueOf(deck.third_sul.attack_damage), SwingConstants.CENTER);
		ch3_cost=new JLabel("Cost: "+String.valueOf(deck.third_sul.cost), SwingConstants.CENTER);
		ch3_charm=new JLabel("Charm: "+String.valueOf(deck.third_sul.charm_type1)+" / "+String.valueOf(deck.third_sul.charm_type2), SwingConstants.CENTER);
		ch4_face=new JButton(deck.fourth_sul.icon1);
		ch4_damage=new JLabel("Damage: "+String.valueOf(deck.fourth_sul.attack_damage), SwingConstants.CENTER);
		ch4_cost=new JLabel("Cost: "+String.valueOf(deck.fourth_sul.cost), SwingConstants.CENTER);
		ch4_charm=new JLabel("Charm: "+String.valueOf(deck.fourth_sul.charm_type1)+" / "+String.valueOf(deck.fourth_sul.charm_type2), SwingConstants.CENTER);	
		
		//캐릭터를 나타내는 부분 추가
		ch1_face.setLocation(10,85);
		ch1_face.setSize(308, 400);
		ch1_damage.setLocation(10, 500);
		ch1_damage.setSize(308, 40);
		ch1_damage.setForeground(Color.WHITE);
		ch1_damage.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch1_cost.setLocation(10, 565);
		ch1_cost.setSize(308, 40);
		ch1_cost.setForeground(Color.WHITE);
		ch1_cost.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch1_charm.setLocation(10, 630);
		ch1_charm.setSize(308, 40);
		ch1_charm.setForeground(Color.WHITE);
		ch1_charm.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch2_face.setLocation(328,85);
		ch2_face.setSize(308, 400);
		ch2_damage.setLocation(328, 500);
		ch2_damage.setSize(308, 40);
		ch2_damage.setForeground(Color.WHITE);
		ch2_damage.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch2_cost.setLocation(328, 565);
		ch2_cost.setSize(308, 40);
		ch2_cost.setForeground(Color.WHITE);
		ch2_cost.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch2_charm.setLocation(328, 630);
		ch2_charm.setSize(308, 40);
		ch2_charm.setForeground(Color.WHITE);
		ch2_charm.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch3_face.setLocation(646,85);
		ch3_face.setSize(308, 400);
		ch3_damage.setLocation(646, 500);
		ch3_damage.setSize(308, 40);
		ch3_damage.setForeground(Color.WHITE);
		ch3_damage.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch3_cost.setLocation(646, 565);
		ch3_cost.setSize(308, 40);
		ch3_cost.setForeground(Color.WHITE);
		ch3_cost.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch3_charm.setLocation(646, 630);
		ch3_charm.setSize(308, 40);
		ch3_charm.setForeground(Color.WHITE);
		ch3_charm.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch4_face.setLocation(964,85);
		ch4_face.setSize(308, 400);
		ch4_damage.setLocation(964, 500);
		ch4_damage.setSize(308, 40);
		ch4_damage.setForeground(Color.WHITE);
		ch4_damage.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch4_cost.setLocation(964, 565);
		ch4_cost.setSize(308, 40);
		ch4_cost.setForeground(Color.WHITE);
		ch4_cost.setFont(new Font("DX시인과나", Font.BOLD, 30));
		ch4_charm.setLocation(964, 630);
		ch4_charm.setSize(308, 40);
		ch4_charm.setForeground(Color.WHITE);
		ch4_charm.setFont(new Font("DX시인과나", Font.BOLD, 30));
		// 캐릭터 클릭 시 리스트가 뜨고 리스트에서 선택시 해당 캐릭터로 교체
		
		choosedeck1=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				m.list_panel1.getdeck(deck.my_sul_list, deck);
				//m.list_panel.setdeck(deck.my_sul_list, deck);
				m.list_panel1.refresh_list();
				m.change("List");
			}
		};
		choosedeck2=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				m.list_panel2.getdeck(deck.my_sul_list, deck);
				//m.list_panel.setdeck(deck.my_sul_list, deck);
				m.list_panel2.refresh_list();
				m.change("List2");
			}
		};
		choosedeck3=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				m.list_panel3.getdeck(deck.my_sul_list, deck);
				//m.list_panel.setdeck(deck.my_sul_list, deck);
				m.list_panel3.refresh_list();
				m.change("List3");
			}
		};
		choosedeck4=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				m.list_panel4.getdeck(deck.my_sul_list, deck);
				//m.list_panel.setdeck(deck.my_sul_list, deck);
				m.list_panel4.refresh_list();
				m.change("List4");
			}
		};
		
		backtomenu = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.change("Menu");
			}
		};
		
		ch1_face.addMouseListener(choosedeck1);
		ch2_face.addMouseListener(choosedeck2);
		ch3_face.addMouseListener(choosedeck3);
		ch4_face.addMouseListener(choosedeck4);
		Go_To_Menu.addMouseListener(backtomenu);
	}

	public void change1(ArrayList<Sul_Base> sul, Deck deck) {
		ch1_face.setIcon(deck.first_sul.icon1);
		ch1_damage.setText("Damage: "+String.valueOf(deck.first_sul.attack_damage));
		ch1_cost.setText("Cost: "+String.valueOf(deck.first_sul.cost));
		ch1_charm.setText("Charm: "+String.valueOf(deck.first_sul.charm_type1)+" / "+deck.first_sul.charm_type2);
		repaint();
	}
	public void change2(ArrayList<Sul_Base> sul, Deck deck) {
		ch2_face.setIcon(deck.second_sul.icon1);
		ch2_damage.setText("Damage: "+String.valueOf(deck.second_sul.attack_damage));
		ch2_cost.setText("Cost: "+String.valueOf(deck.second_sul.cost));
		ch2_charm.setText("Charm: "+String.valueOf(deck.second_sul.charm_type1)+" / "+deck.second_sul.charm_type2);
		repaint();
	}
	public void change3(ArrayList<Sul_Base> sul, Deck deck) {
		ch3_face.setIcon(deck.third_sul.icon1);
		ch3_damage.setText("Damage: "+String.valueOf(deck.third_sul.attack_damage));
		ch3_cost.setText("Cost: "+String.valueOf(deck.third_sul.cost));
		ch3_charm.setText("Charm: "+String.valueOf(deck.third_sul.charm_type1)+" / "+deck.third_sul.charm_type2);
		repaint();
	}
	public void change4(ArrayList<Sul_Base> sul, Deck deck) {
		ch4_face.setIcon(deck.fourth_sul.icon1);
		ch4_damage.setText("Damage: "+String.valueOf(deck.fourth_sul.attack_damage));
		ch4_cost.setText("Cost: "+String.valueOf(deck.fourth_sul.cost));
		ch4_charm.setText("Charm: "+String.valueOf(deck.fourth_sul.charm_type1)+" / "+deck.fourth_sul.charm_type2);
		repaint();
	}
}
