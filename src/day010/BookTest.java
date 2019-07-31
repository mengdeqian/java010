package day010;

public class BookTest {

	public static void main(String[] args){
//		Book book = new Book("java从入门到入土", "122-112", 23.3, 5);
//		
//		BookBiz bookbiz = new BookBiz();
//		
//		bookbiz.sellBook(book);
//		
//		System.out.println(book.getCount());
//		
//		
//		int num = 1234;
//		bookbiz.test(num);
//		System.out.println(num);
		
		
		
		int[] nums = {1, 2};
		Swap(nums);
		System.out.println(nums[0] + "\t" + nums[1]);
		
		//引用传递
		Demo demo = new Demo();
		Swap(demo);
		System.out.println(demo.attr1 + "\t" + demo.attr2);
		
	}
	
	static class Demo{
		int attr1 = 10;
		int attr2 = 50;
	}
	
	public static void Swap(Demo demo){
		//demo = new Demo();
		int t = demo.attr1;
		demo.attr1 = demo.attr2;
		demo.attr2 = t;
	}
	
	public static void Swap(int[] nums){
		int t= nums[0];
		nums[0] = nums[1];
		nums[1] = t;
	}
}
