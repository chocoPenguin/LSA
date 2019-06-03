package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Apple extends Sul_Base{
	
	int rank;	 
	int status=0;
		
	public Sul_Apple() {
		// TODO Auto-generated constructor stub
	}
	
	public Sul_Apple(int rank) {
		posX=0;
		posY=0;
		eigenvalue=44;
		this.rank=rank;
		ImageIcon icon_bar=new ImageIcon("src/Image/사과_술집.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/덱_사과_1성.png");
			icon2=new ImageIcon("src/Image/사과_1성.png");
			name="잔에 든 사과";
			name_c="사과";
			attack_damage=10;	//도수
			cost=50;			//술집 설치 비용
			max_people=4;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=15;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=20;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/덱_사과_2성.png");
			icon2=new ImageIcon("src/Image/사과_2성.png");
			name="병에 든 사과";
			name_c="사과";
			attack_damage=13;	//도수
			cost=100;			//술집 설치 비용
			max_people=4;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=25;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=30;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/덱_사과_3성.png");
			icon2=new ImageIcon("src/Image/사과_3성.png");
			name="흑백 사과";
			name_c="사과";
			attack_damage=18;	//도수
			cost=150;			//술집 설치 비용
			max_people=4;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=35;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=40;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/덱_사과_4성.png");
			icon2=new ImageIcon("src/Image/사과_4성.png");
			name="상큼한 여고생 사과";
			name_c="사과";
			attack_damage=25;	//도수
			cost=250;			//술집 설치 비용
			max_people=5;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=55;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=60;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/덱_사과_5성.png");
			icon2=new ImageIcon("src/Image/사과_5성.png");
			name="술 줘";
			name_c="사과";
			attack_damage=40;	//도수
			cost=500;			//술집 설치 비용
			max_people=6;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=70;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=75;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
