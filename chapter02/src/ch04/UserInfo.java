package ch04;

public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;
	
	public UserInfo(String userId) {
		//super();->�����
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassword) {
		
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	//�ڵ� ������ �����
	//alt+shift+s > Generate Constructor using Fields > üũ
	
	
	//������ �����ε�
	//�߿�! �����ڴ°�ü�� ������ �� ó�� ����Ǵ� �ڵ��̴�.
	
//	//1. �⺻ �����ڸ� ����� �ּ���
//	public UserInfo() {}
//	
//	//2.  userId�� �޴� ������
//	public UserInfo(String userId) {
//		this.userId =userId;
//	}
//	//3. userId, userPassword�� �޴� ������
//	public UserInfo(String userId, String userPassword) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//	}
//	//4. userId, userPassword, userName�� �޴� ������
//	public UserInfo(String userId, String userPassword,String userName) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//	}
//	//5. userId, userPassword, userName, userAddress�� �޴� ������
//	public UserInfo(String userId, String userPassword,
//			String userName, String userAddress) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//	}
//	//6. userId, userPassword, userName, userAddress, phoneNumber�� �޴� ������
//	public UserInfo(String userId, String userPassword,String userName, 
//			String userAddress, String phoneNumber) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber =phoneNumber;
//	}
}//end of class
