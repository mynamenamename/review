package c_collection;

import java.util.*;

public class bHashSetLottoEx {
	public static void main(String[] args) {
		HashSet<Integer> lottos = new HashSet<Integer>();

		// for(int i=0;i<6;i++) {    // 여기서 i<lottos.size가 안되는 이유는
		                             // 이때는 lotto.size가 0이니까, lottos는 밑에서 추가되기 때문!!
		while (lottos.size() < 6) { // 몇 번까지인지 모르니까
			int num = (int) (Math.random() * 45)  + 1; //double > int
			lottos.add(num);
		}
		System.out.println(lottos);

		ArrayList list = new ArrayList(lottos);
		Collections.sort(list); // Collections.sort는 list만 가능(순서대로)
		System.out.println(list);
	}
}
