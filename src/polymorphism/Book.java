package polymorphism;

public class Book extends Item {

	private String author;
	private String pub;

	public Book() {
      this("000","제목없음","무명","인터넷");  
      //아래의 생성자 형식에 따라 
      //number = "000";  
      //author = "김김김" ... 해야되는걸 아래 생성자 호출 하면서 간단하게 처리
      System.out.println("Book의 기본생성자");
	}

	public Book(String number, String name, String author, String pub) {
		//super.number = number; // 부모클래스 호출
		//super.name = name; // 부모클래스 호출
		super(number,name);      //위랑 같은 형식 < this는 이렇게 안댐
		this.author = author;
	    this.pub = pub;
		System.out.println("Book의 인자있는 생성자");
	}

	public void output() {
		System.out.println("번호: " + number);
		System.out.println("이름: " + name);
		System.out.println("저자: " + author);
		System.out.println("출판사: " + pub);
	}

}
