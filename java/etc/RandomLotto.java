import java.util.*;

class RandomLotto {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������ : 1 ~ 45������ ���� 6���� �ߺ����� �ʰ� ���
		int [] arrLotto = new int[6];			// 6�� ���ڸ� ������ �迭
		Random rnd = new Random();
		for (int i = 0; i < arrLotto.length; i++) {			// 6�� ȸ�� -> ���� ��� ���� �޾Ƽ� ���
			arrLotto[i] = rnd.nextInt(45) + 1;		// 1���� 45���� ��ȣ ���� �� �迭�� ����
			for (int j = 0; j < i; j++) {		// �̹� �ִ� �迭�� ���� ���� �迭�� �ִ��� Ȯ��
			// ���� ���� ������ ���� �ε����� ���� �迭�� ������ ������ ���鼭 ����
				if (arrLotto[j] == arrLotto[i]) {
				// arrLotto�迭�� ����� ���� ���� �߿��� ���� ���� ���� ������ ���� ������
					i--;
					break;
					// ������ ���� �ٽ� �޾ƾ� �ϹǷ� �ε����� ���� i�� ���� �ٽ� 1���ҽ�Ų �� ���� for���� ��������
				}
			}
		}
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.print(arrLotto[i] + " ");
		}
		System.out.println();
	}
}
