
public class Array1 {

	public static void main(String[] args) {
		// ��� 1. ũ�Ⱑ 5�� �迭�� �����ϰ� ���� ���� ����
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[2]);
		
		// ��� 2. for���� �̿��Ͽ� �����ϰ� ���� ������
		int[] arrFor = new int[5];
		
		for (int i = 0; i < arrFor.length; i++) {
			arrFor[i] = i+1;
			
		}
		System.out.println(arrFor[2]);
		
		// ��� 3. ������ ���ÿ� ���� ����
		//int[] arr = new int[] {1,2,3,4,5};
		//int[] arr = {1,2,3,4,5};
		
		// ������ ���� �����ϴ� ���� ���� �� ���� new int[] ���� �Ұ�
		int[] arr;
		arr = new int[]{1,2,3,4,5};
		
		System.out.println(arr[2]);
	}

}
