package day010;

/**
 * �۲�����staticʱ�Ĳ�ͬ
 * */
public class TestStatic {

	private int ot = 1;
	private static int cot = 3;//����ͬһ������������㼶
	
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
