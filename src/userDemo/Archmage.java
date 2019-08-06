package userDemo;


/**
 *法师类-子类 
 */
public class Archmage extends Hero {
	private int magicArrack;
	/** 战士类的静态属性，每实例化一个新的对象ID++*/
	public static int ID = 1;
	
	public Archmage(){
		setNickName("默认法师" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLIfe(100);
		setMagicArrack(99);
		ID++;
	}
	public Archmage(String nickName){
		this();
		setNickName(nickName + ID);
	}
	
	/**
	 * 重写toString方法，封装打印角色信息的逻辑
	 * */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t");
		str.append(getCurrLIfe());
		str.append("\t");
		str.append(getMagicArrack());
		
		return str.toString();
	}
	
	public void biuBiuBiu(){
		System.out.println("大法师" + getNickName() + "正在喷火球");
	}

	public int getMagicArrack() {
		return magicArrack;
	}

	public void setMagicArrack(int magicArrack) {
		this.magicArrack = magicArrack;
	}
	
}
