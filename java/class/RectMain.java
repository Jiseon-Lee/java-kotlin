/*
가로와 세로 정보를 저장할 수 있는 Rect 클래스 제작
1. 인스턴스 생솽과 동시에 멤버변수들을 초기화 시킴
2. 가로와 세로 정보를 변경할 수 있는 메소드 제작
3. 직사각형의 넓이와 둘레를 계산해서 리턴하는 메소드 제작
 - 가로 12, 세로 17인 직사각형 인스턴스 생성 후 넓이 출력
 - 가로를 9, 세로를 7로 변경한 후 둘레 출력
*/
class Rect {
	private int width, height;

	public Rect(int w, int h) {
		width = w;
		height = h;
	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public int getRound() {
		return (width + height) * 2;
	}

	public int getArea() {
		return width * height;
	}
}

class RectMain {
	public static void main(String[] args) {
		Rect rec = new Rect(12, 17);
		System.out.println("직사각형의 넓이 : " + rec.getArea());

		rec.setWidth(9);
		rec.setHeight(7);
		System.out.println("직사각형의 둘레 : " + rec.getRound());
	}
}
