/*
1. �������� �Ǽ��� ������ �� �ִ� Circle Ŭ���� �ۼ�
 - �ν��Ͻ� ������ ���ÿ� ����������� �ʱ�ȭ ��Ŵ
 - Ŭ���� ����� �������� ������ ���(PI) ����(�� : 3.1415)
2. �������� ������ �� �ִ� setter �޼ҵ� �ۼ�
3. ���� ���̸� ���Ͽ� �����ϴ� getArea() �޼ҵ� �ۼ�
4. ���� �ѷ��� ���Ͽ� �����ϴ� getPeri() �޼ҵ� �ۼ�
5. CircleŬ������ �̿��Ͽ� �� ���� ���� ���̿� �ѷ��� ����� CircleMain Ŭ���� �ۼ�
 - �������� 3.5�� �ϴ� �� �ν��Ͻ� ���� �� ���� ���̿� �ѷ� ���
 - �������� 12.5�� ���� �� ���� ���̿� �ѷ� ���
 - ����� "���� ���� : ??? / ���� �ѷ� : ???" �������� ����ϸ� ��
 */
class Circle {		// �������� �Ǽ��� ������ �� �ִ� Circle Ŭ����
	static final double PI = 3.1415;	// Ŭ���� ������ PI ����
	private double radius;				// ������

	public Circle(double r) {			// ������
		radius = r;						// ������ ���� �ʱ�ȭ
	}

	public void setRadius(double r) {	// �������� ������ �� �ִ� setter �޼ҵ�
		radius = r;
	}

	public double getArea() {			// ���� ���̸� �����ϴ� �޼ҵ�
		return PI * radius * radius;
	} 

	public double getPeri() {			// ���� �ѷ��� �����ϴ� �޼ҵ�
		return 2 * PI * radius;
	}
}

class CircleMain {						// CircleMain Ŭ����
	public static void main(String[] args) {
		Circle cir = new Circle(3.5);	// �������� 3.5�� ���ο� Circle �ν��Ͻ� cir ���� 
		System.out.println("���� ���� : " + cir.getArea() + "/ ���� �ѷ� : " + cir.getPeri());	// cir�� ���� ���̿� �ѷ��� ���

		cir.setRadius(12.5);			// cir�� �������� 12.5�� ����
		System.out.println("���� ���� : " + cir.getArea() + "/ ���� �ѷ� : " + cir.getPeri());	// cir�� ���� ���̿� �ѷ��� ���
	}
}
