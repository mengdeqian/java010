package modelDemo;

public abstract class Hero {
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
	 * ʹ��ģ��ģʽʵ�ֵĶ�ս����
	 * �涨��Ĭ������¶�ս������
	 * @param hero
	 */
	public void Pk(Hero hero){
		//1����������ж��Ƿ��ܹ������Է�
		if(canFightByDistance(hero) && hp > 0){
			System.out.println("�����ɹ�");
			fight(hero);
		}else{
			System.out.println("����ʧ�ܣ������Զ");
		}
		//2��������Թ������͵��ù�������
		//3���ڿ���̨��ӡ��ս��Ľ����������̨����ר�ã�
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tx����\ty����");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" +y);
		System.out.printf("%s\t%d\t%d\t%d\n",
				hero.getName(), hero.getHp(), hero.getX(), hero.getY()
				);
	}
	
	
	/**
	 * �жϵ�ǰӢ���Ƿ��ܹ��������Ӣ��
	 * @param hero
	 * @return
	 */
	public abstract boolean canFightByDistance(Hero hero);
	/**
	 * ���������Ӣ�ۣ�Ĭ�ϸ���������ɵĹ���������hpֵ
	 * @param hero
	 */
	public abstract void fight(Hero hero);
	
	/**
	 * ������������ľ���
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
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
		if(level < 0 || level >100)
			level = 0;
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
	
	
	
	
	

}
