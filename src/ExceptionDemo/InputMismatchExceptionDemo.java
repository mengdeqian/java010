package ExceptionDemo;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年龄（必须为整数）");
		int age = -1;
		try {
			age = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(age != -1)
		System.out.println("输入的年龄是:" + age);
		else
			System.out.println("输入错误!!");
		
	}
}
