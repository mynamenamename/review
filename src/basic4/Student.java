package basic4;
             
public class Student {

	private String hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	//기본생성자 습관적으로 만들기~!
	public Student () {                     //  1
		/*
	   this.name = "이름없음";       //다른 멤버변수 부를때
	   this.kor = 50;
	   this.eng = 60;
	   this.math = 60;
	   */
		//Student("이름없음",50,50,50); // 오류
		this("이름없음",50,50,50);   //다른 생성자함수를 부를때 , 무조건 첫라인에 위치해야함
		System.out.println("기본생성자");            //4
	}
	
	
	//생성자함수
	public Student(String name,int kor, int eng, int math) {   //2
		 this.name=name;
		 this.kor=kor;
		 this.eng=eng;
		 this.math=math;
		 System.out.println("인자있는 생성자");     //3
	}
	
	
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void calTotal() {
		total = kor + eng + math;
	}
	public  void calAvg() {
		avg = total / 3;
	}
	public  void output () {
		System.out.println(name +"님 성적 : " + total + "/" + avg);
	}
	
	
}





/*
 * 
 * 캡슐화  
 *       - 멤버변수(field) : private  <데이터 접근을 막는다>
 *       - 멤버메소드 : public 
 * 
 * 
*/
