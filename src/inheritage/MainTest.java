package inheritage;

public class MainTest {

	public static void main(String[] args) {
        /*
		Umma u = new Umma();
		u.job();
	    u.gene();
		
		System.out.println("======");
		
		Ddal d = new Ddal(); //d = umma + ddal 
		d.study();
		d.job();
		d.gene();
		*/
		
		//Ddal d = new Umma();
		
		//** 부모변수에 자식객체 생성 가능 **
	//	Umma u = new Ddal();
	//	u.gene();
	//	u.job(); //** 오버라이딩 된 딸 메모리 불러옴 **
		//u.study();
		
		
		// 형변환 : casting
		// 1 > 기본형끼리 
		// 2 > 참조형에서 상속관계에 있는 경우만 가능

		// String s = new String("~~");
		// StringBuffer sb =(StringBuffer)s; >> X
		
		//Umma u = new Umma();
		//Ddal d = (Ddal)u;
	   
		 Ddal d = new Ddal();
		 Umma u = (Umma)d;      //upcasting
		 Ddal d2= (Ddal)u;      //downcasting
		
		
		
	}

}
