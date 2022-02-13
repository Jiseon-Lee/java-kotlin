class StudentInfo {		// �л������� ������ Ŭ���� : �ϳ��� �ν��Ͻ��� �� ���� �л��� �ǹ�
	private int stID, korean, math, art;
	StudentInfo(int stID, int korean, int math, int art) {
		this.stID= stID;		this.korean = korean;		this.math = math;		this.art = art;
		// ��������� �Ű������� �̸��� ������ this.�� �̿��Ͽ� ��������� ������ ��
		// this. : '���� �����ǰ� �ִ� �ν��Ͻ���~'�� �ǹ��ϴ� ����
	}
	StudentInfo(int stID, int korean, int math) {		// overloading
		this(stID, korean, math, -1);
		// �Ű������� �μ��� �Ͽ� �ٸ� �����ڸ� ȣ��
		// �ٸ� �����ڸ� ȣ���ϴ� ���� ���� ������ �ȿ��� this()�� �̿��ϴ� �������
	}
	public void showInfo() {
		System.out.println("�й� : " + stID);
		System.out.println("���� : " + korean);
		System.out.println("���� : " + math);
		if (art == -1)		System.out.println("�̼� ������ ���� �ʴ� �л�");
		else				System.out.println("�̼� : " + art);
	}
}

class OverloadingEx {
	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo(1234, 95, 85, 88);
		st1.showInfo();
		System.out.println();
		StudentInfo st2 = new StudentInfo(1235, 98, 88);
		st2.showInfo();
	}
}