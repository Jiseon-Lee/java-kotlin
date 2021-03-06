class BreakLabel {
	public static void main(String[] args) {
		// i와 j의 값이 둘 다 짝수일 경우 출력을 멈춤
		for (int i = 1; i < 4; i++) {							// i = 3
			for (int j = 1; j < 4; j++) {						// j = 1
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) {
					break;
					// 중첩 루프문에서 break를 사용하면 현재 속한 루프문만 빠져나감
				}
			}
		}

		System.out.println("\n-------------------------------------------------------");

		outerLoop:	// 특정 루프문을 표시해주는 레이블(label)
		for (int i = 1; i < 4; i++) {							// i = 2
			for (int j = 1; j < 4; j++) {						// j = 2
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) {
					break outerLoop;	//outerLoop라는 표식을 가진 루프문을 빠져나감
				}
			}
		}
	}
}
