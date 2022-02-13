class StringEx5 {
	public static void main(String[] args) {
		// 1 ~ 1000 ������ ���� �� 8�� ����ִ� ������ ������ ���
		int count = 0;		// 8�� �ִ� ������ ����
		for (int i = 1; i <= 1000; i++) {
			// String tmp = i + "";		// i�� ���ڿ� �ν��Ͻ��� ����
			if (String.valueOf(i).indexOf('8') != -1) {	// i�� ���ڿ��� ���� -> indexOf('8')�� -1�� �ƴϸ� 8�� ���� (0 �̻��̸� 8�� ����)
				count++;
			}
		}
		System.out.println("8�� ����ִ� ������ ���� : " + count);

		// 1 ~ 1000 ������ ���� �� 8�� �� ������?
		count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 8)		count++;	// 1�� �ڸ��� 8�� ��		// i�� �������� �𸣸� 10�� i�� �ڸ��� -1�������� �����ָ�..
			if (i / 10 % 10 == 8)	count++;	// 10�� �ڸ��� 8�� ��
			if (i / 100 % 10 == 8)	count++;	// 100�� �ڸ��� 8�� ��
		}
		System.out.println("8�� �� ���� : " + count);

		count = 0;
		for (int i = 1; i <= 1000; i++) {
			String tmp = i + "";		// ���� i�� ���ڿ� �ν��Ͻ��� ����
			for (int j = 0; j < tmp.length(); j++) {		// ���ڿ� �ε����� 0������ ���������� ������ ��
				if (tmp.charAt(j) == '8')		count++;
			}
		}
		System.out.println("8�� �� ���� : " + count);
	}
}
