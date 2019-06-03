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
	
	//rank�� ���� ���� ������ ��� ���� ���� �Ҵ����� ����, �ð������� �״�� ��
	public Sul_Beer(int rank) {
		
		posX=0;
		posY=0;
		this.rank=rank;
		eigenvalue=87;
		ImageIcon icon_bar=new ImageIcon("src/Image/����_����.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/��_����_1��.png");
			icon2=new ImageIcon("src/Image/����_1��.png");
			name="�ܿ� �� ����";
			name_c="����";
			attack_damage=5;	//����
			cost=25;			//���� ��ġ ���
			max_people=5;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=20;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=10;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/��_����_2��.png");
			icon2=new ImageIcon("src/Image/����_2��.png");
			name="���� �� ����";
			name_c="����";
			attack_damage=7;	//����
			cost=70;			//���� ��ġ ���
			max_people=5;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=35;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=15;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/��_����_3��.png");
			icon2=new ImageIcon("src/Image/����_3��.png");
			name="��� ����";
			name_c="����";
			attack_damage=10;	//����
			cost=120;			//���� ��ġ ���
			max_people=5;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=45;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=21;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/��_����_4��.png");
			icon2=new ImageIcon("src/Image/����_4��.png");
			name="�Ϳ��� ���̵� ����";
			name_c="����";
			attack_damage=18;	//����
			cost=200;			//���� ��ġ ���
			max_people=6;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=60;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=33;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/��_����_5��.png");
			icon2=new ImageIcon("src/Image/����_5��.png");
			name="���ֻ�����";
			name_c="����";
			attack_damage=29;	//����
			cost=400;			//���� ��ġ ���
			max_people=8;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=80;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=50;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
