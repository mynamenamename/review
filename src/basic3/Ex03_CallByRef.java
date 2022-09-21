package basic3;

public class Ex03_CallByRef { //원본을 수정한다

	public static void main(String[] args) {

       StringBuffer a = new StringBuffer("안녕");
       StringBuffer b = new StringBuffer("하이");
		 
       add (a,b);
        System.out.println("A1=" +a + ", B1=" + b);   //2 , a=안녕하이, b=하이
	}
   
    static void add(StringBuffer a, StringBuffer b) {
    	a.append(b); // 더하는 함수                  
    	System.out.println("A2=" +a + ", B2=" + b);  //1 , a=안녕하이 , b=하이
    }
}




/*
 *  문자열처리 클래스
 *  -String
 *  
 *  
 *  -StringBuffer / StringBuilder (거의 동일)
 *  
 *  
 */


