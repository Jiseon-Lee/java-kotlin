class MethodExam {
	public static void main(String[] args) {
		// 두 개의 정수를 전달받아 두 수의 차를 절댓값으로 출력해주는 메소드 작성
		printAbs(10, 5);	// 10과 5의 차는 5
		printAbs(10, 25);	// 10과 25의 차는 15
	}

	public static void printAbs(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + "과 " + num2 + "의 차는 " + (num1 - num2));
		} else {
			System.out.println(num1 + "과 " + num2 + "의 차는 " + (num2 - num1));
		}
	}
}
