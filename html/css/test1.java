class test1 {
	public static void main(String[] args) {
		// ¦���� ���ϱ� 2 + 4 + 6 + ... + 100
		int sum = 0;
		for (i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)	{
				sum += i;
			}
		}
		System.out.println(sum);

		sum = 0;
		for (i = 1; i <= 50; i++) {
			sum += i * 2;
		}
		System.out.println(sum);
	}
}
