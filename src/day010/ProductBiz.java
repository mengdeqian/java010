package day010;

import javax.swing.JOptionPane;

/**
 * 商品管理类
 * */
public class ProductBiz {

	public static void main(String[] args){
		/**用来保存每种商品的数量*/
		int[] counts = new int[3];
		/**最终支付总金额*/
		double total = 0;
		Product[] products = new Product[3];
		for(int i = 0; i < counts.length; i++){
			//Product product = new Product();
			//对象数组中的元素使用之前应先分配空间
			if(products[i] == null){
				products[i] = new Product();
			}
			String name = JOptionPane.showInputDialog("请输入商品名称:");
			products[i].setName(name);
			//返回字符类型
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价:");
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入购买的数量:");
			counts[i] = Integer.parseInt(strCount);
			
			total += products[i].getPrice() * counts[i];
		}
		System.out.println("购物结算:");
		for(int i = 0; i < products.length; i++){
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("商品总金额为:" + total);
	}
}
