class ForEx {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("I like Java" + i);
		}
		//System.out.println("i : " + i); // error : for������ ������ �����̹Ƿ� �ۿ��� �� �� ����.

		int n = 1;
		System.out.print("n :");		//System.out.print() -> ��� �� enter�� ������� ����
		for (; n <= 5; n += 2) {
		// �ܺ� ���� ���� for���� ���� ������ ������ �� ����
			System.out.print(" " + n);
		}
		System.out.println("\nn : " + n);	// "\n" -> enter

		int m;
		System.out.print("m :");
		for (m = 1; m <= 5; m += 2) {
		// �ܺ� ���� ���� �ʱ�ȭ�� for�� �ȿ��� �����ص� ����
			System.out.print(" " + m);
		}
		System.out.println("\nn : " + n);

		for (int i = 0, j = 10; i < 5; i++, j--) {
		// ��ǥ�� �����Ͽ� ���� ���� ������ ����� ���� ����
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}

/*
I like Java0
I like Java1
I like Java2
n : 1 3 5
n : 7
m : 1 3 5
n : 7
i : 0, j : 10
i : 1, j : 9
i : 2, j : 8
i : 3, j : 7
i : 4, j : 6
*/