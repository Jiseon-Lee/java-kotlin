class Exam {
	public static void main(String[] args) 	{
		int score = 88;
		// score�� ������ 70�̻��̸� 'C', 80�̻��̸� 'B', 90�̻��̸� 'A', 60 �̻��̸� 'D', 60�̸��̸� 'F'
		// switch���� �̿��Ͽ� �۾�
		switch (score / 10) {
			case 9:	case 10:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}

		int num = 8;
		// num�� ����ִ� ���ڰ��� �̿��Ͽ� �� ���� ������ �۾��� �����ϴ� switch�� �ۼ�
		switch (num % 3) {
			case 1:
				System.out.println("ù��° �۾�");
				break;
			case 2:
				System.out.println("�ι�° �۾�");
				break;
			case 0:
				System.out.println("����° �۾�");
		}
		
		// SwitchEx.java ���Ͽ� �ִ� ��� switch���� if������ ����

		num = 2;
		if (num == 1) {
			System.out.println("num������ ���� 1");
		} else if (num == 2) {
			System.out.println("num������ ���� 2");
		} else if (num == 3) {
			System.out.println("num������ ���� 3");
		} else {
			System.out.println("num������ ���� ����");
		}
		
		// num�� ���� 1, 2, 3�̸� "��" 4, 5, 6�̸� "��" 7, 8, 9�̸� "��"��� ���

		if (num == 1 || num == 2 || num == 3) {			//(num >= 1 && num <= 3)
			System.out.println("��");
		} else if (num == 4 || num == 5 || num == 6) {	//(num >= 4 && num <= 6)
			System.out.println("��");
		} else if (num == 7 || num == 8 || num == 9) {	//(num >= 7 && num <= 9)
			System.out.println("��");
		} 
		
		// jdk1.7���� ���ڿ��� ��밡��
		// String str = new String("bb")�� ���� ���ο� string�� ������ ��� string�� ���� �� ����
		// str.equal���..
		/*
		if ("bb" == "ab") {
			System.out.println("���� ab");
		} else if ("bb" == "bb") {
			System.out.println("���� bb");
		} else if ("bb" == "cb") {
			System.out.println("���� cb");
		}*/
	}
}
