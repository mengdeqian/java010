package userDemo;
/**
 * �ַ��������࣬��װ�˳����ַ������жϷ���
 * */

//https://github.com/ljxt-ExtremeAcademy/JavaBase.git
public class StringUtil {
//	 * ʵ���û�ע�Ṧ��
//	 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	public static boolean isCorrectUserName(String userName){
		boolean isCorrect = true;
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//�Ƿ��ַ�����
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(userName.contains(Character.toString(ch))){
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}
//	 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$������
//	 * �����֡�����ĸʱ����ǿ�ȶ���������
//	 * ����+��ĸ������+���š���ĸ+��������ǿ��Ϊ��
//	 * ͬʱ���������ַ���ǿ��Ϊǿ
	public static String validatePassword(String password){
		/**  ����ǿ�� */
		String power = "";
		if(password == null) return power;
		if(password.length() < 6 || password.length() > 18){
			return power;
		}
		//String[] correctPart = {"_", "@", "$", "#", "!"};//�Ϸ�����ɲ���
		String part = "_@#$!";
		for(int i = 0; i < password.length(); i++){
			if(!Character.isLetterOrDigit(password.charAt(i))){
				//������ǺϷ�����ĸ�����֣�����Ҳ���ǺϷ����ַ���ʽ
				if(!part.contains(Character.toString(password.charAt(i)))){
					return power;
				}
			}
		}
		//�ж�����ǿ��
		if(isDigit(password) || isLetter(password)){
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
		}else if(isContainsSymble(password)){
			power = "�������";
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
	 * �ַ��������Ϸ�����ĸ���ַ���
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
	 * �ж�һ���ַ����Ƿ��Ǵ�����
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
	 * �ж��Ƿ��Ǵ���ĸ
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
	 * �Ƿ�����������
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
//	 * 3���û�������ȷ��email
//	 * �������@���ţ���ֻ�ܰ���һ��
//	 * @ �� . ���Ų����ڿ�ͷҲ�����ڽ�β
	
}
