package day010;

import java.util.Scanner;

public class StringDemo {

	/**
	 * �жϴ�����ַ����Ƿ���һ���Ϸ���С��
	 * С����ֻ����һ���Ҳ����ڵ�һ�������һ��
	 * */
	public static boolean isDecimal(String str){
		boolean isDec = true;
		for(int i = 0; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				if(str.charAt(i) == '.'){
					if(i == 0 || i == str.length() - 1){
						isDec = false;
						break;
					}
				}else{
					isDec = false;
					break;
				}
			}
		}
		//�ж��ַ�����ֻ����һ��С����
		if(!(str.contains(".") && str.indexOf('.') == str.lastIndexOf('.'))){
			return false;
		}
		return isDec;
	}
	
	public static void main(String[] args){
		
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(isDecimal(str));
		
		
		
		//indexOf����
		String password = "ab12345abc";
		System.out.println(password.indexOf('2'));
		System.out.println(password.indexOf("ab", 2));
		System.out.println(password.indexOf("aaa"));
		System.out.println(password.lastIndexOf("ab"));
		System.out.println(password.substring(1, 3));	//substring[beginindex, endindex)
		System.out.println(password.substring(3));
//		System.out.println("abc".equals("abcd"));	//����ַ��Ƚ��Ƿ����
//		System.out.println("feg".compareTo("aba"));//�Ƚ�ascii��
//		System.out.println("abcdfdf".startsWith("ab"));
//		System.out.println("adfds".endsWith("ds"));
//		System.out.println("abcdefs".contains("df"));
//		
//		//trim������ȥ���ַ�����������Ŀո�
//		String str1 = new String();
//		Scanner sc = new Scanner(System.in);
//		str1 = sc.nextLine();
//		System.out.println(str1.trim());
//		String str2 = str1.concat(str1);
//		System.out.println(str2);
//		sc.close();
//		
		//String ����Ĺ�����ʽ
//		String str1 = "��ã�����~";
//		String str2 = new String();//String str2 = "";
//		//String str3 = "";
//		//System.out.println(str2 == str3);
//		String str3 = new String(str1);
//		
//		char[] chArray = {'a', 'b', 'c'};
//		//���ַ�����ת��Ϊ�ַ���
//		String str4 = new String(chArray);
//		System.out.println(str4);
//		char[] chArray2 = str4.toCharArray();
//		//byte -128 �� 127֮��
//		byte[] byteArray = {104, 101, 108, 108, 111};	//ascii��
//		String str5 = new String(byteArray);
//		System.out.println(str5);
		
		
		
		
		
//		String value = "hello worldgood";
//		//value += "good";
//		String value2 = "hello worldgood";
//		System.out.println(value.equals(value2));
	}
}
