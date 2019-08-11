package pkGameInterfa;
/**
 * 城堡类
 * @author mdq
 *
 */
public class Castle implements Assailable {
	private String name;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange){
		
		setName(name);
		setX(x);
		setY(y);
		setAttackRange(attackRange);
		setMaxHp(100);
		setHp(100);
	}
	
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
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
	}
	
	@Override
	public boolean canFightByDistance(Assailable assa) {
		//1、计算与另一个可攻击对象之间的距离
		double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
		//假设城堡的攻击距离为300，
		return distance <= 300;
		//2、如果距离合法，就进行攻击
		
	}
	@Override
	public void fight(Assailable assa) {
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
	}
}
