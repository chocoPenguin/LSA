package System;

import java.awt.Container;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Sul.*;



class Server extends Thread{
	//ArrayList<String> mes=new ArrayList<String>();
	String message;
	ServerSocket ss= null;
	public void run() {
		try {
				System.out.println("Server Start");
				ss = new ServerSocket(7777);
			while(true) {
				Socket s = ss.accept();
				InputStream in = s.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				message=dis.readUTF();
				System.out.println(message);
				dis.close();
				in.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class User extends Thread{
	String message;
	User(String message){
		//mes.add(message);
		this.message=message;
	}
	public void run() {
		try {
			Socket s=new Socket("localhost", 7777);
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF(message);
			dos.close();
			os.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



public class Main extends JFrame{	
	public Timer thread1=new Timer("Timer-thread",true);
	public Timer thread2=new Timer("Timer-thread 2",true);
	Timer timer=new Timer("Timer-thread",false);
	Date currentTime = new Date();
	Deck deck = new Deck();
	Main_Panel main_panel;
	Deck_Panel deck_panel;
	Gacha_Panel gacha_panel;
	List_Panel list_panel1;
	List_Panel2 list_panel2;
	List_Panel3 list_panel3;
	List_Panel4 list_panel4;
	Start_Panel start_panel;
	Gacha_End_Panel gacha_end_panel;
	Gaming_Panel gaming_panel;
	Result_Panel result_panel;

	
	public Main(){
		
		setTitle("NSA will find youxxx");
		setSize(1280,720);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		main_panel = new Main_Panel(deck, this);
		deck_panel = new Deck_Panel(deck, this);
		gacha_panel = new Gacha_Panel(deck, this);
		list_panel1 = new List_Panel(deck, this);
		list_panel2 = new List_Panel2(deck, this);
		list_panel3 = new List_Panel3(deck, this);
		list_panel4 = new List_Panel4(deck, this);
		start_panel = new Start_Panel(deck, this);
		gacha_end_panel = new Gacha_End_Panel(deck, this);
		gaming_panel=new Gaming_Panel(deck, this);
		result_panel=new Result_Panel(deck,this,0,0);
		
		Container c=getContentPane();
	
		this.add(start_panel);
		
		setVisible(true);
	}
	public void threadStart() {
	      thread1.schedule(gaming_panel.task1,2,66);
	      thread1.schedule(gaming_panel.task4,1,3);
	      thread1.schedule(gaming_panel.task5,10002,99);
	      thread2.schedule(gaming_panel.task2,0,3);
	      thread2.schedule(gaming_panel.task3,10000,4002);
	   }
	   
	   public void threadExit() {
	      thread1.cancel();
	      thread2.cancel();
	      change("result");
	   }
	
	public void change(String panelchange) {
		if(panelchange.equals("deck")) {
			getContentPane().removeAll();
	        getContentPane().add(deck_panel);
	        revalidate();
	        repaint();
	        deck_panel.setFocusable(true);              
	        deck_panel.requestFocus();
		}
		else if(panelchange.equals("Menu")){
			getContentPane().removeAll();
	        getContentPane().add(main_panel);
	        revalidate();
	        repaint();
	        main_panel.setFocusable(true);              
	        main_panel.requestFocus();
		}
		else if(panelchange.equals("List")){
			getContentPane().removeAll();
	        getContentPane().add(list_panel1);
	        revalidate();
	        repaint();
	        list_panel1.setFocusable(true);              
	        list_panel1.requestFocus();
		}
		else if(panelchange.equals("List2")){
			getContentPane().removeAll();
	        getContentPane().add(list_panel2);
	        revalidate();
	        repaint();
	        list_panel2.setFocusable(true);              
	        list_panel2.requestFocus();
		}
		else if(panelchange.equals("List3")){
			getContentPane().removeAll();
	        getContentPane().add(list_panel3);
	        revalidate();
	        repaint();
	        list_panel3.setFocusable(true);              
	        list_panel3.requestFocus();
		}
		else if(panelchange.equals("List4")){
			getContentPane().removeAll();
	        getContentPane().add(list_panel4);
	        revalidate();
	        repaint();
	        list_panel4.setFocusable(true);              
	        list_panel4.requestFocus();
		}
		else if(panelchange.equals("todeck")){
			getContentPane().removeAll();
	        getContentPane().add(deck_panel);
	        revalidate();
	        repaint();
	        deck_panel.setFocusable(true);              
	        deck_panel.requestFocus();
		}
		else if(panelchange.equals("Gacha")){
			getContentPane().removeAll();
	        getContentPane().add(gacha_panel);
	        revalidate();
	        repaint();
	        gacha_panel.setFocusable(true);              
	        gacha_panel.requestFocus();
		}
		else if(panelchange.equals("End")){
			getContentPane().removeAll();
	        getContentPane().add(gacha_end_panel);
	        revalidate();
	        repaint();
	        gacha_end_panel.setFocusable(true);              
	        gacha_end_panel.requestFocus();
		}
		else if(panelchange.equals("game")){
			getContentPane().removeAll();
	        getContentPane().add(gaming_panel);
	        revalidate();
	        repaint();
	        gaming_panel.setFocusable(true);              
	        gaming_panel.requestFocus();
		}
		else if(panelchange.equals("result")){
			getContentPane().removeAll();
	        getContentPane().add(result_panel);
	        revalidate();
	        repaint();
	        result_panel.setFocusable(true);              
	        result_panel.requestFocus();
		}
		//else if (panelchange.equals)

	}
	
 /*
	static class TimeUtils {
		private TimeUtils() {
			
		}
		public static Date getFutureTime(Date initialTime, long millisToAdd) {
			Calendar cal = GregorianCalendar.getInstance();
			cal.setTimeInMillis(initialTime.getTime() + millisToAdd);
			return cal.getTime();
		}
	}
	*/
	public static void main(String[] args) {
		
		new Main();
		Server server = new Server();
		server.start();
	}	
	

}


