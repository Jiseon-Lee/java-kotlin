import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���� : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("�ּڰ� : " + minValue(arr));
		System.out.println("�ִ� : " + maxValue(arr));
	}

	public static int minValue(int[] arr) {
	// �޾ƿ� �迭���� �ּڰ��� ���Ͽ� �����ϴ� �޼ҵ�
		int min = arr[0];				// arr�迭�� ù��° ���� �����Ͽ� �ٸ� ����� ���ϸ鼭 �۾��� ��
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
	// �޾ƿ� �迭���� �ִ��� ���Ͽ� �����ϴ� �޼ҵ�
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
