import java.math.*;

class BigIntegerEx {
	public static void main(String[] args) {
		System.out.println("기본 자료형 최대 정수 : " + Long.MAX_VALUE);			// 9223372036854775807
		System.out.println("기본 자료형 최소 정수 : " + Long.MIN_VALUE);			// -9223372036854775808

		BigInteger bigValue1 = new BigInteger("100000000000000000000");
		BigInteger bigValue2 = new BigInteger("-99999999999999999999");

		// bigValue1과 bigValue2를 각각 더하고, 곱한 결과값을 출력
		System.out.println("더한 값 : " + bigValue1.add(bigValue2));			// 1
		System.out.println("곱한 값 : " + bigValue1.multiply(bigValue2));		// -9999999999999999999900000000000000000000

		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		System.out.println("더한 결과 : " + addResult);		// 1
		System.out.println("곱한 결과 : " + mulResult);		// -9999999999999999999900000000000000000000
	}
}
