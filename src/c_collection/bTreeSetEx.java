package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");
	

		System.out.println( set );
		//정렬된 것처럼 출력해줌(a,b,c..)
		//tree 구조이기 때문에 > 나보다 작으면 왼쪽, 크면 오른쪽
		
		System.out.println(set.subSet("d", "s"));
		//d부터 s앞까지
		
		System.out.println(set.headSet("e"));
		//e 앞까지
		
		System.out.println(set.tailSet("e"));
		//e 뒤부터 시작

	}
}
