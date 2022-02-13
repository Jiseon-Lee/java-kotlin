class ForEx {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("I like Java" + i);
		}
		//System.out.println("i : " + i); // error : for문에서 선언한 변수이므로 밖에서 쓸 수 없음.

		int n = 1;
		System.out.print("n :");		//System.out.print() -> 출력 후 enter를 출력하지 않음
		for (; n <= 5; n += 2) {
		// 외부 변수 사용시 for문의 변수 선언을 생략할 수 있음
			System.out.print(" " + n);
		}
		System.out.println("\nn : " + n);	// "\n" -> enter

		int m;
		System.out.print("m :");
		for (m = 1; m <= 5; m += 2) {
		// 외부 변수 사용시 초기화만 for문 안에서 진행해도 무방
			System.out.print(" " + m);
		}
		System.out.println("\nn : " + n);

		for (int i = 0, j = 10; i < 5; i++, j--) {
		// 쉼표로 구분하여 여러 개의 변수를 사용할 수도 있음
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}

/*
I like Java0
I like Java1
I like Java2
n : 1 3 5
n : 7
m : 1 3 5
n : 7
i : 0, j : 10
i : 1, j : 9
i : 2, j : 8
i : 3, j : 7
i : 4, j : 6
*/