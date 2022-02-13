import java.util.*;

class RandomPassword {
	public static void main(String[] args) {
		// 총 10자의 문자열(영문 + 숫자) 생성 - 첫글자는 무조건 영문
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		Random rnd = new Random();
		String pwd = String.valueOf(arr[rnd.nextInt(26)]);		// String pwd = arr[rnd.nextInt(26)] + "";
		for (int i = 1; i < 10; i++) {
			pwd += arr[rnd.nextInt(36)];
		}
		System.out.println(pwd);

		/*
		영문자인지 아닌지 확인하는 방법
		char c = '?';
		if (c >= 'a' && c <= 'z') {  }
		*/
	}
}
