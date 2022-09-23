package polymorphism;

abstract public class Item {

	protected String number;
	protected String name;

	public Item() {

	}

	public Item(String number, String name) {
		this.number = number;
		this.name = name;
	}

	abstract public void output(); 
	   /*{
	 
		System.out.println("번호: " + number);
		System.out.println("이름: " + name);

	}
	*/
	

}
