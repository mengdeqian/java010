package theGame02;
/**
 * 人类玩家
 * */
public class HumanPlayer {
	/**静态变量,出拳类型的信息*/
	public static final int MassageTypeFist = 1;
	/** 赢得比赛时的信息*/
	public static final int MassageTypeWin = 2;
	/** 输掉时的信息*/
	public static final int MassageTypelose = 3;
	
	
	
	//属性：名称、分数、所出的拳、（角色对应的音效）、角色台词
	private String name = null;
	private int score = 0;
	private int fist = 0;
	/**
	 * 角色在出拳的时候，所说的个性化台词
	 * */
	private String[] fistWords = {
			"动感光波~biubiubiu~~~",
			"大象大象你的鼻子为什么这么长~~",
			"大姐姐你喜欢吃青椒吗？",
			"吃我一拳~",
			"hahaha"
	};
	
	private String[] winWords = {
			"还有谁~~",
			"猜拳，有点意思~~",
			"~~超~~~神~~~~",
			"全军出击~~~",
			"吃着火锅唱着歌，然后你就输了,xixi"
	};
	
	private String[] loseWords = {
			"通往成功的路上总在施工中。。",
			"等到潮水褪去，就知道谁在游泳了，，，",
			"夏天就是不好，穷的时候我连西北风都没得喝~0~",
			"将来我死了，baqq捐给希望工程，让孩子们一上来就能用带皇冠的qq",
			"众人皆醉我独醒，举世皆浊我独清！！！"
	};

	/**根据传入的消息类型 随机打印对应类型的消息
	 * magType 对应静态常量
	 * */
	public void sendMassage(int msgType){
		int index = ((int)(Math.random() *1000)) % 5;
		String massage =  null;
				
		
		switch(msgType){
		case MassageTypeFist:
			massage = fistWords[index];
			break;
		case MassageTypeWin:
			massage = winWords[index];
			break;
		case MassageTypelose:
			massage = loseWords[index];
			break;
		}
		System.out.println(massage);
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	//方法：设置和得到名称、分数、（播放音效）、说个性化台词、出拳
	
	
}
