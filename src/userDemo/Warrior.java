package userDemo;
/**战士类-继承了Hero类*/
public class Warrior extends Hero{
	/** 战士类的静态属性，每实例化一个新的对象ID++*/
	public static int ID = 1;
	
	
	/**战士固有属性：物理攻击*/
	private int pysicalAttack;
	
	public Warrior(){
		super();//子类构造中默认调用子类构造
		setNickName("默认战士" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLIfe(100);
		setPysicalAttack(99);
		ID++;
		//System.out.println("子类默认构造");
	}
	public Warrior(String nickName, int pysicalAttack){
		setNickName(nickName + ID);
		setPysicalAttack(pysicalAttack);
	}
	public void showtest1(){
		System.out.println("test");
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
		str.append(getPysicalAttack());
		
		return str.toString();
	}
	
	@Override
	public void move() {
		System.out.println("战士的移动");
	}
	/**
	 * 重写Object类的equals方法，以便比较两个对象是否相等
	 * */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack()){
			return true;
		}
		return false;
	}
	
	
//	/**重写父类的方法*/
//	public void move(){
//		System.out.println(getNickName() + "战士的move方法");
//	}
	
	public int getPysicalAttack() {
		return pysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		this.pysicalAttack = pysicalAttack;
	}
	
	
}
