package day010;

import java.util.Scanner;

public class StringDemo {

	/**
	 * 判断传入的字符串是否是一个合法的小数
	 * 小数点只能有一个且不能在第一个或最后一个
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
		//判断字符串中只能有一个小数点
		if(!(str.contains(".") && str.indexOf('.') == str.lastIndexOf('.'))){
			return false;
		}
		return isDec;
	}
	
	public static void main(String[] args){
		
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(isDecimal(str));
		
		
		
		//indexOf方法
		String password = "ab12345abc";
		System.out.println(password.indexOf('2'));
		System.out.println(password.indexOf("ab", 2));
		System.out.println(password.indexOf("aaa"));
		System.out.println(password.lastIndexOf("ab"));
		System.out.println(password.substring(1, 3));	//substring[beginindex, endindex)
		System.out.println(password.substring(3));
//		System.out.println("abc".equals("abcd"));	//逐个字符比较是否相等
//		System.out.println("feg".compareTo("aba"));//比较ascii码
//		System.out.println("abcdfdf".startsWith("ab"));
//		System.out.println("adfds".endsWith("ds"));
//		System.out.println("abcdefs".contains("df"));
//		
//		//trim方法：去掉字符串左右两侧的空格
//		String str1 = new String();
//		Scanner sc = new Scanner(System.in);
//		str1 = sc.nextLine();
//		System.out.println(str1.trim());
//		String str2 = str1.concat(str1);
//		System.out.println(str2);
//		sc.close();
//		
		//String 对象的构建方式
//		String str1 = "你好，世界~";
//		String str2 = new String();//String str2 = "";
//		//String str3 = "";
//		//System.out.println(str2 == str3);
//		String str3 = new String(str1);
//		
//		char[] chArray = {'a', 'b', 'c'};
//		//将字符数组转化为字符串
//		String str4 = new String(chArray);
//		System.out.println(str4);
//		char[] chArray2 = str4.toCharArray();
//		//byte -128 到 127之间
//		byte[] byteArray = {104, 101, 108, 108, 111};	//ascii码
//		String str5 = new String(byteArray);
//		System.out.println(str5);
		
		
		
		
		
//		String value = "hello worldgood";
//		//value += "good";
//		String value2 = "hello worldgood";
//		System.out.println(value.equals(value2));
	}
}
