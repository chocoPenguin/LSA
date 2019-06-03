package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Sul.Deck;

public class Gaming_Panel_Mouse	implements MouseListener, MouseMotionListener{
	JLabel rect;
	ArrayList<JLabel> circle_set=new ArrayList<JLabel>();
	public int flag_clicked=0;
	
	private int mouse_grid_x=0, mouse_grid_y=0, mouse_x=0, mouse_y=0;
	
	//Returning grid location
	public int get_posX() {return mouse_grid_x;}
	public int get_posY() {return mouse_grid_y;}
	//Returning real location
	public int get_x() {return mouse_x;}
	public int get_y() {return mouse_y;}
	
	@SuppressWarnings("deprecation")
	public Gaming_Panel_Mouse() {
		ImageIcon icon_rect=new ImageIcon("src/Image/Border_black.png");
		ImageIcon icon_circle=new ImageIcon("src/Image/Border_circle.png");
		Image img_rect=icon_rect.getImage();
		Image img_circle=icon_circle.getImage();
		
		rect=new JLabel(icon_rect);
		
		for(int i=0;i<4;i++) {
			circle_set.add(new JLabel(icon_circle));
			circle_set.get(i).setSize(60,60);
			circle_set.get(i).disable();
			circle_set.get(i).setVisible(false);
		}
		rect.setSize(40,40);
		
		set_circle();
		
	}
	
	void set_circle() {
		JLabel tmp_label=new JLabel("1");
		tmp_label.setForeground(Color.white);
		tmp_label.setSize(100,30);
		tmp_label.setLocation(10,15);
		tmp_label.setFont(new Font("±Ã¼­",Font.BOLD,16));
		circle_set.get(0).add(tmp_label);
		
		tmp_label=new JLabel("2");
		tmp_label.setForeground(Color.white);
		tmp_label.setSize(100,30);
		tmp_label.setLocation(10,15);
		tmp_label.setFont(new Font("±Ã¼­",Font.BOLD,16));
		circle_set.get(1).add(tmp_label);
		
		tmp_label=new JLabel("3");
		tmp_label.setForeground(Color.white);
		tmp_label.setSize(100,30);
		tmp_label.setLocation(10,15);
		tmp_label.setFont(new Font("±Ã¼­",Font.BOLD,16));
		circle_set.get(2).add(tmp_label);
		
		tmp_label=new JLabel("4");
		tmp_label.setForeground(Color.white);
		tmp_label.setSize(100,30);
		tmp_label.setLocation(10,15);
		tmp_label.setFont(new Font("±Ã¼­",Font.BOLD,16));
		circle_set.get(3).add(tmp_label);
	}
	
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {
		mouse_x=e.getX();	
		mouse_y=e.getY();
		mouse_grid_x=e.getX()/40;
		mouse_grid_y=e.getY()/40;
	}
	public void mouseClicked(MouseEvent e) {
		flag_clicked=1;
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}
