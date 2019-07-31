package theGame02;

import java.util.Scanner;
/**游戏房间*/
public class GameRoom {

	//属性：记分牌，道具、参与游戏的玩家、房间号、房间名称、房间密码
	//private String weapon;
	private HumanPlayer player1 = null;
	private HumanPlayer2 player2 = null;
	/**房间id*/
	private long roomid;
	/**房间名称*/
	private String roomName;
	/**房间密码*/
	private String roomPass;
	
	
	public GameRoom(String roomName, String roomPass){
		if(!("admin".equals(roomName) && "123".equals(roomPass))){
			System.out.println("密码错误强制退出！");
			return;
		}
		
		initGame(roomName);
		startGame();
		endGame();
	}
	
	//方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类中）
	public void initGame(String roomName){
		//1.实例化游戏玩家对象
		player1 = new HumanPlayer();
		player2 = new HumanPlayer2(); 
		this.roomName = roomName;
		//2.初始化游戏其他属性
		for(int i = 0; i < 30; i++){
			System.out.print("*");
			try{
			Thread.sleep(50);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		System.out.println("\n游戏加载成功!");
	}
	public void startGame(){
		showMenu();
		choiceRole();
		//双方出拳
		gaming();
	}
	/**游戏大循环*/
	private void gaming() {
		while(true){
			System.out.println(player1.getName() + " 请出拳:");
			Scanner sc = new Scanner(System.in);
			int ch1 = sc.nextInt();
			while(ch1 != 1 && ch1 != 2 && ch1 != 3){
				ch1 = sc.nextInt();
			}
			player1.setFist(ch1);
			int fist1 = player1.getFist();
			int fist2 = player2.getFist();
			
			int result = judge(fist1, fist2);
			//返回-1 玩家1胜利 ，返回0 打平 ，返回1玩家2 胜利
			if(result == -1){
				System.out.println("【吉永老师】：" + player1.getName() + " 胜利！");
				player1.sendMassage(player1.MassageTypeWin);
				player2.sendMassage(player2.MassageTypelose);
			}else if(result == 1){
				System.out.println("【吉永老师】：" + player2.getName() + " 胜利！");
				player2.sendMassage(player2.MassageTypeWin);
				player1.sendMassage(player1.MassageTypelose);
			}else{
				System.out.println("【吉永老师】：" + " 平局");
				player1.sendMassage(player1.MassageTypeFist);
				player2.sendMassage(player2.MassageTypeFist);
			}
			System.out.print("是否继续游戏？（y/n）：");
			String answer = new Scanner(System.in).next();
			if(!"y".equalsIgnoreCase(answer)){
				break;
			}
		}
			
	}
	public void showMenu(){
		System.out.println("欢迎进入猜拳游戏-" + roomName + "-");
		System.out.println("出拳规则：1-剪刀； 2-布； 3-石头");
	}
	public void choiceRole(){
		System.out.println("对方角色：1-风间； 2-妮妮； 3-正南； 4-小呆");
		System.out.println("请选择：");
		int choice = new Scanner(System.in).nextInt();
		while(true){
			if(choice <=0 || choice > 4){
				choice = new Scanner(System.in).nextInt();
			}
			else
				break;
		}
		String[] nameArray = {"风间", "妮妮", "正男", "小呆"};
		player2.setName(nameArray[choice-1]);
		player1.setName("野原新之助");
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
		System.out.println("*******游戏结束*******");
		System.out.println(player1.getName() + "\t\t" + player2.getName());
		System.out.println(player1.getScore() + "\t\t" + player2.getScore());
		System.out.println("游戏结束欢迎下次再来！！！");
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
