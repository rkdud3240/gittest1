package ch04;

public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;
	
	public UserInfo(String userId) {
		//super();->지우기
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassword) {
		
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	//자동 생성자 만들기
	//alt+shift+s > Generate Constructor using Fields > 체크
	
	
	//생성자 오버로딩
	//중요! 생성자는객체가 생성될 때 처음 실행되는 코드이다.
	
//	//1. 기본 생성자를 만들어 주세요
//	public UserInfo() {}
//	
//	//2.  userId만 받는 생성자
//	public UserInfo(String userId) {
//		this.userId =userId;
//	}
//	//3. userId, userPassword만 받는 생성자
//	public UserInfo(String userId, String userPassword) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//	}
//	//4. userId, userPassword, userName만 받는 생성자
//	public UserInfo(String userId, String userPassword,String userName) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//	}
//	//5. userId, userPassword, userName, userAddress만 받는 생성자
//	public UserInfo(String userId, String userPassword,
//			String userName, String userAddress) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//	}
//	//6. userId, userPassword, userName, userAddress, phoneNumber만 받는 생성자
//	public UserInfo(String userId, String userPassword,String userName, 
//			String userAddress, String phoneNumber) {
//		this.userId =userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber =phoneNumber;
//	}
}//end of class
