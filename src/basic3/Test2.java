package basic3;

public class Test2 {

/*
 * (문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 

함수명 : checkLower

인자 : char

리턴(반환) : boolean
 
 

 */
	
/*	 내가푼것
public static void main(String[] args) {
	
	   checkLower('g');
	
}
	
static void checkLower(char n) {
	 boolean a= true;
	 boolean b= false;
	 if(Character.isLowerCase(n)) {
		 System.out.println(a);
	 }else {
		 System.out.println(b);
	 }
	 }
*/
	public static void main(String[] args) {
		
		   boolean a =checkLower('g');
           boolean b =checkLower('G');		
           System.out.println(a);
           System.out.println(b);
	}
		
	static boolean checkLower(char n) {
		
		 if(Character.isLowerCase(n)) {
			return true;
		 }else {
			return false;
		 }
	
	}
	
}
