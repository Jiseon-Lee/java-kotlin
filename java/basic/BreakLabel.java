class BreakLabel {
	public static void main(String[] args) {
		// i�� j�� ���� �� �� ¦���� ��� ����� ����
		for (int i = 1; i < 4; i++) {							// i = 3
			for (int j = 1; j < 4; j++) {						// j = 1
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) {
					break;
					// ��ø ���������� break�� ����ϸ� ���� ���� �������� ��������
				}
			}
		}

		System.out.println("\n-------------------------------------------------------");

		outerLoop:	// Ư�� �������� ǥ�����ִ� ���̺�(label)
		for (int i = 1; i < 4; i++) {							// i = 2
			for (int j = 1; j < 4; j++) {						// j = 2
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) {
					break outerLoop;	//outerLoop��� ǥ���� ���� �������� ��������
				}
			}
		}
	}
}
