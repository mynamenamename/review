package basic2;

public class Ex04_구글 {

	public static void main(String[] args) {
                 // 1~~9999
		         /* xxx8  10^3=1000
 		          * xx8x  10^3=1000
		          * x8xx  10^3=1000 
		          * 8xxx  10^3=1000
		          * >> 4000개
		          */
		 
		
		System.out.println("======방법1=======");
	
		int count = 0;
	
		for (int i=1 ; i<=10000; i++) {
			if(i%10==8) count++;           //1의 자리
            if((i%10)%10==8) count++;      //10의 자리
		    if((i%100)%10==8) count++;     //100의 자리
		    if((i%1000)%10==8) count++;    //1000의 자리
	}
		System.out.println("결과:" + count);
		
		
		
		System.out.println("======방법2=======");
		
		int count1 =0;         //8이 카운팅 되는 횟수
		for (int i=1 ; i<=10000; i++) {
			int number = i;    
			
			while(number!=0) {  //number
				
				int su = number%10;   //su 는 number를 10으로 나눴을때 나머지
				
				if(su== 8) {        //나머지가 8이면
				    count1++;       // 더해라
				}
				number=number/10;   //나머지가 8이 아니면 더해지지 말고 나가라
			}
		
		}
		System.out.println("결과:" + count1);
		
		
		System.out.println("======방법3=======");
		int count2 = 0;
		for(int i = 1; i <= 10000; i++) {
		    for(int j = i; j > 0; j /= 10) {      // j=j/10
		        if(j % 10 == 8)
		        {
		            count2++;
		        }
		    }
		}
		   System.out.println("결과:" +count2);
	

		   
		 System.out.println("======방법4(숫자를 문자로 변환)=======");
		  
		 int count3=0;
		 for(int i=1; i<=10000; i++) {
			 char [] c = Integer.toString(i).toCharArray();
			 int len = c.length;
		 for(int j=0; j<len; j++) {
			 if(c[j] == '8') {
				   count3++;
		 }
			
	 }
		 
	 }
		 System.out.println("결과:"+count3);
	}

}
