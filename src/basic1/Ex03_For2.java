package basic1;

public class Ex03_For2 {

	public static void main(String[] args) {
		
      //못함ㅋ	
	  /*	
	  for (int i=0; i <26; i++) {	
		
      for (char ii='A'; ii<='Z'; ii++) {
    	  System.out.print(ii + " ");
      }
  	    System.out.println();
	  }
	  */
		
	 //1번
	  
	  System.out.println("=====1번=====");	
		
	  for (int i=0; i <26; i++) {	
			
	      for (char ii='A'; ii<='A'+i; ii++) {
	    	  System.out.print(ii + " ");
	      }
	  	    System.out.println();
		  }
	  
	  System.out.println("=====2번-1=====");
	  //2번

		
			for( char ii='Z'; ii>='A'; ii--) {	
		      for (char iii='A'; iii<=ii; iii++) {
		    	  System.out.print(iii + " ");
		      }
		  	    System.out.println();
			  }
	
	  System.out.println("=====2번-2=====");		
	  
	  for (int i=0; i <26; i++) {	
			
	      for (char ii='A'; ii<='Z'-i; ii++) {
	    	  System.out.print(ii + " ");
	      }
	  	    System.out.println();
		  }
	  
	  System.out.println("==============");	
			
			
	  //3번		//못품
	  System.out.println("=====3번=====");	
		
	  for(int i = 0; i < 26; i++) {
		  for(char a = (char) ('A'+i); a <= 'Z'; a++) {
		  System.out.print(a);
		  }
	  }
		 
			
	  //4번
	  
	  System.out.println("=====4번=====");
	   for (int i=0; i <26; i++) {	
			
	      for (char ii='Z'; ii>='Z'-i; ii--) {
	    	  System.out.print(ii + " ");
	      }
	  	    System.out.println();
		  }
	  
	  
	   System.out.println("==============");
		
	  
	  //5번 //못품
	  
	   System.out.println("=====5번=====");
	
	   for(int i = 0; i < 26; i++) {
		   for(int j = 0; j < i; j++) {
		   System.out.print(" ");
		   }//for
		   for(char a = (char) ('A'+i); a <= 'Z'; a++) {
		   System.out.print(a);
		   }//for
		   System.out.println();
		   }//for     
	   
		  System.out.println("==============");
		
	   
	   
	 
/*	 for (int i=0; i <26; i++) {	
			
	      for (char ii='Z'; ii>='A'+i; ii--) {
	    	  System.out.print(ii + " ");
	      }
	  	    System.out.println();
		  }
	  
	  System.out.println("==============");
	
	  */
	  
	  
	  
	  
	}

}
