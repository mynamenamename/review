package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {

		int sum = sumFunc(3);
		System.out.println("합: " + sum);
	}

	static int sumFunc(int i) {
		// sum = 1 + 2 + 3(최종값)
		if (i == 1) return 1;
		else {
		return i + sumFunc(i - 1);      // 3 +  2 ~1 의 합
		 
		}
 
	

		/*
	sayhello (6);	
	}
	
	public static void sayhello (int num) {
		if(num==0) return;
		else {
			System.out.print("안녕 ");
			sayhello(num-1);
		}
		
		*/
	}
	
}
