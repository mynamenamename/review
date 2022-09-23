package inheritage;

public class Ddal extends Umma {
  
	public Ddal () {
		System.out.println("딸 생성자");
	}
	
	public void study() {
		System.out.println("딸은 공부중");
	}
	
	public void job() {     //동일한 메소드(생성자, 인자)
		                    //method overriding
		System.out.println("직업 없음");
	}
	
	
}
