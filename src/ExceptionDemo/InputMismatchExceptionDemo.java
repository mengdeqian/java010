package ExceptionDemo;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������䣨����Ϊ������");
		int age = -1;
		try {
			age = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(age != -1)
		System.out.println("�����������:" + age);
		else
			System.out.println("�������!!");
		
	}
}
