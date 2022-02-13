import java.util.*;

class RandomTest {
	public static void main(String[] args) {
		// 1 ~ 10사이의 정수들 중 3개를 무작위로 추출하여 출력 : 단, 홀수가 짝수보다 두 배 높은 확률로 나와야 함
		int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10};

		Random rnd = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[rnd.nextInt(15)] + "  ");
		}
	}
}
