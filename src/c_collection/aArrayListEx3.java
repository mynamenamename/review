package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {

		ArrayList<Student> result = method();
		// 변수명 달라도 되지만 헷갈려서 똑같이 하는게 좋음

		// 학생정보를 여기서 출력하세요

		// System.out.println(result); //>>배열로 출력

		// 향상된 for문 출력
		for (Student s : result) {
			System.out.println(s);
		}
		
		// [참고] 전체요소를 순서대로 검색
		//      Enumeration >> Iterator 
		System.out.println("===================");
		Iterator <Student> it = result.iterator ();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	static ArrayList <Student> method() {
		ArrayList <Student> list = new ArrayList <Student> ();
		// Student s = New Student("홍길동",25);
		// 변수 선언 한번만 할 때는 바로 넣기

		list.add(new Student("홍길동", 25));
		list.add(new Student("홍길이", 33));
		list.add(new Student("홍삼둥", 44));
		return list;
	}

}

//----------------------------------------------------------
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " 학생은 " + age + "세 입니다.";
	}
}
