package modelDemo;
/**
 * ������
 * @author mdq
 *
 */
public class Ranger extends LongRangeHero {
	public Ranger(){
		super();
		setName("Ĭ������");
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
		// 1.��������Ĺ�����
		// 2.��������Ӣ�۵�hp
		int attack = ((int) (Math.random() * 1000)) % 51 + 15;// 15-65֮��
		setAttack(attack);
		hero.setHp(hero.getHp() - attack>0? (hero.getHp() - attack):0);
		
	}
	
}
