class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";		String str2 = "testabc.com";
		String str3 = "test@abccom";		String str4 = "test.abc@com";

		isEmail(str1);		isEmail(str2);		isEmail(str3);		isEmail(str4);
	}

	public static void isEmail(String email) {
	/* �޾ƿ� email�� �˻��Ͽ� �̸��� �ּҰ� �´��� ���
	1. �ݵ�� '@'�� �־�� ��					indexOf()
	2. �ݵ�� '.'�� �־�� ��
	3. �ݵ�� '@'�� '.'���� �տ� �־�� ��
	*/
		int at = email.indexOf('@');				// 2�� �̻� ����� ��� ������ �����ϴ� ���� ����
		int dot = email.lastIndexOf('.');			// ���̵� .�� �ִ� ��찡 ���� �� �־� lastIndexOf()���
		if (at == -1) {								// '@'�� ���� ���
			System.out.println(email + "��(��) �̸����� �ƴմϴ�.");
		} else if (dot == -1) {						// '.'�� ���� ���
			System.out.println(email + "��(��) �̸����� �ƴմϴ�.");
		} else if (at > dot) {						// '.'�� '@'���� �տ� �ִ� ���
			System.out.println(email + "��(��) �̸����� �ƴմϴ�.");
		} else {									// ���� else�� �� �ʿ�� ����
			System.out.println(email + "��(��) �̸����Դϴ�.");
		}
	}
}
