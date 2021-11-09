package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {
		
		
		
		System.out.println(Hatchery.zerglingCount);
		Hatchery hatchery = new Hatchery("秦贸府1");
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		
		
		System.out.println("泅犁 积己等 历臂傅 荐 : " + Hatchery.zerglingCount);
	}

}
