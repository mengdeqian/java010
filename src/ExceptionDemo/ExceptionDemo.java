package ExceptionDemo;

public class ExceptionDemo {
	public static int division(int num1, int num2){
		int result = Integer.MIN_VALUE;
		try {
			result = num1 / num2;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("“Ï≥£–≈œ¢" + e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args){
		int a = division(3, 0);
		System.out.println(a);
	}
}
