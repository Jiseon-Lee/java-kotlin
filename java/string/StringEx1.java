class StringEx1 {
	public static void main(String[] args) {
		String str1 = "test";	// "test" �ν��Ͻ� ����
		String str2 = "test";	// "test"�� �̹� �����Ƿ� ������ �ν��Ͻ��� ����
		String str3 = new String(str2);		// new ������� ������ �ν��Ͻ��� �����ϰ� ���Ӱ� ����
		String str4 = new String("test");	// new ������� ������ �ν��Ͻ��� �����ϰ� ���Ӱ� ����

		if (str1 == str2)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");		// ���� �ν��Ͻ� ����

		if (str2 == str3)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");		// �ٸ� �ν��Ͻ� ����

		if (str1 == str3)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");		// �ٸ� �ν��Ͻ� ����

		if (str3 == str4)	System.out.println("���� �ν��Ͻ� ����");
		else				System.out.println("�ٸ� �ν��Ͻ� ����");		// �ٸ� �ν��Ͻ� ����
		// �ν��Ͻ��� '=='�� ���� ��� �ȿ� ����ִ� �����Ͱ� �ƴ� �����ϴ� �ּҷ� ���ϹǷ� ��Ȯ�� �񱳰� �����

		System.out.println();

		// �׷��Ƿ� ���ڿ� �ν��Ͻ��� �񱳴� compareTo()�� equals() �޼ҵ�� �ؾ���
		if (str1.compareTo(str2) == 0)	System.out.println("������ ���ڿ�");
		else							System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str2.compareTo(str3) == 0)	System.out.println("������ ���ڿ�");
		else							System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str1.compareTo(str3) == 0)	System.out.println("������ ���ڿ�");
		else							System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str3.compareTo(str4) == 0)	System.out.println("������ ���ڿ�");
		else							System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�

		System.out.println();

		if (str1.equals(str2))	System.out.println("������ ���ڿ�");
		else					System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str2.equals(str3))	System.out.println("������ ���ڿ�");
		else					System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str1.equals(str3))	System.out.println("������ ���ڿ�");
		else					System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
		if (str3.equals(str4))	System.out.println("������ ���ڿ�");
		else					System.out.println("�ٸ� ���ڿ�");		// ������ ���ڿ�
	}
}
