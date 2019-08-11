package train1;

public class Emaillmpl implements Email {
	private String myEmail;
	public void setMyEmail(String myEmail){
		this.myEmail = myEmail;
	}
	public String getMyEmail(){
		return this.myEmail;
	}
	public Emaillmpl() {
		// TODO Auto-generated constructor stub
		setMyEmail("Ä¬ÈÏÓÊÏä");
	}
	public Emaillmpl(String myEmail){
		setMyEmail(myEmail);
	}
	
	@Override
	public void sendName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Ç×°®µÄ" + name + ":");
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		System.out.println(myEmail);
	}

}
