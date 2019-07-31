package day010;

public class TestBlock {

	static {
		System.out.println("静态语句块");
	}
	{
		System.out.println("构造块");
	}
	public TestBlock(){
		System.out.println("构造方法体");
	}
	
	public static void main(String[] args){
		TestBlock tb = new TestBlock();
	}
}
