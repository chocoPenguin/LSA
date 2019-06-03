package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Fresh extends Sul_Base{
	
	int rank;
	int status=0;
	
	public Sul_Fresh() {
		// TODO Auto-generated constructor stub
	}
	
	//rank에 따라서 위에 정해진 모든 값을 따로 할당해줄 예정, 시간없으면 그대로 ㄱ
	public Sul_Fresh(int rank) {
		
		posX=0;
		posY=0;
		eigenvalue=30;
		this.rank=rank;
		ImageIcon icon_bar=new ImageIcon("src/Image/후레쉬_술집.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/덱_후레쉬_1성.png");
			icon2=new ImageIcon("src/Image/후레쉬_1성.png");
			name="잔에 든 후레쉬";
			name_c="후레쉬";
			attack_damage=15;	//도수
			cost=80;			//술집 설치 비용
			max_people=2;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=1;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=20;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/덱_후레쉬_2성.png");
			icon2=new ImageIcon("src/Image/후레쉬_2성.png");
			name="병에 든 후레쉬";
			name_c="후레쉬";
			attack_damage=19;	//도수
			cost=150;			//술집 설치 비용
			max_people=2;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=2;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=40;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/덱_후레쉬_3성.png");
			icon2=new ImageIcon("src/Image/후레쉬_3성.png");
			name="흑백 후레쉬";
			name_c="후레쉬";
			attack_damage=23;	//도수
			cost=240;			//술집 설치 비용
			max_people=3;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=15;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=50;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/덱_후레쉬_4성.png");
			icon2=new ImageIcon("src/Image/후레쉬_4성.png");
			name="퇴사하는 후레쉬";
			name_c="후레쉬";
			attack_damage=30;	//도수
			cost=380;			//술집 설치 비용
			max_people=4;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=30;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=65;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/덱_후레쉬_5성.png");
			icon2=new ImageIcon("src/Image/후레쉬_5성.png");
			name="수우우울ㄹㄹㄹ";
			name_c="후레쉬";
			attack_damage=50;	//도수
			cost=700;			//술집 설치 비용
			max_people=5;		//술집 들어갈 수 있는 최대 인원
			now_people=0;	//현재 술집 안에 있는 인원
			charm_type1=50;	//Type1 enemy가 술집 발견시 들어갈 확률
			charm_type2=95;	//Type2 enemy가 술집 발견시 들어갈 확률
			drinking_time=2000;	//술집에 들어온 사람이 나가는데 걸린 시간
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
