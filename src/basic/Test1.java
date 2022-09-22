package basic;

import java.awt.*;  //화면에 관련된 임포트

public class Test1 {

	Frame f;
	
	Test1() { //생성자 함수
		f = new Frame("나의 첫 창"); 
	}
	
	void addLayout() {
		f.setBounds(100, 100, 300, 260);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

		Test1 t1 = new Test1();
		
		t1.addLayout(); // void 부르기
		
	}

}
