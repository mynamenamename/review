package basic5;

public class Book {

	private static int count;   //static >>객체끼리의 공유 가능하게
	
	public Book() {  //기본생성자
		count++;
	} 
	
	public static int getCount() {//static >>클래스명 접근 가능하게 
		return count;
	}
	
}


/*
 * static
 * 
 * - 객체의 공유
 * - 객체생성 보다 먼저 실행하기 때문에, 클래스명 접근이 가능하다.
*/
