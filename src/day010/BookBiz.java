package day010;

public class BookBiz {

	public void test(int num){
		num++;
	}
	
	public int sellBook(Book book){
		if(!(book.getCount() > 1)){
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}
