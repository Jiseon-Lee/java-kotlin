class SimpleMath {
	public static double add(double n1, double n2) { return n1 + n2; }
	public static double mul(double n1, double n2) { return n1 * n2; }
}

class TriangleMath {
	public static double calTriArea(double bottom, double height) {
		double result = SimpleMath.mul(bottom, height);
		result = result / 2;
		return result;
	}
}

class ClassMethod2 {
	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���� : " + TriangleMath.calTriArea(12.5, 13.7));
	}
}
// �ν��Ͻ������� ������� ������ static �ٿ��� ����ص� ��