package day010;

public class TestBlock {

	static {
		System.out.println("��̬����");
	}
	{
		System.out.println("�����");
	}
	public TestBlock(){
		System.out.println("���췽����");
	}
	
	public static void main(String[] args){
		TestBlock tb = new TestBlock();
	}
}
