/*
1. 반지름을 실수로 저장할 수 있는 Circle 클래스 작성
 - 인스턴스 생성과 동시에 멤버변수들을 초기화 시킴
 - 클래스 멤버로 원주율을 저장할 상수(PI) 생성(값 : 3.1415)
2. 반지름을 변경할 수 있는 setter 메소드 작성
3. 원의 넓이를 구하여 리턴하는 getArea() 메소드 작성
4. 원의 둘레를 구하여 리턴하는 getPeri() 메소드 작성
5. Circle클래스를 이용하여 두 개의 원의 넓이와 둘레를 출력할 CircleMain 클래스 작성
 - 반지름을 3.5로 하는 원 인스턴스 생성 후 원의 넓이와 둘레 출력
 - 반지름을 12.5로 변경 후 원의 넓이와 둘레 출력
 - 출력은 "원의 넓이 : ??? / 원의 둘레 : ???" 형식으로 출력하면 됨
 */
class Circle {		// 반지름을 실수로 저장할 수 있는 Circle 클래스
	static final double PI = 3.1415;	// 클래스 멤버상수 PI 생성
	private double radius;				// 반지름

	public Circle(double r) {			// 생성자
		radius = r;						// 반지름 값을 초기화
	}

	public void setRadius(double r) {	// 반지름을 변경할 수 있는 setter 메소드
		radius = r;
	}

	public double getArea() {			// 원의 넓이를 리턴하는 메소드
		return PI * radius * radius;
	} 

	public double getPeri() {			// 원의 둘레를 리턴하는 메소드
		return 2 * PI * radius;
	}
}

class CircleMain {						// CircleMain 클래스
	public static void main(String[] args) {
		Circle cir = new Circle(3.5);	// 반지름이 3.5인 새로운 Circle 인스턴스 cir 생성 
		System.out.println("원의 넓이 : " + cir.getArea() + "/ 원의 둘레 : " + cir.getPeri());	// cir의 원의 넓이와 둘레를 출력

		cir.setRadius(12.5);			// cir의 반지름을 12.5로 변경
		System.out.println("원의 넓이 : " + cir.getArea() + "/ 원의 둘레 : " + cir.getPeri());	// cir의 원의 넓이와 둘레를 출력
	}
}
