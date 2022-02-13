import java.util.*;

class ExceptionUseTry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i =0; i < 3; i++) {
			try {
				System.out.print("나누어 지는 수 :");		int n1 = sc.nextInt();

				System.out.print("나누는 수 :");			int n2 = sc.nextInt();
				
				System.out.print("결과를 저장할 인덱스 : ");	int idx = sc.nextInt();
				
				arr[idx] = n1 / n2;
				System.out.println("나눗셈 결과 : " + arr[idx]);
				System.out.println("저장된 위치 : " + idx);
			} catch (ArithmeticException e) {
			// try문 안에서 ArithmeticException이 발생했을 경우 처리하는 영역
				System.out.println("나누는 수가 0이 될 수는 없습니다.");
				i--;
			} catch (ArrayIndexOutOfBoundsException e) {
			// try문 안에서 ArrayIndexOutOfBoundsException이 발생했을 경우 처리하는 영역
				System.out.println("유효하지 않은 인덱스 번호입니다.");
				i--;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해 주세요.");
				i--;
			} catch (Exception e) {
			// try문 안에서 Exception이 발생했을 경우 처리하는 영역 -> 모든 예외를 다 처리	// 혹시나 하는 마음에 써놓는 예외
			// 상위클래스 exception일수록 밑에 -> 아니면 이미 잡았다고 오류가 남
				System.out.println("예기치 않은 예외가 발생했습니다.");
				i--;
			} 
		}
	}
}
