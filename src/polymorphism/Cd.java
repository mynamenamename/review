package polymorphism;

public class Cd extends Item {

	String singer;

	public Cd() {
     this("001","데뷔곡","트와이스");  //아무것도 입력 안했을 때 나오는거
	}

	public Cd(String number, String name, String singer) {
		super.number = number;
		super.name = name;
		this.singer = singer;
	}

	public void output() {
		System.out.println("번호: " + number);
		System.out.println("이름: " + name);
		System.out.println("가수: " + singer);

	}

}
