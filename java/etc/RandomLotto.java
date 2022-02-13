import java.util.*;

class RandomLotto {
	public static void main(String[] args) {
		// 로또 번호 생성기 : 1 ~ 45까지의 정수 6개가 중복되지 않고 출력
		int [] arrLotto = new int[6];			// 6개 숫자를 저장할 배열
		Random rnd = new Random();
		for (int i = 0; i < arrLotto.length; i++) {			// 6번 회전 -> 숫자 대신 값을 받아서 출력
			arrLotto[i] = rnd.nextInt(45) + 1;		// 1부터 45까지 번호 추출 후 배열에 저장
			for (int j = 0; j < i; j++) {		// 이미 있는 배열에 내가 뽑은 배열이 있는지 확인
			// 현재 받은 값보다 작은 인덱스를 가진 배열의 값들을 루프를 돌면서 비교함
				if (arrLotto[j] == arrLotto[i]) {
				// arrLotto배열에 저장된 기존 값들 중에서 현재 받은 값과 동일한 값이 있으면
					i--;
					break;
					// 동일한 값은 다시 받아야 하므로 인덱스로 사용될 i의 값을 다시 1감소시킨 후 안쪽 for문을 빠져나감
				}
			}
		}
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.print(arrLotto[i] + " ");
		}
		System.out.println();
	}
}
