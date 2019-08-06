package userDemo;

public class Application {

	public static int mySqrt(int num){
		Double result = Math.sqrt(num);
		return result.intValue();
	}
	public static float mySqrt(float num){
		Double result = new Double(Math.sqrt(num));
		return result.floatValue();
	}
	public static double mySqrt(double num){
		return Math.sqrt(num);
	}
	public static void main(String[] args){
		
		int n1 = 100;
		float n2 = 1.21f;
		double n3 = 123.312;
		System.out.println(mySqrt(n1));
		System.out.println(mySqrt(n2));
		System.out.println(Application.mySqrt(n3));
	}
}
