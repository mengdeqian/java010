package modelDemo;
/**
 * 游侠类
 * @author mdq
 *
 */
public class Ranger extends LongRangeHero {
	public Ranger(){
		super();
		setName("默认游侠");
	}
	public Ranger(long id, String name, int attackRange, int x, int y){
		setId(id);
		setName(name);
		setAttackRange(attackRange);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(Hero hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		if(distance <= getAttackRange()){
			return true;
		}
		return false;
	}

	@Override
	public void fight(Hero hero) {
		// 1.生成随机的攻击力
		// 2.减掉传入英雄的hp
		int attack = ((int) (Math.random() * 1000)) % 51 + 15;// 15-65之间
		setAttack(attack);
		hero.setHp(hero.getHp() - attack>0? (hero.getHp() - attack):0);
		
	}
	
}
