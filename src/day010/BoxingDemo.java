package day010;

import java.util.Scanner;
public class BoxingDemo {

	public static void main(String[] args){
		
//		Character.isLetter(ch)
//		Character.isJavaIdentifierPart()
//		Character.is
		boolean isDigit = true;
		System.out.println("������һ��������");
		String value = new Scanner(System.in).next();
		for(int i = 0; i < value.length(); i++){
			if(!Character.isDigit(value.charAt(i))){
				isDigit = false;
				break;
			}
		}
		if(!isDigit){
			System.out.println("���Ǵ�����");
		}else{
			System.out.println("�Ǵ�����");
		}
		
//		
//		double num1 = 3.14;
//		Double dNum1 = new Double(num1);
//		Double dNum1_1 = Double.valueOf(num1);
//		Double dNum1_2 = 3.15;
//		System.out.println(Double.toHexString(num1));
//		
//		num1 = dNum1_2;
//		num1 = dNum1_1.doubleValue();
//		
//		
//		System.out.println(dNum1);
//		System.out.println(dNum1.compareTo(dNum1_2));
	}
}
