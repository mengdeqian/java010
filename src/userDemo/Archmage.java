package userDemo;


/**
 *��ʦ��-���� 
 */
public class Archmage extends Hero {
	private int magicArrack;
	/** սʿ��ľ�̬���ԣ�ÿʵ����һ���µĶ���ID++*/
	public static int ID = 1;
	
	public Archmage(){
		setNickName("Ĭ�Ϸ�ʦ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLIfe(100);
		setMagicArrack(99);
		ID++;
	}
	public Archmage(String nickName){
		this();
		setNickName(nickName + ID);
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
		str.append(getMagicArrack());
		
		return str.toString();
	}
	
	public void biuBiuBiu(){
		System.out.println("��ʦ" + getNickName() + "���������");
	}

	public int getMagicArrack() {
		return magicArrack;
	}

	public void setMagicArrack(int magicArrack) {
		this.magicArrack = magicArrack;
	}
	
}
