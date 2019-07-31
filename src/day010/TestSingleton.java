package day010;

public class TestSingleton {
	
	public static void main(String[] args){
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		System.out.println(s1);
//		System.out.println(s2);
		
		Singleton s1 = Singleton.getSin();
		Singleton s2 = Singleton.getSin();
		System.out.println(s1);
		System.out.println(s2);
	}
}
