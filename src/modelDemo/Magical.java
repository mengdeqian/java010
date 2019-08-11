package modelDemo;
/**
 * ��ʦ��
 * @author mdq
 *
 */
public class Magical extends Hero{
	public Magical(){
		super();
		setName("Ĭ�Ϸ�ʦ");
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
		//���跨ʦ�Ĺ�������Ϊ300��
		return distance <= 300;
	}

	@Override
	public void fight(Hero hero) {
		// 1.��������Ĺ�����
		// 2.��������Ӣ�۵�hp
		int attack = ((int) (Math.random() * 1000)) % 51 + 10;// 10-60֮��
		setAttack(attack);
		hero.setHp(hero.getHp() - attack>0? (hero.getHp() - attack):0);
		
	}

}
