package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sul_None extends Sul_Base{
	
	int rank;	 
	int status=0;
	
	public Sul_None() {
		// TODO Auto-generated constructor stub
		name="None";
		icon1=new ImageIcon("src/Image/��_None.png");
		icon2=new ImageIcon("src/Image/None.png");
		attack_damage=0;	//����
		cost=0;			//���� ��ġ ���
		max_people=0;		//���� �� �� �ִ� �ִ� �ο�
		now_people=0;	//���� ���� �ȿ� �ִ� �ο�
		charm_type1=0;	//Type1 enemy�� ���� �߽߰� �� Ȯ��
		charm_type2=0;	//Type2 enemy�� ���� �߽߰� �� Ȯ��
		drinking_time=0;	//������ ���� ����� �����µ� �ɸ� �ð�
	}
	
}
