package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList <String> list = new ArrayList <String> (4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정 >> 자료형 정확히 지정하기
		// 헷갈리면 걍 쓰지 말기
		
		//System.out.println(list);
		
		list.set(3, "rabbit");     //fox >> ratbbit 중복 가능
		System.out.println(list);
		
		list.remove(1);        //zebra 지워짐
		System.out.println(list);
		
		Collections.sort(list);   //static 붙어잇어서 가넝 -순서대로
		System.out.println(list);
		
		
		//일반 for문
        for(int i=0; i<list.size();i++) {
        	               //6
        	String data = (String) list.get(i); //get함수는 object로 리턴, 형변환 맞춰서 해야함
        	System.out.println(data);
        }
        	   
        System.out.println("========");
        
        //향상된 for문       <<최근에 자주 사용 //사용하려면 generics가 꼭 잇어야함
        for(String data : list) {       //오른쪽이 집합, 집합에서 하나씩 뽑아서 처리
        	System.out.println(data);
        }
         
        
        
        /*
         * // *collection
                      : 자료구조 관련 클래스의 모임
                      
             1. List
                      - 인덱스 사용 가능 (순서를 저장)
                                
             2. Set  
                      - 순서를 저장하지 않음
                      - 데이터 중복 X
             3. Map   
                      - 키와 값 저장
                      - 키는 중복되면 안됨
                      - 키로 값을 찾는 구조             
                      
                           
           [참고] 스택(Last In First Out) 과 큐(First In First Out)                
                      
         */
        
        
        
        
        
	}
}
