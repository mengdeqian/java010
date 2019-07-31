package day010;
/**
 * 单例设计模式
 * */
public class Singleton {
	private static Singleton s = new Singleton();
	
	//构造私有化
	private Singleton(){
		
	}
	//提供一个共有的get方法
	public static Singleton getSin(){
		return s;
	}
}
