package pkGameInterfa;
/**
 * �Ǳ���
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
			System.out.println("����ʧ�ܣ������Զ");
		}
		//2��������Թ������͵��ù�������
		//3���ڿ���̨��ӡ��ս��Ľ����������̨����ר�ã�
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tx����\ty����");
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
		//1����������һ���ɹ�������֮��ľ���
		double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
		//����Ǳ��Ĺ�������Ϊ300��
		return distance <= 300;
		//2���������Ϸ����ͽ��й���
		
	}
	@Override
	public void fight(Assailable assa) {
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
	}
}
