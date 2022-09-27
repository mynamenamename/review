package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet <String> set = new HashSet <String>();  //순서가 없어서 중복값 저장하지 않음
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		
		// [zebra, rabbit, elephant, fox] 
		// 중구난방 출력됨
		// 로또번호,,

	}
}
