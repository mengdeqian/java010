package SingleModeDemo;

public class SingleModeDemo {
	/**
	 * 用来保存唯一的本类的实例
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
