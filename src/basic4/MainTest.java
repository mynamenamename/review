package basic4;

public class MainTest {

	public static void main(String[] args) {
        
		//값 정 1 - setter
		Student s= new Student();          //메모리에 올리기
		/*
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(30);
		s.setMath(55);
	    	*/
		
		
		
		//값 지정 2 - 생성자
		//Student s = new Student("홍길동", 99, 88, 99);
		
		
	
		
		s.calTotal();
		s.calAvg();
		s.output();
		
	}

}
