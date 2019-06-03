package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Wine extends Sul_Base{
	
	int rank;
	int status=0;
	
	public Sul_Wine() {
		// TODO Auto-generated constructor stub
	}
	
	//rank에 따라서 위에 정해진 모든 값을 따로 할당해줄 예정, 시간없으면 그대로 ㄱ
	public Sul_Wine(int rank) {

		posX=0;
		posY=0;
		eigenvalue=1533;
		this.rank=rank;
		ImageIcon icon_bar=new ImageIcon("src/Image/와인_술집.png");
		Image img_bar=icon_bar.getImage();	
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/덱_와인_1성.png");
			icon2=new ImageIcon("src/Image/와인_1성.png");
			name="잔에 든 와인";
			name_c="와인";
			attack_damage=12;	//도수
			cost=60;			//술집 설치 비용
			max_people=2;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=20;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=15;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/덱_와인_2성.png");
			icon2=new ImageIcon("src/Image/와인_2성.png");
			name="병에 든 와인";
			name_c="와인";
			attack_damage=15;	//도수
			cost=120;			//술집 설치 비용
			max_people=3;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=30;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=25;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/덱_와인_3성.png");
			icon2=new ImageIcon("src/Image/와인_3성.png");
			name="흑백 와인";
			name_c="와인";
			attack_damage=20;	//도수
			cost=190;			//술집 설치 비용
			max_people=3;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=40;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=35;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/덱_와인_4성.png");
			icon2=new ImageIcon("src/Image/와인_4성.png");
			name="쭉쭉빵빵한 와인";
			name_c="와인";
			attack_damage=27;	//도수
			cost=320;			//술집 설치 비용
			max_people=4;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=60;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=55;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/덱_와인_5성.png");
			icon2=new ImageIcon("src/Image/와인_5성.png");
			name="이 술의 노예야";
			name_c="와인";
			attack_damage=42;	//도수
			cost=600;			//술집 설치 비용
			max_people=6;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=75;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=70;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
