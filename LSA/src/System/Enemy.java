package System;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Sul.*;

public class Enemy {
	ImageIcon icon_enemy=new ImageIcon("src/Image/적_1_배경제거.png");
	Image img_enemy=icon_enemy.getImage();
	JLabel label_enemy=new JLabel(icon_enemy);
	Random random = new Random();
	
	
	private int drunken=0;
	private int posX, posY;
	private int grid_x,grid_y;
	int searching_case=0;
	
	public Enemy() {
		this.posX=0;
		this.posY=0;
		
		label_enemy.setSize(30+random.nextInt(30),30+random.nextInt(30));
		label_enemy.setLocation(0,0);
	}
	
	public int howMuchDrunken() {return drunken;}
	public void drinking(int num) {drunken+=num;}
	public boolean isDrunken=false;
	public boolean isInBar() {
		if(label_enemy.isVisible()) return false;
		else return true;
	}
	
	public void changeImage(int num) {
		if(num==1) icon_enemy=new ImageIcon("src/Image/적_1_배경제거.png");
		else if(num==2) icon_enemy=new ImageIcon("src/Image/적_2_배경제거.png");
		img_enemy=icon_enemy.getImage();
		label_enemy=new JLabel(icon_enemy);
	}
	
	public void moveUp() {posY-=5;}
	public void moveDown() {posY+=5;}
	public void moveLeft() {posX-=5;}
	public void moveRight() {posX+=5;}
	
	public int getPosX() {return posX;}
	public int getPosY() {return posY;}
	
	public void Move() {
		grid_x=(posX/40)+2;
		grid_y=(posY/40)+2;
		
		int moveDirection=Maps.Map_Base.road.get(grid_y).get(grid_x);
		//moving through Maps.Map_Base.road data
		if(moveDirection==1) moveDown();
		else if(moveDirection==2) moveRight();
		else if(moveDirection==3) moveLeft();
		else if(moveDirection==4) moveUp();
	}
	
	public void searchingRoad(ArrayList<Sul_Base> a) {
		int i;
		grid_x=(posX/40)+2;
		grid_y=(posY/40)+2;
		
		if(isDrunken) {
			Move();
			searching_case=0;
			return;
		}
		
		// Searching Down -> Right -> Up -> Left
		if(Maps.Map_Base.road.get(grid_y+1).get(grid_x)>10) {searching_case=1;}
		else if(Maps.Map_Base.road.get(grid_y).get(grid_x+1)>10) {searching_case=2;}
		else if(Maps.Map_Base.road.get(grid_y-1).get(grid_x)>10) {searching_case=3;}
		else if(Maps.Map_Base.road.get(grid_y).get(grid_x-1)>10) {searching_case=4;}
	
		if(searching_case==0) {
			Move();
			searching_case=0;
			return;
		}
		
		i=findingBar(a,searching_case);
		
		if(i!=-1&&!a.get(i).isFull()) {
			inBar(a,searching_case,i);
			a.get(i).peopleIn();
		}else if(i!=1&&a.get(i).isFull()){
			Move();
		}else Move();
		searching_case=0;
	}
	
	public void inBar(ArrayList<Sul_Base> a, int c, int index) {
		grid_x=(posX/40)+2;
		grid_y=(posY/40)+2;
		
		label_enemy.setVisible(false);
		label_enemy.setEnabled(false);
		
		drinking(a.get(index).attack_damage);
		
		isDrunken=true;
		icon_enemy=new ImageIcon("src/Image/적_1_취함_배경제거.png");
		label_enemy.setIcon(icon_enemy);
	}
		
	public void outBar(ArrayList <Sul_Base>a) {
		label_enemy.setVisible(true);
		label_enemy.setEnabled(true);
	}
	
	public int findingBar(ArrayList<Sul_Base> a, int num) {
		int i=0;
		if(num==0) {
			for(i=0;i<a.size();i++) {
				if(a.get(i).posX/40==posX/40&&(a.get(i).posY)/40==(posY)/40) return i;
			}
		}else if(num==1) {
			for(i=0;i<a.size();i++) {
				if(a.get(i).posX/40==posX/40&&(a.get(i).posY)/40==(posY+40)/40) return i;
			}
		}else if(num==2) {
			for(i=0;i<a.size();i++) {
				if(a.get(i).posX/40==(posX+40)/40&&a.get(i).posY/40==posY/40) return i;
			}
		}else if(num==3) {
			for(i=0;i<a.size();i++) {
				if(a.get(i).posX/40==posX/40&&a.get(i).posY/40==(posY-40)/40) return i;
			}
		}else if(num==4) {
			for(i=0;i<a.size();i++) {
				if(a.get(i).posX/40==(posX-40)/40&&a.get(i).posY/40==posY/40) return i;
			}
		}
		return -1;
	}
}
