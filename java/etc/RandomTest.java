import java.util.*;

class RandomTest {
	public static void main(String[] args) {
		// 1 ~ 10������ ������ �� 3���� �������� �����Ͽ� ��� : ��, Ȧ���� ¦������ �� �� ���� Ȯ���� ���;� ��
		int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10};

		Random rnd = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[rnd.nextInt(15)] + "  ");
		}
	}
}
