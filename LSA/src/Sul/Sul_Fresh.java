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
	
	//rank�� ���� ���� ������ ��� ���� ���� �Ҵ����� ����, �ð������� �״�� ��
	public Sul_Fresh(int rank) {
		
		posX=0;
		posY=0;
		eigenvalue=30;
		this.rank=rank;
		ImageIcon icon_bar=new ImageIcon("src/Image/�ķ���_����.png");
		Image img_bar=icon_bar.getImage();
		bar=new JLabel(icon_bar);
		bar.setSize(40,40);
		if(rank==1) {
			icon1=new ImageIcon("src/Image/��_�ķ���_1��.png");
			icon2=new ImageIcon("src/Image/�ķ���_1��.png");
			name="�ܿ� �� �ķ���";
			name_c="�ķ���";
			attack_damage=15;	//����
			cost=80;			//���� ��ġ ���
			max_people=2;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=1;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=20;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==2) {
			icon1=new ImageIcon("src/Image/��_�ķ���_2��.png");
			icon2=new ImageIcon("src/Image/�ķ���_2��.png");
			name="���� �� �ķ���";
			name_c="�ķ���";
			attack_damage=19;	//����
			cost=150;			//���� ��ġ ���
			max_people=2;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=2;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=40;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==3) {
			icon1=new ImageIcon("src/Image/��_�ķ���_3��.png");
			icon2=new ImageIcon("src/Image/�ķ���_3��.png");
			name="��� �ķ���";
			name_c="�ķ���";
			attack_damage=23;	//����
			cost=240;			//���� ��ġ ���
			max_people=3;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=15;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=50;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==4) {
			icon1=new ImageIcon("src/Image/��_�ķ���_4��.png");
			icon2=new ImageIcon("src/Image/�ķ���_4��.png");
			name="����ϴ� �ķ���";
			name_c="�ķ���";
			attack_damage=30;	//����
			cost=380;			//���� ��ġ ���
			max_people=4;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=30;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=65;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}else if(rank==5) {
			icon1=new ImageIcon("src/Image/��_�ķ���_5��.png");
			icon2=new ImageIcon("src/Image/�ķ���_5��.png");
			name="�����朗����";
			name_c="�ķ���";
			attack_damage=50;	//����
			cost=700;			//���� ��ġ ���
			max_people=5;		//���� �� �� �ִ� �ִ� �ο�
			now_people=0;	//���� ���� �ȿ� �ִ� �ο�
			charm_type1=50;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
			charm_type2=95;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
			drinking_time=2000;	//������ ���� ����� �����µ� �ɸ� �ð�
		}
		
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
	}
}
