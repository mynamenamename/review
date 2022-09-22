package basic4;

import java.util.Scanner;

public class CalculatoTest {

	public static void main(String[] args) {

		CalculatorExpr cal = new CalculatorExpr();
		Scanner input = new Scanner(System.in);
		int count=0;
		
		
	do {	
		System.out.println("숫자를 입력하세요");
	   
		int num1 = input.nextInt();
		int num2 =input.nextInt();
		if (count >0) {
			cal.num (num1,num2);
			System.out.println("추출된 숫자: " + num1 + "," + num2);
			}
		cal.getAddition(num1,num2);
		cal.getSubtraction(num1, num2);
		cal.getMultiplication(num1, num2);
		cal.getDivision(num1,num2);
		count++;
		
		System.out.println("계속 진행하시겠습니까?(Y/N)");
	
		String answer = input.next();
		if(answer.equalsIgnoreCase("Y")) {
		}else {
			String answer1 = input.next();
			if(answer1.equalsIgnoreCase("N"))
			break;
		}
		
	}while (true);
	
	}

}
