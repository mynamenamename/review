package Test0923;

public class Book {

	String title = "데미안";
	String author = "헤르만 헤세";
	String pub = "민음사";
	
	public Book() { }
	public Book(String title, String author, String pub) {
		this.title=title;     //책제목
		this.author=author;   //저자
		this.pub=pub;         //출판사
	}
	
	public void output () {
		System.out.println("책제목: " + title );
		System.out.println("저자: " + author);
		System.out.println("출판사: " + pub);
	}
	
	public static void main(String[] args) {
	
		Book b = new Book("데미안","헤르만헤세","민음사");
		b.output();
	
	}

}
