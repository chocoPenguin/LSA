package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Base {
	public ImageIcon icon1;
	public ImageIcon icon2;
	public ImageIcon icon_bar;
	public Image img_bar;
	public JLabel bar=new JLabel();
	public int posX=0;
	public int posY=0;
	public int eigenvalue=0;
	public String name;
	public String name_c;
	
	int rank;				//몇성?
	int status;				//현재 덱에 포함 여부
	
	
	
	public int attack_damage;		//도수
	public int cost;				//술집 설치 비용
	
	public int max_people;			//술집 들어갈 수 있는 최대 인원
	public int now_people;	//현재 술집 안에 있는 인원
	
	public int charm_type1;		//Type1 enemy가 술집 발견시 들어갈 확률
	public int charm_type2;		//Type2 enemy가 술집 발견시 들어갈 확률
	
	public int drinking_time;		//술집에 들어온 사람이 나가는데 걸린 시간
	
	public boolean isFull() {
		if(now_people>=max_people) return true;
		else return false;
	}
	
	public void peopleIn() {
		this.now_people++;
	}
	
	public void peopleOut() {
		this.now_people=0;
	}
}
