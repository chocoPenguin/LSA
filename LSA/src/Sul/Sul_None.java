package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sul_None extends Sul_Base{
	
	int rank;	 
	int status=0;
	
	public Sul_None() {
		// TODO Auto-generated constructor stub
		name="None";
		icon1=new ImageIcon("src/Image/덱_None.png");
		icon2=new ImageIcon("src/Image/None.png");
		attack_damage=0;	//도수
		cost=0;			//술집 설치 비용
		max_people=0;		//술집 들어갈 수 있는 최대 인원
		now_people=0;	//현재 술집 안에 있는 인원
		charm_type1=0;	//Type1 enemy가 술집 발견시 들어갈 확률
		charm_type2=0;	//Type2 enemy가 술집 발견시 들어갈 확률
		drinking_time=0;	//술집에 들어온 사람이 나가는데 걸린 시간
	}
	
}
