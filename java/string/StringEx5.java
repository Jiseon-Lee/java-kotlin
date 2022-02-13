class StringEx5 {
	public static void main(String[] args) {
		// 1 ~ 1000 사이의 정수 중 8이 들어있는 숫자의 개수를 출력
		int count = 0;		// 8이 있는 숫자의 개수
		for (int i = 1; i <= 1000; i++) {
			// String tmp = i + "";		// i를 문자열 인스턴스로 생성
			if (String.valueOf(i).indexOf('8') != -1) {	// i를 문자열로 변경 -> indexOf('8')이 -1이 아니면 8이 존재 (0 이상이면 8이 존재)
				count++;
			}
		}
		System.out.println("8이 들어있는 숫자의 개수 : " + count);

		// 1 ~ 1000 사이의 정수 중 8의 총 개수는?
		count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 8)		count++;	// 1의 자리가 8일 때		// i가 언제인지 모르면 10의 i의 자릿수 -1제곱까지 나눠주면..
			if (i / 10 % 10 == 8)	count++;	// 10의 자리가 8일 때
			if (i / 100 % 10 == 8)	count++;	// 100의 자리가 8일 때
		}
		System.out.println("8의 총 개수 : " + count);

		count = 0;
		for (int i = 1; i <= 1000; i++) {
			String tmp = i + "";		// 정수 i를 문자열 인스턴스로 생성
			for (int j = 0; j < tmp.length(); j++) {		// 문자열 인덱스의 0번부터 마지막까지 루프를 돔
				if (tmp.charAt(j) == '8')		count++;
			}
		}
		System.out.println("8의 총 개수 : " + count);
	}
}
