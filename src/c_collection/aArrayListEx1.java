
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList result = dataSet();
		
		for(int i=0;i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	// dataSet() 안의 변수 값들을 여기서 출력한다면??
	
	static ArrayList dataSet()
	{
		String	name = "김태희";
		Integer	age = 31;      //int age = 31;
		Double	height = 162.3;
        
		//앞으로 가장 많이 사용할듯
		
		//갯수가 명확하지 않을때 >>> ArrayList 동적인 배열 
		ArrayList list = new ArrayList(); //몇 개를 써도 자동으로 맞춰줌
		list.add(name);
		list.add(age);
		list.add(height);
		
        return list;

	}
}
