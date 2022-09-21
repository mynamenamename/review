package basic2;

public class Ex01_while {

	public static void main(String[] args) {
        //연습 for문 권장
		
		
		/*
		// 0. for문
		int sum = 0;
		for (int i = 1; i <= 10; i++) { //1부터;10까지;하나씩증가
			sum += i;                   //sum=sum+i
		}
		System.out.println(sum);
		*/
        
		/*
        // 1. whlie문		
		
		//초기치를 반복블록 위로
	    //증가치를 반복문 끝으로
	    //조건문만 남아서 for > while
		
		int sum=0;
		int i=1;          //초기치 반복블록 위로
 		while (i<=10) {   //for >> while
			sum+=i;        
			i++;          //증가치를 반복문 끝으로
		}
		System.out.println(sum);
		*/
		
		// 2. do~while문
		
		int sum=0;
		int i=1;          //초기치 반복블록 위로
		do {              //for >> while
			sum+=i;        
			i++;          //증가치를 반복문 끝으로
		}while (i<=10);
		System.out.println(sum);	
		
		
		
	}

}
