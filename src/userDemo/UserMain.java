package userDemo;
/**
 * ���´���ʵ���û�ע��
 *  * ʵ���û�ע�Ṧ��
 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$������
 * �����֡�����ĸʱ����ǿ�ȶ���������
 * ����+��ĸ������+���š���ĸ+��������ǿ��Ϊ��
 * ͬʱ���������ַ���ǿ��Ϊǿ
 * 3���û�������ȷ��email
 * �������@���ţ���ֻ�ܰ���һ��
 * @ �� . ���Ų����ڿ�ͷҲ�����ڽ�β
 * */
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
//		System.out.println("�������û�����");
//		String userName = input.next();
		System.out.println("���������룺");
		String passWord = input.next();
		System.out.println(StringUtil.validatePassword(passWord));
//		System.out.println("��������������ַ��");
//		String email = input.next();
//		
	}
}
