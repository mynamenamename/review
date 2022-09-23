package zfinal;
//하나의 자바파일에 여러 클래스 가능하지만 NO권장
//연습이라 함

class Parent {
	final String field = "부모님꺼"; //final >> 값 변경을 못하게!
	final public void jib() {
		System.out.println("부모님이 만드심");
	}
}

class Child extends Parent {
	Child () {
		//field = "내꺼";
	}
//	public void jib() {                   >> 메소드 오버라이딩 불가
//		System.out.println("내가 탕진");
//	}
	
}


public class Test {

	public static void main(String[] args) {
             Parent p = new Child();
             System.out.println(p.field);
             p.jib();
             
	}

}
