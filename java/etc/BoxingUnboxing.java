class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue = new Integer(10);
		Double dValue = new Double(3.14);
		// boxing으로 기본자료형 데이터를 인스턴스로 만듦
		System.out.println("iValue : " + iValue + ", dValue : " + dValue);		// iValue : 10, dValue : 3.14

		iValue = new Integer(iValue.intValue() + 10);
		dValue = new Double(dValue.doubleValue() + 1.2);
		System.out.println("iValue : " + iValue + ", dValue : " + dValue);		// iValue : 20, dValue : 4.34

		Integer iValue2 = 10;
		Double dValue2 = 3.14;
		// auto boxing으로 new 키워드를 사용하지 않고 기본자료형 데이터를 직접 넣어 boxing함
		System.out.println("iValue : " + iValue2 + ", dValue : " + dValue2);	// iValue : 10, dValue : 3.14

		int n1 = iValue;
		double d1 = dValue + 1.2;
		// auto unboxing으로 인스턴스를 직접 기본자료형 변수에 넣음
		System.out.println("n1 : " + n1 + ", d1 : " + d1);		// n1 : 20, d1 : 5.54

		String str = new String("abcd");
		String str1 = "abcd"
	}
}
