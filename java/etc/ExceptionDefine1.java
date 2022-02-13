import java.util.*;

class AgeInputException extends Exception {
// Exception Ŭ������ ��ӹ޾����Ƿ� AgeInputException Ŭ������ ���� Ŭ������ ��
	public AgeInputException() {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");	// �Ű������� ������ JVM�� �˾Ƽ� �������ֱ� ������ �����ص� �������
		// getMessage() �޼ҵ�� ������ ���� �޽����� �Ű������� �Ͽ� ����Ŭ����(Exception) �����ڸ� ȣ��
	}
}

class ExceptionDefine1 {
	public static void main(String[] args) {
		System.out.println("���� �Է� : ");
		try {
			int age = readAge();
			System.out.println("����� " + age + "�� �Դϴ�.");
		}
		catch (AgeInputException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int readAge() throws AgeInputException {
	// throws AgeInputException : �� �żҵ忡�� AgeInputException ���ܰ� �߻��ص� ó������ �ʰڴٴ� �ǹ̷μ�
	// ����ó���� �� �޼ҵ带 ȣ���� ������ �ѱ�� ��� - ����ó���� try-catch������ �ؾ� ��
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0) {
			AgeInputException ex = new AgeInputException();
			// AgeInputException�� �ν��Ͻ� ex�� ����(���� ������ ������ ���� �߻��� �ƴ�)
			throw ex;
			// ex�� ����ִ� AgeInputException ���ܰ� �߻��ߴٰ� JVM���� �˸��� ����
			// throw�� ����Ǹ� JVM�� ����ó�� ��Ŀ������ �����ϰ� ��
		}
		return age;
	}
}
