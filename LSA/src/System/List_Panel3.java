package System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Sul.*;

public class List_Panel3 extends JPanel implements ListSelectionListener {

	Main m;
	Deck deck;
	int index;
	//my_sul_list의 이미지 정보 저장
	
	MouseAdapter change_sul;
	MouseAdapter todeck;
	
	JList namelist = new JList();
	DefaultListModel listModel = new DefaultListModel();
	JScrollPane list = new JScrollPane(namelist);
	
	// 배경
	ImageIcon background = new ImageIcon("src/Image/main_background.png");
	Image back=background.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		Color cl=new Color(0, 0, 0, 100);
		g.setColor(cl);
		g.fillRect(5, 80, 1265, 630);
				
	}
	
	public void getdeck(ArrayList<Sul_Base> sul, Deck deck){
		listModel.removeAllElements();
		for(int i=0;i<sul.size();i++) {
			//if (sul.get(i)==null)	name[i]="None";
			String tmp=sul.get(i).name;
			listModel.addElement(tmp);
			//System.out.println("추가: "+tmp);
		}
	}
	
	//namelist.getSelectedValue();
	
	
	public void setdeck3(ArrayList<Sul_Base> sul, Deck deck, int index) {
		Sul_Base tmp1_sul, tmp2_sul;
		
		// 해당 술을 tmp에 저장
		tmp1_sul=deck.get_third_sul();
		listModel.removeElement(listModel.getElementAt(index));
		tmp2_sul=deck.my_sul_list.get(index);
		deck.my_sul_list.remove(index);
		deck.my_sul_list.add(tmp1_sul);
		
		// 해당술에 선택술 저장
		deck.set_third_sul(tmp2_sul);
	}

	
	public void refresh_list () {
		//remove(sn);
		repaint();
	}
	
	JLabel Menu = new JLabel("< Back");
	JLabel select = new JLabel("Select");
	//JList namelist;
	
	List_Panel3(Deck deck, Main m){
		
		this.m=m;
		setLayout(null);
		Color c1=new Color(255,212, 001);
		Color c2=new Color(255, 255, 255, 200);
		//listModel.addElement(deck.my_sul_list.get(0));
		
		namelist.setModel(listModel);
		namelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//리스트 선택 리스너 등록
		namelist.addListSelectionListener(this);

		list.setLocation(80, 100);
		list.setSize(300, 550);
		list.setBackground(c2);
		//list.setOpaque(true);
		list.getViewport().setBackground(c2);
		//list.getViewport().setOpaque(isOpaque);
		add(list);
		
		Menu.setLocation(10, 5);
		Menu.setSize(240,70);
		Menu.setFont(new Font("DX시인과나",Font.BOLD,40));
		Menu.setForeground(c2);
		Menu.setBorder(new TitledBorder(new LineBorder(c1,5)));
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		add(Menu);
		select.setLocation(900, 500);
		select.setSize(300, 100);
		select.setFont(new Font("DX시인과나",Font.BOLD,40));
		select.setForeground(c2);
		select.setBorder(new TitledBorder(new LineBorder(c1,5)));
		select.setHorizontalAlignment(SwingConstants.CENTER);
		add(select);
		
		todeck = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				m.change("todeck");
			}
		};
		
		
		change_sul= new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("인덱스 : " +index);
				super.mouseClicked(e);
				setdeck3(deck.my_sul_list, deck, index);
				m.deck_panel.change3(deck.my_sul_list, deck);
				m.change("deck");
			}
		};
		select.addMouseListener(change_sul);
		Menu.addMouseListener(todeck);
	}
	
	//@Override
	public void valueChanged(ListSelectionEvent e) {
		// select를 누르면 setdeck
		index=namelist.getSelectedIndex();
		//listModel.getElementAt(index);
		//setdeck(deck.my_sul_list, deck, index);
		//System.out.println("선택된 인덱스 : "+index);
	 
	}
	
	
}
