package ch10;

public class GateWay {
	

	public static int zealotCount = 0;
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "����Ʈ����";
	}
	
	//���������ϱ�
	public Zealot createZealot() {
		System.out.println("������ �����մϴ�.");
		zealotCount++;
		return new Zealot("����");
	}
	
	
	
}//end of class
