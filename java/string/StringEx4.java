class StringEx4 {
	public static void main(String[] args) {
		String str1 = "880525-1234567";		String str2 = "890515-2234567";
		String str3 = "0805253234567";		String str4 = "0905154234567";

		showBirth(str1);	showBirth(str2);	showBirth(str3);	showBirth(str4);
		showGender(str1);	showGender(str2);	showGender(str3);	showGender(str4);
	}

	public static void showBirth(String str) {
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ��������� ����ϴ� �޼ҵ�
	// �ֹε�Ϲ�ȣ �� 6�ڸ��� �̿��Ͽ� "yyyy�� mm�� dd�� ��"���� ���
		int i = 7;			// ���������� �ε����� ������ ����
		if (str.indexOf('-') == -1)		i = 6;	// �ֹι�ȣ�� �������� ������ ���������� �ε����� 6
		if (str.length() == 13)			i = 6;	// �ֹι�ȣ�� ���ڼ��� 13�̸� ���������� �ε����� 6
		char g = str.charAt(i);					// ���������� ����

		int tmp = 19;
		if (g == '3' ||  g == '4')		tmp = 20;	// ���������ڰ� '3'�̰ų� '4'�̸� 2000��� ��
		if (g > '2')		tmp = 20;		// ���������ڰ� '2'���� ũ�� 2000��� ��
		
		String year = tmp + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "�� " + month + "�� " + day + "�� ��");
	}

	public static void showBirth1(String str) {		// ���� �ۼ��� �ڵ�
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ��������� ����ϴ� �޼ҵ�
	// �ֹε�Ϲ�ȣ �� 6�ڸ��� �̿��Ͽ� "yyyy�� mm�� dd�� ��"���� ���
		String year;
		StringBuilder sb = new StringBuilder(str);
		char g = sb.reverse().charAt(6);		// �ڿ��� 7��° �ڸ���
		if (g == '1' ||  g == '2') {			// 1 �Ǵ� 2�� ��� 1900���
			year = 19 + str.substring(0, 2);
		} else {
			year = 20 + str.substring(0, 2);
		}
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "�� " + month + "�� " + day + "�� ��");
	}

	public static void showGender(String str) {
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ ����ϴ� �޼ҵ�
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� "����" �Ǵ� "����"�� ���
		int i = 7;			// ���������� �ε����� ������ ����
		if (str.indexOf('-') == -1)		i = 6;	// �ֹι�ȣ�� �������� ������ ���������� �ε����� 6
		if (str.length() == 13)			i = 6;	// �ֹι�ȣ�� ���ڼ��� 13�̸� ���������� �ε����� 6
		char g = str.charAt(i);					// ���������� ����

		// if (g == '1' || g == '3')	System.out.println("����");
		if (g % 2 == 1)				System.out.println("����");
		else						System.out.println("����");
	}

	public static void showGender1(String str) {		// ���� �ۼ��� �ڵ�
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� ������ ����ϴ� �޼ҵ�
	// �ֹε�Ϲ�ȣ�� �̿��Ͽ� "����" �Ǵ� "����"�� ���
		StringBuilder sb = new StringBuilder(str);
		char g = sb.reverse().charAt(6);		// �ڿ��� 7��° �ڸ���
		if (g == '1' || g == '3') {				// 1 �Ǵ� 3�� ��� ����
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
