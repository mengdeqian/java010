package chunwan;

public class PerformRoom {
	public static void main(String[] args){
		Director zhangyimou = new Director();
		Singer zyx = new Singer("zhangyixing");
		Dancer luo = new Dancer("luozhixing");
		//Actor ac = new Actor("������");
		zhangyimou.action(zyx);
		zhangyimou.action(luo);
		//zhangyimou.action(ac);
		
		//1��ģ�����������Ҫ�����������Ա�����Ĵ��벻��
		CrossActor fenggong = new CrossActor("���¸�");
		zhangyimou.action(fenggong);
		
		//2��Ҫ��ʵ��main�����еĴ��벻�޸ĵ�����£�ʵ��ĳ����ɫ������
		//���������ʹ�÷���+��̬����ʵ���޷�����
	}
}
