package access;

import accother.Access;

public class MainTest extends Access {

	public static void main(String[] args) {

		MainTest acc = new MainTest();
		// acc.a = "private change"; 같은 class만 가능,private이니까
		acc.b = "public change";
		acc.c = "protected change"; // 다른 package 불가능
									// 자식 클래스 허용 > 객체를 자식으로 생성하면 가능
		// acc.d = "default change"; 다른 package 불가능
		acc.output();

	}

}
