class MethodReturn3 {
	public static void main(String[] args) 	{
		char grade = getGrade(78);
		System.out.println("������ '" + grade + "'���� �Դϴ�.");

		// 5�� 7�� �ּ� ������� ���ϴ� �޼ҵ�
		int num = getNumber1();
		System.out.println("5�� 7�� �ּ� ����� : " + num);
	}

	public static char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
		// if �� �ȿ��� return �� ��� �ݵ�� else���� �ְų� if�� �ۿ��� return �ؾ� ��
	}

	public static int getNumber1() {
		int lcm = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}
	
	public static int getNumber2() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				return i;
			}	// ������ �ȿ��� if���� ����Ͽ� ���ǿ� ���� return �� ��� ���� else���� ����ϸ� �ȵ� -> �� ���� �ݺ��ϰ� ��
		}
		return 0;
		// ������ ��ü�� ���� ���� ������ �����Ƿ� ���ǿ� ����Ǹ� �ƿ� return�� �ȵɼ��� �ֱ� ������
		// ���������� return�� ��� �ݵ�� ������ �ۿ��� return�� �� �� �� ����� ��
	}

}
