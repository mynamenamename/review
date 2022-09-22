package singleton;

public class WorkA {

	DBConnect con;
	
	public WorkA() {  //기본생성자 습관처럼 만들기~!
		//con = new DBConnect();
		//con.getInstance();    //객체가 생성되어야 만들수 잇음
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}
	
}
