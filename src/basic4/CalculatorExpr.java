package basic4;

public class CalculatorExpr {

	private int num1;
	private int num2;
	int add;
	int sub;
	int multi;
	double divi;
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	void num (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		System.out.println(num1 +","+ num2);
		
	}
	
	
	void getAddition(int num1, int num2) {
		this.add = num1 + num2;                   //this 호출 까먹지 말기
		System.out.println("덧셈 : " + add);
	}
	
	void getSubtraction(int num1, int num2) {
		this.sub = num1 - num2; 
		System.out.println("뺄셈 : " + sub);
	}
	
	void getMultiplication(int num1, int num2) {
		this.multi = num1 * num2;
		System.out.println("곱셈 : "+ multi);
	}
	
	void getDivision(int num1, int num2) {
		this.divi = num1 / num2;
		System.out.println("나눗셈 : " + divi);
	}
	
	
}
