/*
���ο� ���� ������ ������ �� �ִ� Rect Ŭ���� ����
1. �ν��Ͻ� ����� ���ÿ� ����������� �ʱ�ȭ ��Ŵ
2. ���ο� ���� ������ ������ �� �ִ� �޼ҵ� ����
3. ���簢���� ���̿� �ѷ��� ����ؼ� �����ϴ� �޼ҵ� ����
 - ���� 12, ���� 17�� ���簢�� �ν��Ͻ� ���� �� ���� ���
 - ���θ� 9, ���θ� 7�� ������ �� �ѷ� ���
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
		System.out.println("���簢���� ���� : " + rec.getArea());

		rec.setWidth(9);
		rec.setHeight(7);
		System.out.println("���簢���� �ѷ� : " + rec.getRound());
	}
}
