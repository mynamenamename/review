package Test0923;

import java.util.Calendar;
import java.util.Scanner;

public class YearAndAge {

	public static void main(String[] args) {

	//가)
		System.out.println("태어난 연도를 입력하세요");
		Scanner input = new Scanner(System.in);
		int myyear = input.nextInt();
    //나)   
		int age=0;
		
		Calendar today = Calendar.getInstance();
	    int year = today.get(Calendar.YEAR);
	    age = year-myyear;
	    
	    System.out.println("나이:"+ age);   //나이
	    System.out.println("현재년도:"+ year);  //현재년도
	    
	    
		
		
	
	}

}
