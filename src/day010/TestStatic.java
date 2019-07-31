package day010;

/**
 * 观察有无static时的不同
 * */
public class TestStatic {

	private int ot = 1;
	private static int cot = 3;//共享同一个，隶属于类层级
	
	public void show(){
		System.out.println("ot = " + this.ot);
		System.out.println("cot = " + this.cot);
	}
	public static void testShow(){
		System.out.println("cot = " + cot);
	}
	
	public static void main(String[] args){
		TestStatic ts = new TestStatic();
		ts.show();
		ts.testShow();
		TestStatic.testShow();
	}
}
