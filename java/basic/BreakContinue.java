class BreakContinue {
	public static void main(String[] args) {
		// 100������ �ڿ��� �� 5�� 7�� �ּҰ������ ���Ͽ� ��� - while�� �̿� break����
		int num = 100;		// 1���� 100���� ���ϸ鼭 �˻��� ����
		int num2 = 0;		// �ּҰ������ ������ ��ġ
		while (num > 0) {
			if (num % 5 == 0 && num % 7 == 0) {		// 35�� ���
				num2 = num;		// num2 = 35		// 35
			}
			num--;
		}
		System.out.println("5�� 7�� �ּҰ���� : " + num2);




		num = 1;									// break�� ���
		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5�� 7�� �ּҰ���� : " + num);






		// 100������ �ڿ��� �� 5�� 7�� ������� �� ������ ���Ͽ� ��� - while��, continue �̿�
		num = 0;		// 100���� ������ ���� ����
		int count = 0;	// 5�� 7�� ����� ������ ������ ����
		while (num <= 100) {
			num++;
			if (num % 5 != 0 || num % 7 != 0) {	// 5�� 7�� ������� �ƴϸ�
				continue;	// �Ʒ��� ���๮���� �����ϰ� �������� �ٷ� �ö�
			}
			count++;
			System.out.println("5�� 7�� ����� : " + num);		// 35 70
		}
		System.out.println("5�� 7�� ����� ���� : " + count);



		num = 1;
		int count = 0;
		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0) {	// 5�� 7�� ������̸�
				count++;
				System.out.println("5�� 7�� ����� : " + num);
			}
			num++;
		}
		System.out.println("5�� 7�� ����� ���� : " + count);
	}
}
