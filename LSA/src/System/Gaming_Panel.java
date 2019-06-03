package System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Sul.*;

public class Gaming_Panel extends JPanel{
   ArrayList<Enemy> EnemySet1=new ArrayList<Enemy>();
   ArrayList<Sul_Base> Sul_set=new ArrayList<Sul_Base>();
   int sul_set_num=0;
   Enemy tmp_e;
   Maps.Map_Base panel=new Maps.Map_Base();
   Graphics g=panel.getGraphics();
   Gaming_Panel_Mouse panel_mouse=new Gaming_Panel_Mouse();
   JLabel tmp_bar=new JLabel();
   JLabel cost=new JLabel();
   JLabel score=new JLabel();
   JLabel warning=new JLabel("코스트 부족!");
   JLabel result;
   
   Summon_Enemy task1=new Summon_Enemy();
   Drawing_Rect task2=new Drawing_Rect();
   Outing_Enemy task3=new Outing_Enemy();
   Putting_Bar task4=new Putting_Bar();
   Moving_Drunken task5=new Moving_Drunken();
   Main main;
   Deck deck;
   
   int score_sum=0;
   double score_num=0;
   int whole_cost=100;
   int upper_num=0, lower_num=0, random_num=0;
   
   public int MAX_ENEMY_NUM=200;      //Number limit for whole enemy
   int before_posX=0,before_posY=0;
   
   Gaming_Panel(Deck d, Main m){
	   Color c2=new Color(0,0,0,150);
	   
      main=m;
      deck=d;
      
      //setName("Gaming_Panel");
      setSize(1280,720);
      setLocation(0,0);
      setLayout(null);
      
      panel.setSize(1280,720);
      panel.setLocation(0,0);
      panel.setLayout(null);
      
      add(panel);
      panel.addMouseListener(panel_mouse);
      panel.addMouseMotionListener(panel_mouse);
            
      EnemySet1.add(new Enemy());      
      
      panel_mouse.rect.setLocation(0,0);
      panel.add(panel_mouse.rect);
      for(int i=0;i<4;i++) {panel.add(panel_mouse.circle_set.get(i));}
      
      warning.setSize(400,100);
      warning.setHorizontalAlignment(SwingConstants.CENTER);
      warning.setLocation(840,400);
      warning.setFont(new Font("DX시인과나",Font.BOLD,40));
      warning.setForeground(Color.white);
      warning.setBackground(c2);
      warning.setOpaque(true);
      warning.setVisible(false);
      warning.setEnabled(false);
      panel.add(warning);
      
      cost.setSize(500,100);
      cost.setLocation(840,600);
      cost.setForeground(Color.white);
      cost.setFont(new Font("DX시인과나",Font.BOLD,28));
      cost.setText("Cost: "+whole_cost);
      panel.add(cost);
      
      score.setSize(500,100);
      score.setLocation(120,600);
      score.setForeground(Color.white);
      score.setFont(new Font("DX시인과나",Font.BOLD,28));
      score.setText("Alcohol: "+score_num);
      panel.add(score);
      
      setVisible(true);
   }
   
   public Sul_Base getBar(Sul_Base s) {
      if(s.eigenvalue==44) return new Sul_Apple(1);
      else if(s.eigenvalue==30) return new Sul_Fresh(1);
      else if(s.eigenvalue==87) return new Sul_Beer(1);
      else if(s.eigenvalue==1533) return new Sul_Wine(1);
      else return null;
   }
   
