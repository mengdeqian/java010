package day010;
/**
 * �������ģʽ
 * */
public class Singleton {
	private static Singleton s = new Singleton();
	
	//����˽�л�
	private Singleton(){
		
	}
	//�ṩһ�����е�get����
	public static Singleton getSin(){
		return s;
	}
}
