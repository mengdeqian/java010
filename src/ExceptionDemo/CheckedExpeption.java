package ExceptionDemo;
//�ؼ��쳣 ��runtimeException �� error ����������
public class CheckedExpeption {
	public static void main(String[] args){
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
	}
}
