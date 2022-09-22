package singleton;

/**** Singleton Pattern 잘 외우고 이해하기 많이 쓴다~!****/ 

public class DBConnect {

	private DBConnect() {
		System.out.println("실제 DB 연결");
	}
	
	private static DBConnect con = null;        //static 접근하기 위해서

	public static DBConnect getInstance() {   //return 값이 DBConnect 라서
		if (con == null) {                    //객체생성 하기 위해서 static
			con = new DBConnect();
		}
		return con;
	}

}
