class MethodReturn2 {
	public static void main(String[] args) {
		divide(4, 2);
		divide(0, 2);
		divide(4, 0);
	}

	public static void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;	//void메소드에서 사용할 경우 메소드를 강제로 종료시킴
		}
		System.out.println("나눗셈 결과 : " + n1 / n2);
	}
}
