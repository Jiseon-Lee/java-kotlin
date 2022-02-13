class WhileDoEx {
	public static void main(String[] args) {
		int num = 0;
		while (num < 3) {
			System.out.println("I like Java " + num);
			num++;
		}

		// 정수 1부터 100까지의 합을 while문을 이용하여 구한 뒤 출력

		int sum = 0;	// 누적 연산시 반드시 초기화를 해줘야 함
		num = 1;
		while (num <= 100) {
			sum += num;			// sum = sum + num;
			num++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);	//5050
		System.out.println("num : " + num);		//101

		

		num = 1;
		//num의 값이 1, 3, 5, 7, 9로 출력되게 작업
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
		// num의 값이 do-while문 시작시 11이었으나 do-while문의 특성상 한 번은 그냥 실행시킴
	}
}


/*
I like Java 0
I like Java 1
I like Java 2
1부터 100까지의 합 : 5050
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