class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";		String str2 = "testabc.com";
		String str3 = "test@abccom";		String str4 = "test.abc@com";

		isEmail(str1);		isEmail(str2);		isEmail(str3);		isEmail(str4);
	}

	public static void isEmail(String email) {
	/* 받아온 email을 검사하여 이메일 주소가 맞는지 출력
	1. 반드시 '@'가 있어야 함					indexOf()
	2. 반드시 '.'이 있어야 함
	3. 반드시 '@'가 '.'보다 앞에 있어야 함
	*/
		int at = email.indexOf('@');				// 2번 이상 사용할 경우 변수를 생성하는 것이 좋음
		int dot = email.lastIndexOf('.');			// 아이디에 .이 있는 경우가 있을 수 있어 lastIndexOf()사용
		if (at == -1) {								// '@'이 없는 경우
			System.out.println(email + "은(는) 이메일이 아닙니다.");
		} else if (dot == -1) {						// '.'이 없는 경우
			System.out.println(email + "은(는) 이메일이 아닙니다.");
		} else if (at > dot) {						// '.'이 '@'보다 앞에 있는 경우
			System.out.println(email + "은(는) 이메일이 아닙니다.");
		} else {									// 굳이 else를 쓸 필요는 없음
			System.out.println(email + "은(는) 이메일입니다.");
		}
	}
}
