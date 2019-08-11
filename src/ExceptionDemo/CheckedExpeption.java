package ExceptionDemo;
//必检异常 除runtimeException 和 error 的其他子类
public class CheckedExpeption {
	public static void main(String[] args){
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
	}
}
