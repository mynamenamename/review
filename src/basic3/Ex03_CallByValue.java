package basic3;

public class Ex03_CallByValue {     //기본값을 보냈을 때 원본에 영향을 미치지 않는다
 
	public static void main(String[] args) {
      //흐름잡기
		int a=10,b=20;
		add(a,b);  //add함수에 a,b를 보낸다
		System.out.println("A1=" +a + ", B1=" + b);    //실행순서:2, a=10 ,b=20
	}

	static void add (int a, int b) { //a,b 공간 확보
		a+=b;  // a=a+b   
		System.out.println("A2=" +a + ", B2=" + b);   //실행순서:1, a=30 , b=20
		
	}
	
	
}
