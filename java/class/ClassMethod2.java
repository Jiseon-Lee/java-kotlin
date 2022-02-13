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
		System.out.println("삼각형의 넓이 : " + TriangleMath.calTriArea(12.5, 13.7));
	}
}
// 인스턴스변수를 사용하지 않으면 static 붙여서 사용해도 됨