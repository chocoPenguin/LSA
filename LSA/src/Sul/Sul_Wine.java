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
	
	//rank�� ���� ���� ������ ��� ���� ���� �Ҵ����� ����, �ð������� �״�� ��
	public Sul_Wine(int rank) {

		posX=0;
		posY=0;
		eigenvalue=1533;
		this.rank=rank;
		ImageIcon icon_bar=new ImageIcon("src/Image/����_����.png");
		Image img_bar=icon_bar.getImage();	
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/��_����_1��.png");
			icon2=new ImageIcon("src/Image/����_1��.png");
			name="�ܿ� �� ����";
			name_c="����";
			attack_damage=12;	//����
			cost=60;			//���� ��ġ ���
			max_people=2;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=20;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=15;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/��_����_2��.png");
			icon2=new ImageIcon("src/Image/����_2��.png");
			name="���� �� ����";
			name_c="����";
			attack_damage=15;	//����
			cost=120;			//���� ��ġ ���
			max_people=3;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=30;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=25;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/��_����_3��.png");
			icon2=new ImageIcon("src/Image/����_3��.png");
			name="��� ����";
			name_c="����";
			attack_damage=20;	//����
			cost=190;			//���� ��ġ ���
			max_people=3;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=40;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=35;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/��_����_4��.png");
			icon2=new ImageIcon("src/Image/����_4��.png");
			name="���߻����� ����";
			name_c="����";
			attack_damage=27;	//����
			cost=320;			//���� ��ġ ���
			max_people=4;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=60;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=55;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/��_����_5��.png");
			icon2=new ImageIcon("src/Image/����_5��.png");
			name="�� ���� �뿹��";
			name_c="����";
			attack_damage=42;	//����
			cost=600;			//���� ��ġ ���
			max_people=6;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=75;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=70;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
