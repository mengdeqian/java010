package day010;

import javax.swing.JOptionPane;

/**
 * ��Ʒ������
 * */
public class ProductBiz {

	public static void main(String[] args){
		/**��������ÿ����Ʒ������*/
		int[] counts = new int[3];
		/**����֧���ܽ��*/
		double total = 0;
		Product[] products = new Product[3];
		for(int i = 0; i < counts.length; i++){
			//Product product = new Product();
			//���������е�Ԫ��ʹ��֮ǰӦ�ȷ���ռ�
			if(products[i] == null){
				products[i] = new Product();
			}
			String name = JOptionPane.showInputDialog("��������Ʒ����:");
			products[i].setName(name);
			//�����ַ�����
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ���:");
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺�������:");
			counts[i] = Integer.parseInt(strCount);
			
			total += products[i].getPrice() * counts[i];
		}
		System.out.println("�������:");
		for(int i = 0; i < products.length; i++){
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("��Ʒ�ܽ��Ϊ:" + total);
	}
}
