package pkGameInterfa;
/**
 * 实现了可攻击接口的英雄类-抽象类
 * @author mdq
 *
 */
public abstract class Hero implements Assailable {
	private long id;
	private String name;
	private int level;
	private int maxhp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public Hero(){
		setMaxhp(100);
		setHp(100);
	}
	public Hero(long id, String name){
		this();
		setId(id);
		setName(name);
	}
	/**
	 * 英雄之间的PK
	 * @param assa
	 */
	public void PK(Assailable assa){
		if(canFightByDistance(assa) && hp > 0 && assa.getHp() > 0){
			fight(assa);
		}else{
			System.out.println("攻击失败，距离过远");
		}
		//2、如果可以攻击，就调用攻击方法
		//3、在控制台打印对战后的结果，（控制台程序专用）
		System.out.println("两位英雄的当前状态");
		System.out.println("昵称\tHP\tx坐标\ty坐标");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" +y);
		System.out.printf("%s\t%d\t%d\t%d\n",
				assa.getName(), assa.getHp(), assa.getX(), assa.getY()
				);
	}
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int getX() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void setX(int x) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public int getHp() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void setHp(int hp) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public boolean canFightByDistance(Assailable assa) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void fight(Assailable assa) {
//		// TODO Auto-generated method stub
//
//	}

}
