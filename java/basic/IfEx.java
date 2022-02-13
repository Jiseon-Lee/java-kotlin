class IfEx {
	public static void main(String[] args) 	{
		int num = 120;
		if (num < 0) {	// num의 값이 0보다 작으면
			System.out.println("0 미만");
		} else {		// 아니면 - num의 값이 0보다 크거나 같으면
			System.out.println("0 이상");

			// 내부의 if문은 기본적으로 외부 if문의 조건을 만족하는 상태에서 동작함
			if (num < 100) {
				System.out.println("0 이상 100미만");
			} else {
				System.out.println("100 이상");
			}
		}

		// num변수의 값이 양수이면서 짝수인지를 검사하여 출력하는 if문 작성
		// 출력값 : 120은 양수이면서 짝수
		if (num > 0 && num % 2 == 0) {
			System.out.println(num + "은 양수이면서 짝수");
		} else {
			System.out.println(num + "은 음수 또는 0 이거나 홀수");
		}

		char c1 = 'b';
		if (c1 == 'a') {
			System.out.println(c1 + "은 a입니다.");
		} else if (c1 == 'b') {
			System.out.println(c1 + "은 b입니다.");
		} else if (c1 == 'c') {
			System.out.println(c1 + "은 c입니다.");
		} else {
			System.out.println("모릅니다.");
		}

		// score의 점수가 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60 이상이면 'D', 60미만이면 'F'
		int score = 77;
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		// 이상이나 초과의 경우 높은 숫자부터 조건을 주고, 이하나 미만일 경우 낮은 숫자부터 조건을 입력해야 함
	}
}

/*
0 이상
100 이상
120은 양수이면서 짝수
b은 b입니다.
C
*/

