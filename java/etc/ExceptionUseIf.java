import java.util.*;

class ExceptionUseIf {
// ����ó���� if���� �̿��Ͽ� ó���ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i =0; i < 3; i++) {
			System.out.print("������ ���� �� :");		int n1 = sc.nextInt();

			System.out.print("������ �� :");			int n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("������ ���� 0�� �� ���� �����ϴ�.");
				i--;
				continue;
			}

			System.out.print("����� ������ �ε��� : ");	int idx = sc.nextInt();
			if (idx < 0 || idx >= 100) {
				System.out.println("��ȿ���� ���� �ε��� ��ȣ�Դϴ�.");
				i--;
				continue;
			}

			arr[idx] = n1 / n2;
			System.out.println("������ ��� : " + arr[idx]);
			System.out.println("����� ��ġ : " + idx);
		}
		dividing();
	}

	public static void dividing() {		// ó������ ���ư��� �ʰ� ������ �κп��� �ٽ� �Է¹��� ���
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < 3; i++) {
			System.out.print("������ ���� �� :");		int n1 = sc.nextInt();

			System.out.print("������ �� :");			int n2 = sc.nextInt();
			while (n2 == 0) {
				System.out.println("������ ���� 0�� �� ���� �����ϴ�.");
				System.out.print("������ �� :");	n2 = sc.nextInt();
			}
			
			System.out.print("����� ������ �ε��� : ");	int idx = sc.nextInt();

			arr[idx] = n1 / n2;
			System.out.println("������ ��� : " + arr[idx]);
			System.out.println("����� ��ġ : " + idx);
		}
	}
}