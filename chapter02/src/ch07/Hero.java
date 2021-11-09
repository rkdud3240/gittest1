package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	//get
	public String getName() {
		return name;
	}//end of get
	
	//set
	public void setName(String name) {
		//����� �ڵ� �ۼ�
		if(name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է��Դϴ�. �̸��� �ٽ� �Է����ּ���");
		}else {
			this.name = name;
		}//end of if
	}//end of set
	
	//hp, defense, level
	//get,set �޼��带 ����� �ּ���
	//�޼��带 �����ϴ� �ڵ� �ۼ�
	//
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp < 0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
			this.hp = hp;
	}
	//
		public double getDefense() {
			return defense;
		}
		public void setDefense(double defense) {
			if(defense < 0) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}else {
				this.defense = defense;
			}
		}
		
	//
		public double getLevel() {
			return level;
		}
		public void setLevel(int level) {
			if(level < 0) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}else {
				this.level = level;
			}
		}
	//main�Լ�
	public static void main(String[] args) {
		//Hero ��ü ���� �� getter, setter �޼��带 ����� ������.
		Hero hero = new Hero();
		hero.setName("�߽���");
		// == new Hero();
		String name = hero.getName();
		System.out.println("�������� �� : " + name);
		
	}//end of main
}//end of class
