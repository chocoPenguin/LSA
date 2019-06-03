package Sul;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Deck {
	public static ArrayList<Sul_Base> my_sul_list=new ArrayList<Sul_Base>();
	public Sul_Base current_sul;
	
	public static Sul_Base first_sul, second_sul, third_sul, fourth_sul;
	
	
	public Deck(){
		my_sul_list.add(new Sul_None());
		
		first_sul= new Sul_None();
		second_sul = new Sul_None();
		third_sul = new Sul_None();
		fourth_sul = new Sul_None();
		
		// 가챠 시 나온 것을 집어넣음, status는 0
		/*
		 * 
		my_sul_list.add(a1);
		my_sul_list.add(a2);
		my_sul_list.add(a3);
		my_sul_list.add(a4);
		*/
		// 덱교체시 덱에 들어가면 status를 1로, 빼면 status를 0으로
	}
	
	public void set_first_sul(Sul_Base tmp_sul) {first_sul=tmp_sul;}
	public void set_second_sul(Sul_Base tmp_sul) {second_sul=tmp_sul;}
	public void set_third_sul(Sul_Base tmp_sul) {third_sul=tmp_sul;}
	public void set_fourth_sul(Sul_Base tmp_sul) {fourth_sul=tmp_sul;}
	
	public Sul_Base get_first_sul() {return first_sul;}
	public Sul_Base get_second_sul() {return second_sul;}
	public Sul_Base get_third_sul() {return third_sul;}
	public Sul_Base get_fourth_sul() {return fourth_sul;}
}
