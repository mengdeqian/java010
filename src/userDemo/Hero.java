package userDemo;
/**
 * 英雄类-父类
 * */
public class Hero extends Object {
	private String nickName;
	private int level;
	private int maxLife;
	private int currLIfe;
	
	public void move(){
		System.out.println("Hero类的move方法");
	}
	public Hero() {
		//System.out.println("父类默认构造");
		// TODO Auto-generated constructor stub
	}
	public Hero(String nickName, int level, int maxLife, int currLIfe) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLIfe = currLIfe;
	}
	/**
	 * 比较当前英雄对象和传入英雄对象的大小按名字
	 * */
	public int compareToByName(Hero hero){
		return getNickName().compareTo(hero.getNickName());
	}
	/**
	 * 比较当前英雄对象和传入英雄对象的大小
	 * */
	public int compareTo(Hero hero){
		//只比较级别
		if(this.level > hero.getLevel()){
			return 1;
		}else if(this.level == hero.getLevel()){
			return 0;
		}else
			return -1;
	}
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLIfe() {
		return currLIfe;
	}
	public void setCurrLIfe(int currLIfe) {
		this.currLIfe = currLIfe;
	}
	
	
}
