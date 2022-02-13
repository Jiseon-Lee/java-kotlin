/*
1. �ܼ� â���� �޴��� �����ְ�, �޴� ��ȣ�� �Է� �޾� ó���� ��
- �޴� : 1. �����Է� 2. �����˻� 3. ��ü���� 4. ����
2. �����Է� �� ���� : �й�, �̸�, ��������, ��������, �������� - ���������� ����
-���� ������ ���� ����� Ŭ������ ����� �ν��Ͻ��� �迭�� ����
3. �����˻� : �й��� �Է� �޾� �ش� ���� �˻� �� ���� ���
- ��� ���� ��) �й� : [1112023] / �̸� : [ȫ�浿] / �� ���� ���� / ��� : [�������]
- ��������� �Ǽ��� ǥ��
- ��ü���� : ��ü �л��� ������ '�����˻�'�� ��� ����ó�� ��� �����ֱ�
-���� : ���α׷� ����

--------
�й��� ���� ���?
������ ������?	������ �ƴ� ����� ����ó��
�޴����� ���ڰ� �ƴ� �ٸ� ���ڸ� �Է¹޾��� �� ����ó��
*/

import java.util.*;		// scanner���
class Student {
	private String pNum, name;
	private int kor, his, math;

	public Student(String pNum, String name, int kor, int his, int math) {		// ������
		this.pNum = pNum;		this.name = name;		this.kor = kor;		this.his = his;		this.math = math;
	}
	public String getPNum() { return pNum; }	// �й� �޾ƿ��� ���� �޼ҵ�

	public double average() { return (kor + his + math) / 3.0; }		// ���� ��� ���ϴ� �޼ҵ�

	public void showInfo() {						// �л� ���� ��� �޼ҵ�
		System.out.println("�й� : " + pNum);				System.out.println("�̸� : " + name);
		System.out.println("�������� : " + kor);			System.out.println("�������� : " + his);
		System.out.println("�������� : " + math);			System.out.println("��� : " + average());
		System.out.println();
	}
}

class StudentHandler {
	private Student[] students;				// Student �ν��Ͻ��� ������ �迭
	private int numOfStudents;				// �л��� �� �Ǵ� ���� ����Ǿ�� �� �迭�� �ε���

	public StudentHandler(int num) {		// ������
		students = new Student[num];
		numOfStudents = 0;
	}

	public void addStudentInfo() {			// ���ο� �л� �߰� �޼ҵ�
		String pNum, name;
		int kor, his, math;

		Scanner sc = new Scanner(System.in);
		System.out.print("�й� : ");		pNum = sc.nextLine();
		for (int i = 0; i < numOfStudents; i++) {
			if (pNum.equals(students[i].getPNum())) {		// �̹� ��ϵ� �й��� ��� �޴��� �̵�
				System.out.println("�̹� �ִ� �й��Դϴ�.");
				return;
			}
		}
		System.out.print("�̸� : ");		name = sc.nextLine();
		System.out.print("�������� : ");	kor = sc.nextInt();
		System.out.print("�������� : ");	his = sc.nextInt();
		System.out.print("�������� : ");	math = sc.nextInt();

		students[numOfStudents] = new Student(pNum, name, kor, his, math);		// �Է¹��� �л������� ���ο� Student �ν��Ͻ� ���� �� students�迭�� ����
		numOfStudents++;

		System.out.println("�Է¿Ϸ� \n");
	}

	public void searchStudent() {				// �й� �˻� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �й� : ");	
		String keyword = sc.nextLine();
		for (int i = 0; i < numOfStudents; i++) {
			if (keyword.equals(students[i].getPNum())) {		// ���� �й��� ���� ���
				students[i].showInfo();
				return;
			}
		}
		System.out.println("�˻������ �����ϴ�.\n");
	}

	public void showAllInfo() {				// �л��� ���� ��� �޼ҵ�
		for (int i = 0; i < numOfStudents; i++) {
			students[i].showInfo();
		}
	}
}

class StudentInfo {
	public static void main(String[] args) {
		StudentHandler handler = new StudentHandler(10);
		
		while (true) {
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �����Է�");
			System.out.println("2. �����˻�");
			System.out.println("3. ��ü����");
			System.out.println("4. ����");
			System.out.print("�޴� ���� >> ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					handler.addStudentInfo();	break;
				case 2:
					handler.searchStudent();	break;
				case 3:
					handler.showAllInfo();		break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}
	}
}
