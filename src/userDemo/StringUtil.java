package userDemo;
/**
 * 字符串工具类，封装了常用字符串的判断方法
 * */

//https://github.com/ljxt-ExtremeAcademy/JavaBase.git
public class StringUtil {
//	 * 实现用户注册功能
//	 * 1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
	public static boolean isCorrectUserName(String userName){
		boolean isCorrect = true;
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//非法字符数组
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(userName.contains(Character.toString(ch))){
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}
//	 * 2、密码6-18位，只能包含字母、数字、特殊符号（下划线、@、#、$、！）
//	 * 纯数字、纯字母时密码强度都是弱（）
//	 * 数字+字母、数字+符号、字母+符号密码强度为中
//	 * 同时存在三种字符，强度为强
	public static String validatePassword(String password){
		/**  密码强度 */
		String power = "";
		if(password == null) return power;
		if(password.length() < 6 || password.length() > 18){
			return power;
		}
		//String[] correctPart = {"_", "@", "$", "#", "!"};//合法的组成部分
		String part = "_@#$!";
		for(int i = 0; i < password.length(); i++){
			if(!Character.isLetterOrDigit(password.charAt(i))){
				//如果不是合法的字母或数字，并且也不是合法的字符格式
				if(!part.contains(Character.toString(password.charAt(i)))){
					return power;
				}
			}
		}
		//判断密码强度
		if(isDigit(password) || isLetter(password)){
			power = "★★☆☆☆☆";
		}else if(isDigitAndLetter(password)){
			power = "★★★★☆☆";
		}else if(isContainsSymble(password)){
			power = "★★★★★★";
		}
		
		return power;
	}
	
//	private static boolean isDigitAndLetterAndSymble(String value){
//		for(int i = 0; i < value.length(); i++){
//			if(!( Character.isDigit(value.charAt(i)) || Character.isLetter(value.indexOf(i)) || "_!@#$".contains(Character.toString(value.charAt(i)))  ) ){
//				return false;
//			}
//		}
//		return true;
//	}
	
	/**
	 * 字符串包含合法的字母和字符串
	 * */
	private static boolean isDigitAndLetter(String value){
		//boolean flag = true;
		for(int i = 0; i < value.length(); i++){
			if(!(Character.isLetterOrDigit(value.charAt(i)))){
//				flag = false;
//				break;
				return false;
			}
		}
		return true; 
	}
	
	/**
	 * 判断一个字符串是否是纯数字
	 * */
	private static boolean isDigit(String str){
		for(int i = 0; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * 判断是否是纯字母
	 * */
	private static boolean isLetter(String value){
		for(int i = 0; i < value.length(); i++){
			if(!Character.isLetter(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 是否包含特殊符号
	 * */
	private static boolean isContainsSymble(String value){
		String part = "_!@#$";
		for(int i = 0; i < value.length(); i++){
			if(part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
		}
		return false;
	}
//	 * 3、用户输入正确的email
//	 * 必须包含@符号，且只能包含一个
//	 * @ 和 . 符号不能在开头也不能在结尾
	
}
