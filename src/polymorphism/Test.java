package polymorphism;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		
		
        /*
		// Book b = new Book("001","사피엔스","하라리","코스모출판");
		// b.output();

		Item b = new Book("001", "사피엔스", "하라리", "코스모출판");
	    b.output();     //부모 안에 있으니까 가능

		//Item b = new Book();
		//b.output();
	    System.out.println("====");
	     Dvd d = new Dvd();
	     d.output();
	     */
		Item i = null; 
		
		//Book b;
		//Dvd d;
		//Cd c;
		// 하나씩 선언하고 부르고 출력하는 대신 하나로 선언해서 깔끔하게!
		
		System.out.println("해당하는 물품번호(1.책 2.DVD 3.CD)");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
		case 1 : i = new Book("001","사피엔스","하라리","코스모출판"); break;
		case 2 : i = new Dvd("001", "무명", "박해일", "봉준호"); break;
		case 3 : i = new Cd("001","데뷔곡","트와이스"); break;
				
		}
		
		i.output(); //오버라이딩이 되어야지만 다형성 가넝
		
		
	}

}
