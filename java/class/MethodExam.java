class MethodExam {
	public static void main(String[] args) {
		// �� ���� ������ ���޹޾� �� ���� ���� �������� ������ִ� �޼ҵ� �ۼ�
		printAbs(10, 5);	// 10�� 5�� ���� 5
		printAbs(10, 25);	// 10�� 25�� ���� 15
	}

	public static void printAbs(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + "�� " + num2 + "�� ���� " + (num1 - num2));
		} else {
			System.out.println(num1 + "�� " + num2 + "�� ���� " + (num2 - num1));
		}
	}
}
