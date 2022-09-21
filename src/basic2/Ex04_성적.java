package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {

	 	Scanner input = new Scanner(System.in);

	 	int kor[] = new int[3];
		
		for(int i=0; i<kor.length; i++) {
			System.out.println(i + "번 학생의 국어점수를 입력");
			kor[i] = input.nextInt();
		}
		
		//출력
		for(int i=0; i<kor.length; i++) {
		System.out.println(i + "번 학생의 첨수:" +kor[i]);
		}
		
		//위 학생들 점수의 총점과 평균을 출력해 보세요
		
		double sum=0;
		for(int i=0; i<kor.length; i++) {
			sum+=kor[i];            //sum=sum+kor[i]
			}
	    System.out.println("총점:" +sum + " ");	  
	    System.out.println("평균:" + sum/kor.length);
	}

}
