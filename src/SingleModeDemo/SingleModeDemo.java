package SingleModeDemo;

public class SingleModeDemo {
	/**
	 * ��������Ψһ�ı����ʵ��
	 */
	private static SingleModeDemo me = null;
	public int count = 0;
	private SingleModeDemo(){
		count++;
	}
	public static SingleModeDemo getInstance(){
		if(me == null){
			me = new SingleModeDemo();
		}
		return me;
	}
}
