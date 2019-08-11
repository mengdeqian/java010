package ExceptionDemo;

public class DivisionDemo {
	public static void division(String strNum1, String strNum2) throws Exception{
		int result = Integer.MIN_VALUE;
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		result = num1 / num2;
		System.out.println("result = " + result);
	}
	public static void main(String[] args){
		try {
			division("sdf", "dfs");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("³ÌÐò½áÊø");
	}
}
