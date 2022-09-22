package basic4;

public class Test {

	
	/*
	 * 1. 다음 프로그램의 결과는?

 

public class Test {

public static void main ( String  [] args ) {

  String s;     //지역변수   

  System.out.println(“s=” + s );

}

}

 

           (1) String s에 초기값을 지정하지 않아 컴파일 에러가 발생한다.   //정답

           (2) 결과는 “s=”만 출력된다.

           (3) 결과는 “s=null”이라고 출력된다.      >> 멤버변수 일때

           (4) 컴파일은 성공하지만, 실행할 때 NullPointerException이 발생한다.

 

 

 

2 다음 소스중에서 출력 결과로 “i=0”이라고 출력되는 것은?

           (1) class Test {

                       int  i;   >>멤버변수 초기화 0  >>>static이 아니기 때문에 에러

                       public  static void main( String [] args ) {

                                  System.out.println(“i=”+i );

                       }

              }

//정답 난 틀림   (2) class Test {

                       static  int  i;

                       public  static void main( String [] args ) {

                                  System.out.println(“i=”+i );

                       }

              }

           (3) class Test {
                                           
                       int  i;

                       public  static void main( String [] args ) {

                                  System.out.println(“i=”+Test.i );

                       }

              }

           (4)  class Var { 

                       private  int  i;

              }

              class Test {

                       int  i;

                       public  static  void main( String [] args ) {

                                  Var  v = new Var();

                                  System.out.println(“i=”+v.i );
                                                   >>i는 var i맞는데 private때문에 에러
                       }

              }

 

 

 

3. 다음 소스에서 method() 메소드의 오버로딩으로 선언한 메소드는?

class Test {

    private int x, y;

    private double z;

    public void method ( int a, int b, double c ) {

        x = a;

        y = b;

        z = c;

    }

}


           (1) void  method( int a, int b, double c ) {

                   x = a;

                   y = b;

                   z = c;                

              }

           (2) public  void method ( int a, double b, int c ) { //정답 >> 다르니까

                       method( a, c, b );

              }

           (3) public  void method ( int a, double b, int c ) {

                       this( a, c, b ); >> 생성자에서만 사용

              }

           (4) void  method( int a, int b) {  //정답

                   x = a;

                   y = b;

              }

           (5) void  method( int i, int j, double k ) {      >>자료형이 같아서 답 아님

                   x = i;

                   y = j;

                   z = k;                

              }

 

4. 다음 소스에서 잘못 된 부분을 찾아 수정하시오.

class MyClass{

     int  var ;

}

public class Test {

   public static void main ( String [] args ) {

                     =  new MyClass () ;     <<  추가  //객체 생성하기!!

         MyClass  my;                      
         
         my.var = 1000;          

         System.out.println( my. var );

   }

}

 

5. 다음 소스에서 잘못 된 부분을 찾아 수정하시오.

class MyClass{

     public int  method ( int i , int j ) {          >>함수명을 바꾸던지, 함수명 냅두고 자료형 변경

          return i + j;

     }

     public double method  ( int i, int j ) {      >> int를 double로 변경

          return ( i + j ) / 3. 0;

     }

}

 

6. 다음 소스에서 잘못 된 부분을 찾아 수정하시오.

class MyClass{

   String name;

   public MyClass() {

       System.out.println(“생성자 실행”);    

       this(“이름없음”);               >>this가 위로 와야함

   }

   public MyClass( String name ) {

      this.name = name;

   }  

public static void main ( String [] args ) {

      MyClass  my = new MyClass();
      
      
      
      

 }

}
	
	
	 * 
	 */
	
	
	
}
