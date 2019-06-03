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
		ImageIcon icon_bar=new ImageIcon("src/Image/���_����.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/��_���_1��.png");
			icon2=new ImageIcon("src/Image/���_1��.png");
			name="�ܿ� �� ���";
			name_c="���";
			attack_damage=10;	//����
			cost=50;			//���� ��ġ ���
			max_people=4;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=15;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=20;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/��_���_2��.png");
			icon2=new ImageIcon("src/Image/���_2��.png");
			name="���� �� ���";
			name_c="���";
			attack_damage=13;	//����
			cost=100;			//���� ��ġ ���
			max_people=4;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=25;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=30;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/��_���_3��.png");
			icon2=new ImageIcon("src/Image/���_3��.png");
			name="��� ���";
			name_c="���";
			attack_damage=18;	//����
			cost=150;			//���� ��ġ ���
			max_people=4;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=35;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=40;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/��_���_4��.png");
			icon2=new ImageIcon("src/Image/���_4��.png");
			name="��ŭ�� ����� ���";
			name_c="���";
			attack_damage=25;	//����
			cost=250;			//���� ��ġ ���
			max_people=5;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=55;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=60;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/��_���_5��.png");
			icon2=new ImageIcon("src/Image/���_5��.png");
			name="�� ��";
			name_c="���";
			attack_damage=40;	//����
			cost=500;			//���� ��ġ ���
			max_people=6;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=70;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=75;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
