
public class Array1 {

	public static void main(String[] args) {
		// 방법 1. 크기가 5인 배열을 생성하고 직접 값을 저장
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[2]);
		
		// 방법 2. for문을 이용하여 생성하고 값을 지정함
		int[] arrFor = new int[5];
		
		for (int i = 0; i < arrFor.length; i++) {
			arrFor[i] = i+1;
			
		}
		System.out.println(arrFor[2]);
		
		// 방법 3. 생성과 동시에 값을 저장
		//int[] arr = new int[] {1,2,3,4,5};
		//int[] arr = {1,2,3,4,5};
		
		// 생성과 값을 저장하는 식을 따로 쓸 때는 new int[] 생략 불가
		int[] arr;
		arr = new int[]{1,2,3,4,5};
		
		System.out.println(arr[2]);
	}

}
