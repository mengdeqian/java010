package SingleModeDemo;

public class SingleTest {
	public static void main(String[] args){
		SingleModeDemo sin1 = SingleModeDemo.getInstance();
		System.out.println(sin1.count);
		sin1.count++;
		SingleModeDemo sin2 = SingleModeDemo.getInstance();
		System.out.println(sin2.count);
		
		System.out.println(sin1 == sin2);
	}
}
