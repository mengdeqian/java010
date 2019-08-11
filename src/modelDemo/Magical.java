package modelDemo;
/**
 * 法师类
 * @author mdq
 *
 */
public class Magical extends Hero{
	public Magical(){
		super();
		setName("默认法师");
	}
	public Magical(long id, String name, int x, int y){
		setId(id);
		setName(name);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(Hero hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//假设法师的攻击距离为300，
		return distance <= 300;
	}

	@Override
	public void fight(Hero hero) {
		// 1.生成随机的攻击力
		// 2.减掉传入英雄的hp
		int attack = ((int) (Math.random() * 1000)) % 51 + 10;// 10-60之间
		setAttack(attack);
		hero.setHp(hero.getHp() - attack>0? (hero.getHp() - attack):0);
		
	}

}
