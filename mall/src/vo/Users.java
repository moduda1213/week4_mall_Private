package vo;

public class Users {
	private String usersId; //아이디 ,이메일
	private String usersPw; //비번
	private String usersCheck; //본인확인을 위해 본인만 아는 단어
	private String usersName; // 유저 이름
	private String user_withdrawal;
	
	public String getUsersId() {
		return usersId;
	}
	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}
	public String getUsersPw() {
		return usersPw;
	}
	public void setUsersPw(String usersPw) {
		this.usersPw = usersPw;
	}
	public String getUsersCheck() {
		return usersCheck;
	}
	public void setUsersCheck(String usersCheck) {
		this.usersCheck = usersCheck;
	}
	public String getUsersName() {
		return usersName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	public String getUser_withdrawal() {
		return user_withdrawal;
	}
	public void setUser_withdrawal(String user_withdrawal) {
		this.user_withdrawal = user_withdrawal;
	}
	
}
