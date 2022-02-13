class MethodPrimeNumber {
	public static void main(String[] args) 	{
		/*
		1~100 ������ ������ �� �Ҽ��� ���Ͽ� ���
		��, ���޵� ���� �Ҽ����� ���θ� �Ǵ��� �ִ� �޼ҵ带 �����Ͽ� �۾�
		*/
		for (int i = 1, j = 0; i <= 100; i++) {	// i : 1���� 100���� �˻�, j : �Ҽ��� ����
			if (isPrime(i)) {
				System.out.print(i + "  ");		// System.out.print((i < 10 ? " " : "") + i + "  "); // ���׿����� ���
				if (i < 10) {
					System.out.print(" ");	// �� ����
				}
				j ++;
				if (j % 10 == 0) {	// 10������ �� �ٲ�
					System.out.println();
				}
			}
			
		}
	}

	public static boolean isPrime(int n) {		// 2�� ����� ���� ����
		// �޾ƿ� ����(n)�� �Ҽ����� ���θ� �����ϴ� �޼ҵ�
		if (n == 1 || (n != 2 && n % 2 == 0)) {
		// n�� ���� 1�� �ƴϰų� 2�� �ƴϸ鼭 ¦���� ���� �Ҽ��� �ƴ�
			return false;
		}
		for (int i = 2; i < n / 2; i++) {	// n / 2���� ū ���� ������ �׻� �Ҽ��� �����Ƿ� n / 2������ ������ �� -> �� ȿ����
			if (n % i == 0) {	// �������� ���� ������ �Ҽ��� �ƴ�
				return false;
			}
		}
		return true;	// �������� ���� ������ �Ҽ�
	}

	public static boolean isPrimeMy(int n) {	// ���� �� isPrime
		// �޾ƿ� ����(n)�� �Ҽ����� ���θ� �����ϴ� �޼ҵ�
		if (n == 1) {	// 1�� �Ҽ��� �ƴϹǷ� ����
			return false;
		}
		for (int i = 2; i < n; i++) {	// n�� 2���� n-1���� ����
			if (n % i == 0) {	// �������� ���� ������ �Ҽ��� �ƴ�
				return false;
			}
		}
		return true;	// �������� ���� ������ �Ҽ�
	}
}
