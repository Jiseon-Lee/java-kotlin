class ConversionEx {
	public static void main(String[] args) 	{
		int n1 = 'A', n2 = 'Z' , n3 = 'a', n4 = 'z';
		int n5 = '0', n6 = '9', n7 = '��', n8 = '�R';

		System.out.println("A : " + n1 + ", Z : " + n2 + ", a : " + n3 + ", z : " + n4);
		// A : 65, Z : 90, a : 97, z : 122

		System.out.println("0 : " + n5 + ", 9 : " + n6 + ", �� : " + n7 + ", �R : " + n8);
		// 0 : 48, 9 : 57, �� : 44032, �R : 55203

		double d1 = 123;	//������ �Ǽ��� �ڵ� ����ȯ�� �����ϹǷ� �Ǽ��� ��ȯ�� �ٷ� ���� �� ����
		int i1 = (int)3.14;	// �Ǽ��� ������ �ڵ� ����ȯ�� �Ұ����ϹǷ� ���������� ��ȯ �� �־�� ��
		System.out.println("d1 : " + d1 + ", i1 : " + i1);	// d1 : 123.0, i1 : 3
	}
}