class FinallyTest {
	public static void main(String[] args) {
		boolean isDiv  = divider(4, 2);
		if (isDiv)		System.out.println("연산 성공");
		else			System.out.println("연산 실패");

		isDiv  = divider(4, 0);
		if (isDiv)		System.out.println("연산 성공");
		else			System.out.println("연산 실패");
	}
	// divider() 메소드 작업(두 개의 정수를 받아 나눗셈을 하고 그 결과를 출력 후 true를 리턴)
	// 예외 발생시 false를 리턴
	public static boolean divider(int n1, int n2) {
		try {
			System.out.println("나눗셈 결과 : " + n1 / n2);
			return true;
		} catch (ArithmeticException e) {
			e.printStackTrace();	// 발생한 곳, 발생한 이후 이동한 곳 출력
			return false;
		} finally {					// 반드시 실행
			System.out.println("finally 영역 실행");
		}
	}
}
