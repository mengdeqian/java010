package userDemo;
/**սʿ��-�̳���Hero��*/
public class Warrior extends Hero{
	/** սʿ��ľ�̬���ԣ�ÿʵ����һ���µĶ���ID++*/
	public static int ID = 1;
	
	
	/**սʿ�������ԣ�������*/
	private int pysicalAttack;
	
	public Warrior(){
		super();//���๹����Ĭ�ϵ������๹��
		setNickName("Ĭ��սʿ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLIfe(100);
		setPysicalAttack(99);
		ID++;
		//System.out.println("����Ĭ�Ϲ���");
	}
	public Warrior(String nickName, int pysicalAttack){
		setNickName(nickName + ID);
		setPysicalAttack(pysicalAttack);
	}
	public void showtest1(){
		System.out.println("test");
	}
	
	
	/**
	 * ��дtoString��������װ��ӡ��ɫ��Ϣ���߼�
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
		System.out.println("սʿ���ƶ�");
	}
	/**
	 * ��дObject���equals�������Ա�Ƚ����������Ƿ����
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
	
	
//	/**��д����ķ���*/
//	public void move(){
//		System.out.println(getNickName() + "սʿ��move����");
//	}
	
	public int getPysicalAttack() {
		return pysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		this.pysicalAttack = pysicalAttack;
	}
	
	
}