   class Putting_Bar extends TimerTask{
      public void run() {
         try {
            //클릭시 주위에 술 선택지 표시
        	 if(Maps.Map_Base.road.get(panel_mouse.get_posY()+2).get(panel_mouse.get_posX()+2)>0&&
                     panel_mouse.circle_set.get(0).isVisible()==false) {
                  panel_mouse.flag_clicked=0;
               }
        	 
            if(panel_mouse.flag_clicked==1) {
                             
               if(panel_mouse.circle_set.get(0).isEnabled()!=true) {
                  before_posX=panel_mouse.get_posX();
                  before_posY=panel_mouse.get_posY();
                  
                  panel_mouse.circle_set.get(0).setLocation(panel_mouse.get_posX()*40-10,panel_mouse.get_posY()*40-65);
                  panel_mouse.circle_set.get(1).setLocation(panel_mouse.get_posX()*40+45,panel_mouse.get_posY()*40-10);
                  panel_mouse.circle_set.get(2).setLocation(panel_mouse.get_posX()*40-10,panel_mouse.get_posY()*40+45);
                  panel_mouse.circle_set.get(3).setLocation(panel_mouse.get_posX()*40-65,panel_mouse.get_posY()*40-10);
                  for(int i=0;i<4;i++) {
                     panel_mouse.circle_set.get(i).setEnabled(true);
                     panel_mouse.circle_set.get(i).setVisible(true);
                  }
               }
               else {
                  if(panel_mouse.circle_set.get(0).contains(panel_mouse.get_x()-before_posX*40-10,panel_mouse.get_y()-before_posY*40+45)) {
                	 if(Deck.first_sul.cost<=whole_cost) {
                     //upper circle selected
                		 Sul_set.add(getBar(Deck.first_sul));         
                		 Sul_set.get(sul_set_num).posX=before_posX*40;
                		 Sul_set.get(sul_set_num).posY=before_posY*40;
                                          
                		 Sul_set.get(sul_set_num).bar.setLocation(before_posX*40,before_posY*40);
                		 panel.add(Sul_set.get(sul_set_num).bar);
                		 Sul_set.get(sul_set_num).bar.setEnabled(true);
                		 Sul_set.get(sul_set_num).bar.setVisible(true);
                     
                		 whole_cost-=Sul_set.get(sul_set_num).cost;
                		 Maps.Map_Base.road.get(before_posY+2).set(before_posX+2,Sul_set.get(sul_set_num++).eigenvalue);
                     
                		 warning.setVisible(false);
                		 warning.setEnabled(false);
                	 }else {
                		 warning.setVisible(true);
                		 warning.setEnabled(true);
                	 }
                  }else if(panel_mouse.circle_set.get(0).contains(panel_mouse.get_x()-before_posX*40-65,panel_mouse.get_y()-before_posY*40-10)) {
                	  if(Deck.second_sul.cost<=whole_cost) {
                		  //right circle selected
                		  Sul_set.add(getBar(Deck.second_sul));         
                		  Sul_set.get(sul_set_num).posX=before_posX*40;
                		  Sul_set.get(sul_set_num).posY=before_posY*40;
                                               
                		  Sul_set.get(sul_set_num).bar.setLocation(before_posX*40,before_posY*40);
                		  panel.add(Sul_set.get(sul_set_num).bar);
                		  Sul_set.get(sul_set_num).bar.setEnabled(true);
                		  Sul_set.get(sul_set_num).bar.setVisible(true);
                          
                		  whole_cost-=Sul_set.get(sul_set_num).cost;
                		  Maps.Map_Base.road.get(before_posY+2).set(before_posX+2,Sul_set.get(sul_set_num++).eigenvalue);
                          
                		  warning.setVisible(false);
                		  warning.setEnabled(false);
                	  }else {
                		  warning.setVisible(true);
                		  warning.setEnabled(true);
                	  }
                  }else if(panel_mouse.circle_set.get(0).contains(panel_mouse.get_x()-before_posX*40-10,panel_mouse.get_y()-before_posY*40-65)) {
                	  if(Deck.third_sul.cost<=whole_cost) {
                  		//lower circle selected
                  		 Sul_set.add(getBar(Deck.third_sul));         
                       	 Sul_set.get(sul_set_num).posX=before_posX*40;
                       	 Sul_set.get(sul_set_num).posY=before_posY*40;
                                                 
                       	 Sul_set.get(sul_set_num).bar.setLocation(before_posX*40,before_posY*40);
                       	 panel.add(Sul_set.get(sul_set_num).bar);
                       	 Sul_set.get(sul_set_num).bar.setEnabled(true);
                       	 Sul_set.get(sul_set_num).bar.setVisible(true);
                            
                       	 whole_cost-=Sul_set.get(sul_set_num).cost;
                       	 Maps.Map_Base.road.get(before_posY+2).set(before_posX+2,Sul_set.get(sul_set_num++).eigenvalue);
                            
                       	 warning.setVisible(false);
                       	 warning.setEnabled(false);
                  	  }else {
                  		 warning.setVisible(true);
                  		 warning.setEnabled(true);
                  	  }
                  }else if(panel_mouse.circle_set.get(0).contains(panel_mouse.get_x()-before_posX*40+45,panel_mouse.get_y()-before_posY*40-10)){
                	  if(Deck.fourth_sul.cost<=whole_cost) {
                  		//Left circle selected
                  		 Sul_set.add(getBar(Deck.fourth_sul));         
                       	 Sul_set.get(sul_set_num).posX=before_posX*40;
                       	 Sul_set.get(sul_set_num).posY=before_posY*40;
                                                 
                       	 Sul_set.get(sul_set_num).bar.setLocation(before_posX*40,before_posY*40);
                       	 panel.add(Sul_set.get(sul_set_num).bar);
                       	 Sul_set.get(sul_set_num).bar.setEnabled(true);
                       	 Sul_set.get(sul_set_num).bar.setVisible(true);
                            
                       	 whole_cost-=Sul_set.get(sul_set_num).cost;
                       	 Maps.Map_Base.road.get(before_posY+2).set(before_posX+2,Sul_set.get(sul_set_num++).eigenvalue);
                            
                       	 warning.setVisible(false);
                       	 warning.setEnabled(false);
                  	  }else {
                  		 warning.setVisible(true);
                  		 warning.setEnabled(true);
                  	  }
                  }         
                  for(int i=0;i<4;i++) {
                     panel_mouse.circle_set.get(i).setEnabled(false);
                     panel_mouse.circle_set.get(i).setVisible(false);
                  }
               }
               panel_mouse.flag_clicked=0;
            }
            
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   class Drawing_Rect extends TimerTask{
      public void run() {
         try {
            panel_mouse.rect.setLocation(panel_mouse.get_posX()*40,panel_mouse.get_posY()*40);
            cost.setText("Cost: "+whole_cost);
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   class Summon_Enemy extends TimerTask{
      Random random=new Random();
      
      public void run() {
         try {
            random_num=random.nextInt(100);
            //Make new enemy 30%
            if(upper_num<MAX_ENEMY_NUM && random_num<=30) {
               tmp_e=new Enemy();
               EnemySet1.add(tmp_e);
               panel.add(EnemySet1.get(upper_num).label_enemy);
               upper_num++;
            }
            
            //Moving all enemy
            for(int i=lower_num;i<upper_num;i++) {
               if(EnemySet1.get(i).isInBar()) {
                  continue;
               }else if(EnemySet1.get(i).isDrunken) continue;
               EnemySet1.get(i).searchingRoad(Sul_set);
               EnemySet1.get(i).label_enemy.setLocation(EnemySet1.get(i).getPosX(),EnemySet1.get(i).getPosY());
               
               if(EnemySet1.get(i).getPosX()>1280||EnemySet1.get(i).getPosY()>720) {
                  EnemySet1.get(i).label_enemy.setEnabled(false);
                  EnemySet1.get(i).label_enemy.setVisible(false);
                  panel.remove(EnemySet1.get(i).label_enemy);
               }
            }   
            if(lower_num>=MAX_ENEMY_NUM+1) return;
               
            }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   class Outing_Enemy extends TimerTask{
      int cnt=0;
      int ex_num=0, now_num=0;
      public void run() {
         for(int j=0;j<Sul_set.size();j++) {
            Sul_set.get(j).peopleOut();
         }

         for(int i=lower_num;i<upper_num;i++) {
            if(EnemySet1.get(i).isInBar()) {
               score_sum+=EnemySet1.get(i).howMuchDrunken();
               EnemySet1.get(i).outBar(Sul_set);
               whole_cost+=5;
               cost.setText("Cost: "+whole_cost);
            }
         }
         score_num=(double)score_sum/(MAX_ENEMY_NUM*100);
         score.setText("Alcohol: "+score_num);
         
         now_num=lower_num;
         if((lower_num!=0&&now_num==ex_num)||lower_num>=MAX_ENEMY_NUM) {
        	 main.result_panel=new Result_Panel(deck,main,score_num,whole_cost);
        	 main.threadExit();
         }
         ex_num=now_num;
      }
   }
   
   class Moving_Drunken extends TimerTask{
      public void run() {
         //Moving all enemy         
         for(int i=0;i<EnemySet1.size();i++) {
            if(!EnemySet1.get(i).label_enemy.isVisible()) continue;
            else if(!EnemySet1.get(i).isDrunken) continue;
   
            EnemySet1.get(i).outBar(Sul_set);
            EnemySet1.get(i).Move();
            EnemySet1.get(i).label_enemy.setLocation(EnemySet1.get(i).getPosX(),EnemySet1.get(i).getPosY());
            //Removing enemy which is out-of-bound
            if(EnemySet1.get(i).getPosX()>1280||EnemySet1.get(i).getPosY()>720) {
               EnemySet1.get(i).label_enemy.setEnabled(false);
               EnemySet1.get(i).label_enemy.setVisible(false);
               panel.remove(EnemySet1.get(i).label_enemy);
               lower_num++;
            }
         }
      }
   }
}

