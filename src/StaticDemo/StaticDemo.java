package StaticDemo;

public class StaticDemo {
	//静态属性是先于类的实例存在的
	public static int static_number = 1;
	public int normal_number = 1;
	
	public void test(){
		static_number++;
		normal_number++;
	}
	
	/**
	 * 静态方法只能调用静态属性和静态方法
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
