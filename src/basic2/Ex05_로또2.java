package basic2;

public class Ex05_로또2 {

	public static void main(String[] args) {

		
		
		int[] arr = { 30, 5, 21, 10, 4, 13, 8, 25, 19, 1 };

		// -i를 하는 이유? -> 제일 큰수가 맨 마지막으로 정렬이 됨 (맨 마지막은 비교를 안해도 된다는 것)
		for (int i = 0; i < arr.length; i++) { // i는 몇회전 하는지에 대한 값
			for (int j = 0; j < arr.length -i-1; j++) {  // j는 값을 비교하고 자리를 바꿔주는 역할
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 1 4 5 8 10 13 19 21 25 30
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

		// 총 라운드는 배열 크기 - 1 번 진행되고,
		// 각 라운드별 비교 횟수는 배열 크기 - 라운드 횟수 만큼 비교한다.
       
	}

}
