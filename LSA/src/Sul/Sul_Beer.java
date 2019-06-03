package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Beer extends Sul_Base{
	
	int rank;
	int status=0;
	
	public Sul_Beer() {
		// TODO Auto-generated constructor stub
	}
	
	//rank에 따라서 위에 정해진 모든 값을 따로 할당해줄 예정, 시간없으면 그대로 ㄱ
	public Sul_Beer(int rank) {
		
		posX=0;
		posY=0;
		this.rank=rank;
		eigenvalue=87;
		ImageIcon icon_bar=new ImageIcon("src/Image/맥주_술집.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/덱_맥주_1성.png");
			icon2=new ImageIcon("src/Image/맥주_1성.png");
			name="잔에 든 맥주";
			name_c="맥주";
			attack_damage=5;	//도수
			cost=25;			//술집 설치 비용
			max_people=5;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=20;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=10;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/덱_맥주_2성.png");
			icon2=new ImageIcon("src/Image/맥주_2성.png");
			name="병에 든 맥주";
			name_c="맥주";
			attack_damage=7;	//도수
			cost=70;			//술집 설치 비용
			max_people=5;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=35;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=15;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/덱_맥주_3성.png");
			icon2=new ImageIcon("src/Image/맥주_3성.png");
			name="흑백 맥주";
			name_c="맥주";
			attack_damage=10;	//도수
			cost=120;			//술집 설치 비용
			max_people=5;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=45;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=21;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/덱_맥주_4성.png");
			icon2=new ImageIcon("src/Image/맥주_4성.png");
			name="귀여운 아이돌 맥주";
			name_c="맥주";
			attack_damage=18;	//도수
			cost=200;			//술집 설치 비용
			max_people=6;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=60;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=33;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/덱_맥주_5성.png");
			icon2=new ImageIcon("src/Image/맥주_5성.png");
			name="맥주빳다죠";
			name_c="맥주";
			attack_damage=29;	//도수
			cost=400;			//술집 설치 비용
			max_people=8;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=80;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=50;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
