package userDemo;

public class StringBufferDemo {

	public static void main(String[] args){
		
		StringBuffer strbuf1 = new StringBuffer("你好，世界");
		StringBuffer strbuf2 = new StringBuffer("你好，世界");
		StringBuffer strbuf3 = new StringBuffer("你好，世界");
		
		strbuf1.append("a");
		strbuf1.append(1213l);
		strbuf1.reverse();
		System.out.println(strbuf1.toString());
		strbuf1.reverse();
		strbuf1.insert(3, "abc");
		System.out.println(strbuf1.toString());
		strbuf1.deleteCharAt(3);
		System.out.println(strbuf1);
		strbuf1.delete(2, 4);	//删除[2,4)左闭右开之间的元素
		System.out.println(strbuf1);
		
		strbuf1.replace(3, 5, "北京");
		System.out.println(strbuf1);
		strbuf1.setCharAt(3, '南');
		System.out.println(strbuf1);
		System.out.println(strbuf1.capacity());
		strbuf1.setLength(0);		//强制清空
		System.out.println(strbuf1);
		
		strbuf1.trimToSize();
		strbuf1.append("dfsdfs");
		System.out.println(strbuf1.capacity());
		
		//System.out.println(strbuf1.toString().equals(strbuf2.toString()));
		
		
		
//		final int N = 500000;
//		long startTime = System.currentTimeMillis();
//		String str = "*";
//		for(int i = 0; i < N; i++){
//			str += "*";
//		}
//		
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("+= 用时：" + (endTime - startTime) + "毫秒");
//		
//		//************************
//		startTime = System.currentTimeMillis();
//		
//		StringBuffer str1 = new StringBuffer("*");
//		for(int i = 0; i < N; i++){
//			str1.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("+= 用时：" + (endTime - startTime) + "毫秒");
//		
//		//************************
//		startTime = System.currentTimeMillis();
//			
//		StringBuilder str2 = new StringBuilder("*");
//		for(int i = 0; i < N; i++){
//			str2.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("+= 用时：" + (endTime - startTime) + "毫秒");
		
//		String str1 = "a";
//		String str2 = "b";
//		String str3 = str1 + str2;
//		
//		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
	}
}
