package StaticDemo;

public class StaticDemo {
	//��̬�������������ʵ�����ڵ�
	public static int static_number = 1;
	public int normal_number = 1;
	
	public void test(){
		static_number++;
		normal_number++;
	}
	
	/**
	 * ��̬����ֻ�ܵ��þ�̬���Ժ;�̬����
	 * */
	public static void main(String[] arga){
		StaticDemo st1 = new StaticDemo();
		st1.test();
		System.out.println(st1.static_number);
		System.out.println(st1.normal_number);
		
		st1.test();
		System.out.println(st1.static_number);
		System.out.println(st1.normal_number);
		StaticDemo st2 = new StaticDemo();
		System.out.println(st2.static_number);
		System.out.println(st2.normal_number);
		
	}
}
