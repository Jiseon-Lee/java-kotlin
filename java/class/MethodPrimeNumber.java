class MethodPrimeNumber {
	public static void main(String[] args) 	{
		/*
		1~100 사이의 정수들 중 소수를 구하여 출력
		단, 전달된 값이 소수인지 여부를 판단해 주는 메소드를 제작하여 작업
		*/
		for (int i = 1, j = 0; i <= 100; i++) {	// i : 1부터 100까지 검사, j : 소수의 개수
			if (isPrime(i)) {
				System.out.print(i + "  ");		// System.out.print((i < 10 ? " " : "") + i + "  "); // 삼항연산자 사용
				if (i < 10) {
					System.out.print(" ");	// 행 맞춤
				}
				j ++;
				if (j % 10 == 0) {	// 10개마다 줄 바꿈
					System.out.println();
				}
			}
			
		}
	}

	public static boolean isPrime(int n) {		// 2의 배수를 먼저 제외
		// 받아온 정수(n)가 소수인지 여부를 리턴하는 메소드
		if (n == 1 || (n != 2 && n % 2 == 0)) {
		// n의 값이 1이 아니거나 2가 아니면서 짝수인 경우는 소수가 아님
			return false;
		}
		for (int i = 2; i < n / 2; i++) {	// n / 2보다 큰 수로 나누면 항상 소수가 나오므로 n / 2까지만 나눠도 됨 -> 더 효율적
			if (n % i == 0) {	// 나눠지는 수가 있으면 소수가 아님
				return false;
			}
		}
		return true;	// 나눠지는 수가 없으면 소수
	}

	public static boolean isPrimeMy(int n) {	// 내가 쓴 isPrime
		// 받아온 정수(n)가 소수인지 여부를 리턴하는 메소드
		if (n == 1) {	// 1은 소수가 아니므로 제외
			return false;
		}
		for (int i = 2; i < n; i++) {	// n을 2부터 n-1까지 나눔
			if (n % i == 0) {	// 나눠지는 수가 있으면 소수가 아님
				return false;
			}
		}
		return true;	// 나눠지는 수가 없으면 소수
	}
}
