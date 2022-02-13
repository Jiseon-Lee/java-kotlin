class OperatorEx {
	public static void main(String[] args) 	{
		int n1 = 7, n2 = 3, n3;
		System.out.println("7 / 3 = " + n1 / n2);	// 7 / 3 = 2
		System.out.println("7 % 3 = " + n1 % n2);	// 7 % 3 = 1

		double d1 = 3.0;
		System.out.println("7 / 3.0 = " + n1 / d1);	// 7 / 3.0 = 2.3333333333333335
		System.out.println("7 % 3.0 = " + n1 % d1);	// 7 % 3.0 = 1.0
		// ������꿡�� �ǿ����� �� �ϳ��� �Ǽ��� ��� ������� �Ǽ��� ����
		// �Ǽ��� ������ ������ ��Ȯ�� ������� ���� �� �����Ƿ� BigDecimalŬ������ ����ؾ� ��

		n1 = 5;		n2 = ++n1;	/* n1++; n2 = n1 */	n3 = --n1;				// n1 = 5, n2 = 6, n3 = 5
		// prefix������� ���������� ���(���� ������ �� ���-����)
		System.out.println("n : " + n1  + ", n2 : " + n2 + " , n3 : " + n3);
		// n : 5, n2 : 6 , n3 : 5

		n1 =5;		n2 = n1++;		n3 = n1--;				// n1 = 5, n2 = 5, n3 = 6
		// postfix������� ���������� ���(���� ������ �� ���-����)
		System.out.println("n : " + n1  + ", n2 : " + n2 + " , n3 : " + n3);
		// n : 5, n2 : 5 , n3 : 6
		// ���������ڸ� prefix�� postfix ������� ������ ����ϴ� ���� �򰥸��� ������ ��� �κ��� ���� �۾���

		n1 = 0;		n2 = 0;
		boolean result;
					// false	&&		
		result = (n1 += 10) < 0 && (n2 += 10) > 0;
		// && �����̹Ƿ� ���� ������ false�̸� ���� ���ǿ� ������� ����� false�̹Ƿ� ���� ������ �������
		System.out.println("result : " + result);	// false
		System.out.println("n1 : " + n1  + ", n2 : " + n2);	// n1 : 10, n2 : 0
					// true		||
		result = (n1 += 10) > 0 || (n2 += 10) > 0;
		// && �����̹Ƿ� ���� ������ true�̸� ���� ���ǿ� ������� ����� true�̹Ƿ� ���� ������ �������
		System.out.println("result : " + result);	// true
		System.out.println("n1 : " + n1  + ", n2 : " + n2);	// n1 : 20, n2 : 0

		//���� ���ο����� ���� �����ϴ� ������ ������� �ʴ� ���� ����.
		n1 = 0;		n2 = 0;
		n1 += 10;	n2 += 10;
		result = n1 < 0 && n2 > 0;
		System.out.println("result : " + result);	// false
		System.out.println("n1 : " + n1  + ", n2 : " + n2);	// n1 : 10, n2 : 10

		n1 += 10;		n2 += 10;
		result = n1 > 0 && n2 > 0;
		System.out.println("result : " + result);	// true
		System.out.println("n1 : " + n1  + ", n2 : " + n2);	// n1 : 20, n2 : 20

	}
}