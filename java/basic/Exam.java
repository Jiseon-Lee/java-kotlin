class Exam {
	public static void main(String[] args) 	{
		int score = 88;
		// score의 점수가 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60 이상이면 'D', 60미만이면 'F'
		// switch문을 이용하여 작업
		switch (score / 10) {
			case 9:	case 10:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}

		int num = 8;
		// num에 들어있는 숫자값을 이용하여 세 가지 종류의 작업을 실행하는 switch문 작성
		switch (num % 3) {
			case 1:
				System.out.println("첫번째 작업");
				break;
			case 2:
				System.out.println("두번째 작업");
				break;
			case 0:
				System.out.println("세번째 작업");
		}
		
		// SwitchEx.java 파일에 있는 모든 switch문을 if문으로 변경

		num = 2;
		if (num == 1) {
			System.out.println("num변수의 값은 1");
		} else if (num == 2) {
			System.out.println("num변수의 값은 2");
		} else if (num == 3) {
			System.out.println("num변수의 값은 3");
		} else {
			System.out.println("num변수의 값은 몰라");
		}
		
		// num의 값이 1, 2, 3이면 "상" 4, 5, 6이면 "중" 7, 8, 9이면 "하"라고 출력

		if (num == 1 || num == 2 || num == 3) {			//(num >= 1 && num <= 3)
			System.out.println("상");
		} else if (num == 4 || num == 5 || num == 6) {	//(num >= 4 && num <= 6)
			System.out.println("중");
		} else if (num == 7 || num == 8 || num == 9) {	//(num >= 7 && num <= 9)
			System.out.println("하");
		} 
		
		// jdk1.7부터 문자열도 사용가능
		// String str = new String("bb")로 놓고 새로운 string을 정의할 경우 string은 비교할 수 없음
		// str.equal사용..
		/*
		if ("bb" == "ab") {
			System.out.println("값은 ab");
		} else if ("bb" == "bb") {
			System.out.println("값은 bb");
		} else if ("bb" == "cb") {
			System.out.println("값은 cb");
		}*/
	}
}
