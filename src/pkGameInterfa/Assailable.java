package pkGameInterfa;
/**
 * �ɹ����ӿ�
 * ֻҪʵ�ֱ��ӿھ��൱�ھ߱��˿�ʵʩ��������Ļ�������
 * @author mdq
 *
 */
public interface Assailable {
	String getName();
	int getX();
	void setX(int x);
	int getY();
	void setY(int y);
	int getHp();
	void setHp(int hp);
	/**
	 * ���ݾ����жϣ��Ƿ��ܹ��ɹ�������һ���ɹ�������
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	/**
	 * ������һ���߱����������Ķ���
	 * @param assa
	 */
	void fight(Assailable assa);
	
}
