class BreakContinue {
	public static void main(String[] args) {
		// 100이하의 자연수 중 5와 7의 최소공배수를 구하여 출력 - while문 이용 break없이
		int num = 100;		// 1부터 100까지 변하면서 검사할 숫자
		int num2 = 0;		// 최소공배수를 저장할 위치
		while (num > 0) {
			if (num % 5 == 0 && num % 7 == 0) {		// 35의 배수
				num2 = num;		// num2 = 35		// 35
			}
			num--;
		}
		System.out.println("5와 7의 최소공배수 : " + num2);




		num = 1;									// break문 사용
		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);






		// 100이하의 자연수 중 5와 7의 공배수와 그 개수를 구하여 출력 - while문, continue 이용
		num = 0;		// 100까지 루프를 돌릴 변수
		int count = 0;	// 5와 7의 공배수 개수를 저장할 변수
		while (num <= 100) {
			num++;
			if (num % 5 != 0 || num % 7 != 0) {	// 5와 7의 공배수가 아니면
				continue;	// 아래쪽 실행문들은 무시하고 조건절로 바로 올라감
			}
			count++;
			System.out.println("5와 7의 공배수 : " + num);		// 35 70
		}
		System.out.println("5와 7의 공배수 개수 : " + count);



		num = 1;
		int count = 0;
		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0) {	// 5와 7의 공배수이면
				count++;
				System.out.println("5와 7의 공배수 : " + num);
			}
			num++;
		}
		System.out.println("5와 7의 공배수 개수 : " + count);
	}
}
