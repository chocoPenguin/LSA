package Sul;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sul_Base {
	public ImageIcon icon1;
	public ImageIcon icon2;
	public ImageIcon icon_bar;
	public Image img_bar;
	public JLabel bar=new JLabel();
	public int posX=0;
	public int posY=0;
	public int eigenvalue=0;
	public String name;
	public String name_c;
	
	int rank;				//�?
	int status;				//���� ���� ���� ����
	
	
	
	public int attack_damage;		//����
	public int cost;				//���� ��ġ ���
	
	public int max_people;			//���� �� �� �ִ� �ִ� �ο�
	public int now_people;	//���� ���� �ȿ� �ִ� �ο�
	
	public int charm_type1;		//Type1 enemy�� ���� �߽߰� �� Ȯ��
	public int charm_type2;		//Type2 enemy�� ���� �߽߰� �� Ȯ��
	
	public int drinking_time;		//������ ���� ����� �����µ� �ɸ� �ð�
	
	public boolean isFull() {
		if(now_people>=max_people) return true;
		else return false;
	}
	
	public void peopleIn() {
		this.now_people++;
	}
	
	public void peopleOut() {
		this.now_people=0;
	}
}
