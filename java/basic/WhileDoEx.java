class WhileDoEx {
	public static void main(String[] args) {
		int num = 0;
		while (num < 3) {
			System.out.println("I like Java " + num);
			num++;
		}

		// ���� 1���� 100������ ���� while���� �̿��Ͽ� ���� �� ���

		int sum = 0;	// ���� ����� �ݵ�� �ʱ�ȭ�� ����� ��
		num = 1;
		while (num <= 100) {
			sum += num;			// sum = sum + num;
			num++;
		}
		System.out.println("1���� 100������ �� : " + sum);	//5050
		System.out.println("num : " + num);		//101

		

		num = 1;
		//num�� ���� 1, 3, 5, 7, 9�� ��µǰ� �۾�
		while (num < 10) {
			System.out.println("I like Java " + num);
			num += 2;
		}
		System.out.println("num : " + num);		//11


		do {
			System.out.println("I like Java " + num);
			num += 2;
		} while (num < 10);
		System.out.println("num : " + num);		//13
		// num�� ���� do-while�� ���۽� 11�̾����� do-while���� Ư���� �� ���� �׳� �����Ŵ
	}
}


/*
I like Java 0
I like Java 1
I like Java 2
1���� 100������ �� : 5050
num : 101
I like Java 1
I like Java 3
I like Java 5
I like Java 7
I like Java 9
num : 11
I like Java 11
num : 13
*/