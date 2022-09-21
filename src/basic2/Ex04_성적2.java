package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {

	 	Scanner input = new Scanner(System.in);

	 	int kor[] = new int[3];
		
		/*
		 * 3명의 국어점수를 입력하세요(ex. 10/20/30)
		 */
		System.out.println(kor.length + "명의 국어점수를 입력하세요. (ex. 10/20/30)");
	 	String inputData = input.nextLine();   //"10/20/30" 
	 	StringTokenizer st = new StringTokenizer(inputData, "/");  //inputData를 "/" 로 나눈다
	 	for(int i= 0;st.hasMoreTokens(); i++) {    //for문으로 i는 0부터 단어개수만큼(hasMoreTokens) 돌린다
	 		String str = st.nextToken();   //존재하는 토큰(분리된 문자열)을 하나씩 꺼내온다
	 		kor[i] = Integer.parseInt(str); //String str을 int str로 출력 후 할당 
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
