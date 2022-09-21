package basic2;

import java.util.Scanner;

/*
 * for: 반복 횟수가 정해진 경우
 * while: 반복 횟수를 모르는 경우
 * do~ while: 반복 횟수를 모르는 경우 (조건을 나중에 비교)
 */

public class EX02_반복문구분 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		/*
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		// 1. for문

		System.out.println("몇 번 반복?");
		int su = input.nextInt();

		for (int ii = 0; ii < su; ii++) {

			System.out.println("원하는 구구단의 단을 입력하세요>>");
			int j = input.nextInt();

			for (int i = 1; i <= 9; i++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
				System.out.println();
			}
			System.out.println();
		}
		*/
		/*
		//2.while
		
		
		
		while(true) {
			
		System.out.println("원하는 구구단의 단을 입력하세요>>");
		int j = input.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.print(j + "*" + i + "=" + j * i + " ");
			System.out.println();
		}
		System.out.println("반복을 종료(Y)");
		input.nextLine();     //엔터값 한번 먹기 (자바 버그)
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("Y")) break;       //문자열은 equals로 비교하기!!
		                                              // equalsIgnoreCase 대소문자 비교 안함
		}
		*/
		
		//3. do~ while
		
		
	do {
		System.out.println("원하는 구구단의 단을 입력하세요>>");
		int j = input.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.print(j + "*" + i + "=" + j * i + " ");
			System.out.println();
		}
		
		/* 내가한것
		
		
		System.out.println("반복을 종료(Y)");
		input.nextLine();     //엔터값 한번 먹기 (자바 버그)
		String answer = input.nextLine();
		if(answer.equalsIgnoreCase("Y")) break;    
		
		
		
		
		*/
		
		System.out.println("반복을 종료(Y)");
		String answer = input.next();
		if(answer.equalsIgnoreCase("Y"))
		break;      
		                                            
 	 }while (true);
     
     
		
		
		
	}

}
