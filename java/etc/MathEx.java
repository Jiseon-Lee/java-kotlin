class MathEx {
	public static void main(String[] args) {

		System.out.println("원주율 : " + Math.PI);			// 원주율 : 3.141592653589793
		System.out.println("5의 제곱근 : " + Math.sqrt(5));	// 5의 제곱근 : 2.23606797749979
		System.out.println("로그 25 : " + Math.log(25));		// 로그 25 : 3.2188758248682006
		System.out.println("2의 4승 : " + Math.pow(2, 4));	// 2의 4승 : 16.0

		double rad = Math.toRadians(45);
		System.out.println("sin 45 : " + Math.sin(rad));	// sin 45 : 0.7071067811865475
		System.out.println("cos 45 : " + Math.cos(rad));	// cos 45 : 0.7071067811865476
		System.out.println("tan 45 : " + Math.tan(rad));	// tan 45 : 0.9999999999999999
	}
}
