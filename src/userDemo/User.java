package userDemo;

/**
 * ʵ���û�ע�Ṧ��
 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$������
 * �����֡�����ĸʱ����ǿ�ȶ���������
 * ����+��ĸ������+���š���ĸ+��������ǿ��Ϊ��
 * ͬʱ���������ַ���ǿ��Ϊǿ
 * 3���û�������ȷ��email
 * �������@���ţ���ֻ�ܰ���һ��
 * @ �� . ���Ų����ڿ�ͷҲ�����ڽ�β
 */

public class User {
	private String userName;
	private String passWord;
	private String email;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String passWord, String email){
		setUserName(userName);
		setPassWord(passWord);
		setEmail(email);
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
