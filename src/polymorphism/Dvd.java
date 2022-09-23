package polymorphism;

public class Dvd extends Item {

	String actor;
	String director;

	public Dvd() {
		this("001", "무명", "박해일", "봉준호");

	}

	public Dvd(String number, String name, String actor, String director) {
		super.number = number;
		super.name = name;
		this.actor = actor;
		this.director = director;
	}

	public void output() {
		System.out.println("번호: " + number);
		System.out.println("이름: " + name);
		System.out.println("배우: " + actor);
		System.out.println("감독: " + director);
	}

}
