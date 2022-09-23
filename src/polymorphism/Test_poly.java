
package polymorphism;

public class Test_poly {

	/*
	1. 다음 소스의 실행 결과는?


			abstract class Parent{

			   abstract  int  getNumber( );        <<미완성하겠다  >> ();얘는 부모만 될 수 잇음

			}

			public class Child extends Parent {

			private  int  number = 100;

			private  int  getNumber() {   return  number;  }

			}

			}

			(1) 에러없이 컴파일 된다. (2) 2라인에서 에러가 발생한다

			(3) 4라인에서 에러가 발생한다. (4) 6라인에서 에러가 발생한다.
			
			//4번 >>> 오버라이딩 하랴고했는데 접근지정자가 private 이기때문에  


			2. 다음 소스 중에서 상속 할 수 없는 클래스는?

			(1) final abstract class Test {

			int i;

			void method() { }

			}   
			 >> 말이 안됨 같이 사용 불가

			(2) private class Test {

			int i;

			void method() { }

			}
			 
			 >> class 앞에 private 불가

			(3) abstract class Test {

			int i;

			void method() { }

			}
			 >> 상속 가넝

			(4) class Test {

			final int i;

			final void method() { }

			}
			>> 가능 

			(5) final class Test {    

			int i;

			void method() { }

			}

             //5번


			3. 같은 패키지에 있는 클래스에서는 참조할 수 있고, 다른 패키지에 있는 클래스에서는 참조할 수 없는 메소드를 만들고자 할 때, 이 메소드 앞에 어떤 접근 지정자를 선언해야 하나?

			(1) public (2) private (3) protected (4) 아무것도 지정하지 않는다.         // 정답:4


			4. 다음 소스의 실행 결과는?


			public class Test {

			private  final String str = “매력있는”;

			void method( String s ) {

			    str += s;

			}

			public static void main ( String [] args ) {

			  Test  t = new Test();

			  t.method(“자바”);

			  System.out.println( t.str );

			}

			}

			(1) 컴파일에러가 발생한다 (2) “매력있는” 문장 출력된다.

			(3) “매력있는자바” 문장 출력된다. (4) 실행은 되지만 아무것도 출력되지 않는다.

            //    2 3번 아님  >> 1번  >> final 때문에
             
            
			5. 다음 소스에서 “여기” 부분에 메소드 오버라이딩으로 적합한 것은?


			class  Parent {

			   public void method( ) {   }

			}

			class Child extends Parent {

			   -    여기      -

			}

			(1) void method( ) { }

			(2) public void method( ) { }

			(3) public void method( int i ) { }

			(4) public int method() { return 0; }
 
                 //2번 오버라이딩이니까
                  * {} 여기가 바뀌어야함 *
                  * () 여기가 바뀌면 오버로딩 *

			6. 다음 소스에서 “여기” 부분에 들어갈 코드로 알맞은 것은?


			class  Parent {

			   public double method( ) {   return   36.7;    }

			}

			class Child extends Parent {

			  -   여기      -

			}

			(1) public void method( ) { double d = 36.7; };
			     //불가능 double ==/ void
			  
			(2) public double method( double d ) { return d; }
			     // 가능    >> 오버라이딩 & 오버로딩

			(3) double method( double d ) { return d; }
			     // 가능 >> 오버로딩 됐기 때문에!!

			(4) double method( ) { return 36.7; }
			     //접근지정자 없음
             
              //2번 ? + 3번


			7. 다음 소스에서 “여기” 부분에 들어갈 코드로 알맞은 것은?


			class  Parent {

			final  int  i = 1;

			Parent() { }

			Parent( String s ) { System.out.println(s);  }

			}

			class Child extends Parent {

			   int  i;

			   Child() { }

			   Child( int i ) { - 여기 - }

			   public static void main ( String [] args ) {

			      Child  ch = new Child( 10 );

			   }

			}


			(1) Child ( int i ) {

			this.i = i;

			this();

			}

			(2) Child ( int i ) {

			this.i = i; 

			super(“생성”);

			}

			(3) Child ( int i ) {

			super(“생성”);

			this.i = i; 

			}

			(4) Child ( int i ) {

			super(“생성”);

			super.i = i;      >>코딩은 맞는데 부모의 i는 값변경 불가능

			}
			
			
			//3번
			 

			8. 다음 소스에서 잘못 된 부분을 찾아 수정하시오.

			abstract class  Parent{

			     public void method() { }

			}

			public class Child extends Parent {

			public void method() { }

			public static void main( String [] args ) {

			    Parent  p = new Parent( ); >> 객체생성 불가 child로 바꾸기

			    p.method();

			    Child   c = new Child();

			    c.method();

			}

			}
			
		
			
			abstract 빼기

			 

			9. 다음 소스의 출력 결과는?

			class Parent {

			int  i = 7;

			public int get() {  return i ; }

			}

			class Child extends Parent {

			int  i = 5 ;

			public int get() {  return i ; }

			}

			public class Test {

			public static void main ( String [] args ) {

			   Parent  p = new Parent ();

			   System.out.println(“---------------------1---------------------“);
               //걍 부모 호출
			   System.out.println( p.i );        //7

			   System.out.println( p.get( ) );   // 7

			Child  c = new Child ();

			   System.out.println(“---------------------2---------------------“);
               //자식거 부름
			   System.out.println( c.i );          //5

			   System.out.println( c.get( ) );        // 5

			   Parent  p2 = new Child ();

			   System.out.println(“---------------------3---------------------“);

			   System.out.println( p2.i );         // 7 parent만 가능

			   System.out.println( p2.get( ) );    // 5 >>>>오버라이딩 된거 

			}

			}
		*/	

	
	
	
}
