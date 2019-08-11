package pkGameInterfa;
/**
 * 战士类
 * @author mdq
 *
 */
public class Warrior extends Hero {
	public Warrior(){
		super();
		setName("默认战士");
	}
	
	public Warrior(long id, String name, int x, int y){
		super(id,name);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(Assailable hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//假设战士的攻击距离为100，
		return distance <= 100;
	}

	@Override
	public void fight(Assailable hero) {
		//1.生成随机的攻击力
		//2.减掉传入英雄的hp
		int attack = ((int)(Math.random() * 1000))% 51 + 20;//20-70之间
		setAttack(attack);
		hero.setHp(hero.getHp() - attack>0? (hero.getHp() - attack):0);
	}

	
}
