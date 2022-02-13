/*
1. 콘솔 창에서 메뉴를 보여주고, 메뉴 번호를 입력 받아 처리할 것
- 메뉴 : 1. 정보입력 2. 정보검색 3. 전체정보 4. 종료
2. 정보입력 및 저장 : 학번, 이름, 국어점수, 국사점수, 수학점수 - 시험정수는 정수
-받은 정보는 정보 저장용 클래스를 만들어 인스턴스로 배열에 저장
3. 정보검색 : 학번을 입력 받아 해당 정보 검색 후 정보 출력
- 출력 정보 예) 학번 : [1112023] / 이름 : [홍길동] / 각 과목별 점수 / 평균 : [평균점수]
- 평균점수는 실수로 표현
- 전체정보 : 전체 학생의 정보를 '정보검색'의 출력 정보처럼 모두 보여주기
-종료 : 프로그램 종료

--------
학번이 같은 경우?
점수의 범위는?	정수가 아닌 경우의 오류처리
메뉴에서 숫자가 아닌 다른 문자를 입력받았을 때 오류처리
*/

import java.util.*;		// scanner사용
class Student {
	private String pNum, name;
	private int kor, his, math;

	public Student(String pNum, String name, int kor, int his, int math) {		// 생성자
		this.pNum = pNum;		this.name = name;		this.kor = kor;		this.his = his;		this.math = math;
	}
	public String getPNum() { return pNum; }	// 학번 받아오기 위한 메소드

	public double average() { return (kor + his + math) / 3.0; }		// 과목 평균 구하는 메소드

	public void showInfo() {						// 학생 정보 출력 메소드
		System.out.println("학번 : " + pNum);				System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);			System.out.println("국사점수 : " + his);
		System.out.println("수학점수 : " + math);			System.out.println("평균 : " + average());
		System.out.println();
	}
}

class StudentHandler {
	private Student[] students;				// Student 인스턴스를 저장할 배열
	private int numOfStudents;				// 학생의 수 또는 다음 저장되어야 할 배열의 인덱스

	public StudentHandler(int num) {		// 생성자
		students = new Student[num];
		numOfStudents = 0;
	}

	public void addStudentInfo() {			// 새로운 학생 추가 메소드
		String pNum, name;
		int kor, his, math;

		Scanner sc = new Scanner(System.in);
		System.out.print("학번 : ");		pNum = sc.nextLine();
		for (int i = 0; i < numOfStudents; i++) {
			if (pNum.equals(students[i].getPNum())) {		// 이미 등록된 학번인 경우 메뉴로 이동
				System.out.println("이미 있는 학번입니다.");
				return;
			}
		}
		System.out.print("이름 : ");		name = sc.nextLine();
		System.out.print("국어점수 : ");	kor = sc.nextInt();
		System.out.print("국사점수 : ");	his = sc.nextInt();
		System.out.print("수학점수 : ");	math = sc.nextInt();

		students[numOfStudents] = new Student(pNum, name, kor, his, math);		// 입력받은 학생정보로 새로운 Student 인스턴스 생성 후 students배열에 저장
		numOfStudents++;

		System.out.println("입력완료 \n");
	}

	public void searchStudent() {				// 학번 검색 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학번 : ");	
		String keyword = sc.nextLine();
		for (int i = 0; i < numOfStudents; i++) {
			if (keyword.equals(students[i].getPNum())) {		// 같은 학번이 있을 경우
				students[i].showInfo();
				return;
			}
		}
		System.out.println("검색결과가 없습니다.\n");
	}

	public void showAllInfo() {				// 학생들 정보 출력 메소드
		for (int i = 0; i < numOfStudents; i++) {
			students[i].showInfo();
		}
	}
}

class StudentInfo {
	public static void main(String[] args) {
		StudentHandler handler = new StudentHandler(10);
		
		while (true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정보입력");
			System.out.println("2. 정보검색");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택 >> ");
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
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
}
