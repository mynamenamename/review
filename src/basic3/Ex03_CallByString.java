package basic3;

public class Ex03_CallByString { //따로 생각하는것이 편하다

	public static void main(String[] args) {

		String a = new String("안녕");
		String b = new String("하이");

		add(a, b);
		System.out.println("A1=" + a + ", B1=" + b); // 2 , a=안녕, b=하이
	}

	static void add(String a, String b) {

		a += b;
		System.out.println("A2=" + a + ", B2=" + b); // 1 , a=안녕하이 , b=하이
	}

}
