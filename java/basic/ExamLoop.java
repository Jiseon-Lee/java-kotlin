class ExamLoop {
	public static void main(String[] args) {
		/* 구구단 출력(2~5단)
		2 X 1 = 2	3 X 1 = 3	...		5 X 1 = 5
		2 X 2 = 4	3 X 2 = 6	...		5 X 2 = 10
		...			...			...		...
		2 X 9 = 18	3 X 9 = 27	...		5 X 9 = 45
		*/

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + "   ");
				if (i * j < 10) {	// 정렬하기 위해
					System.out.print(" ");
				}
			}
			System.out.println();
		}



		System.out.println();




		for (int i = 1; i < 10; i++) {		//삼항연산자 사용
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + (i * j < 10 ? "    " : "   "));
			}
			System.out.println();
		}

		System.out.println();

		// 100 이하의 자연수들 중 2와 7의 공배수의 총 합을 출력		14 + 28 + 42 + .. = ?

		int sum = 0;			// 공배수의 합을 저장하는 변수
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {		// 2의 배수이고 7의 배수일 때 -> 14의 배수일때
				sum += i;  // sum = sum + i;		// 0 -> 14 -> 14+28 -> 42 + 42 -> 
			}
		}
		System.out.println("2와 7의 공배수의 합 : " + sum);





		// 구구단 중 2, 4, 6단만 출력하면서 2단은 2X2, 4단은 4X4, 6단은 6X6 까지만 출력(세로로 출력)

		for (int i = 2; i < 7; i += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}

		for (int i = 2; i < 7; i += 2) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
				if (i == j) {
					break;
				}
			}
		}
	}
}
