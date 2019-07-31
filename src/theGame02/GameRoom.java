package theGame02;

import java.util.Scanner;
/**��Ϸ����*/
public class GameRoom {

	//���ԣ��Ƿ��ƣ����ߡ�������Ϸ����ҡ�����š��������ơ���������
	//private String weapon;
	private HumanPlayer player1 = null;
	private HumanPlayer2 player2 = null;
	/**����id*/
	private long roomid;
	/**��������*/
	private String roomName;
	/**��������*/
	private String roomPass;
	
	
	public GameRoom(String roomName, String roomPass){
		if(!("admin".equals(roomName) && "123".equals(roomPass))){
			System.out.println("�������ǿ���˳���");
			return;
		}
		
		initGame(roomName);
		startGame();
		endGame();
	}
	
	//��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������ж���Ӯ�����Զ����ڲ������У�
	public void initGame(String roomName){
		//1.ʵ������Ϸ��Ҷ���
		player1 = new HumanPlayer();
		player2 = new HumanPlayer2(); 
		this.roomName = roomName;
		//2.��ʼ����Ϸ��������
		for(int i = 0; i < 30; i++){
			System.out.print("*");
			try{
			Thread.sleep(50);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		System.out.println("\n��Ϸ���سɹ�!");
	}
	public void startGame(){
		showMenu();
		choiceRole();
		//˫����ȭ
		gaming();
	}
	/**��Ϸ��ѭ��*/
	private void gaming() {
		while(true){
			System.out.println(player1.getName() + " ���ȭ:");
			Scanner sc = new Scanner(System.in);
			int ch1 = sc.nextInt();
			while(ch1 != 1 && ch1 != 2 && ch1 != 3){
				ch1 = sc.nextInt();
			}
			player1.setFist(ch1);
			int fist1 = player1.getFist();
			int fist2 = player2.getFist();
			
			int result = judge(fist1, fist2);
			//����-1 ���1ʤ�� ������0 ��ƽ ������1���2 ʤ��
			if(result == -1){
				System.out.println("��������ʦ����" + player1.getName() + " ʤ����");
				player1.sendMassage(player1.MassageTypeWin);
				player2.sendMassage(player2.MassageTypelose);
			}else if(result == 1){
				System.out.println("��������ʦ����" + player2.getName() + " ʤ����");
				player2.sendMassage(player2.MassageTypeWin);
				player1.sendMassage(player1.MassageTypelose);
			}else{
				System.out.println("��������ʦ����" + " ƽ��");
				player1.sendMassage(player1.MassageTypeFist);
				player2.sendMassage(player2.MassageTypeFist);
			}
			System.out.print("�Ƿ������Ϸ����y/n����");
			String answer = new Scanner(System.in).next();
			if(!"y".equalsIgnoreCase(answer)){
				break;
			}
		}
			
	}
	public void showMenu(){
		System.out.println("��ӭ�����ȭ��Ϸ-" + roomName + "-");
		System.out.println("��ȭ����1-������ 2-���� 3-ʯͷ");
	}
	public void choiceRole(){
		System.out.println("�Է���ɫ��1-��䣻 2-���ݣ� 3-���ϣ� 4-С��");
		System.out.println("��ѡ��");
		int choice = new Scanner(System.in).nextInt();
		while(true){
			if(choice <=0 || choice > 4){
				choice = new Scanner(System.in).nextInt();
			}
			else
				break;
		}
		String[] nameArray = {"���", "����", "����", "С��"};
		player2.setName(nameArray[choice-1]);
		player1.setName("Ұԭ��֮��");
		System.out.println(player1.getName() + " -VS- " + player2.getName());
	}
	public int judge(int f1, int f2){
		if(f1 == f2){
			return 0;
		}
		if(f1 == 1 && f2 == 2 || f1 == 2 && f2 == 3 || f1 == 3 && f2 == 1){
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() + 1);
			return -1;
		}
			player2.setScore(player1.getScore() + 1);
			player1.setScore(player2.getScore() + 1);
			return 1;
		
	}
	public void endGame(){
		System.out.println("********************");
		System.out.println("*******��Ϸ����*******");
		System.out.println(player1.getName() + "\t\t" + player2.getName());
		System.out.println(player1.getScore() + "\t\t" + player2.getScore());
		System.out.println("��Ϸ������ӭ�´�����������");
	}
	
	public long getRoomid() {
		return roomid;
	}
	public void setRoomid(long roomid) {
		this.roomid = roomid;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
}
