class Aa {
	public void test1() { System.out.println("Aa's test1()"); }
	public void test2() { System.out.println("Aa's test2()"); }
}

class Bb extends Aa {
	public void test1() { System.out.println("Bb's test1()"); }
	public void test2() { System.out.println("Bb's test2()"); }
}

class Cc extends Bb {
	public void test2() { System.out.println("Cc's test2()"); }
}

class Dd extends Aa {
	public void test1() {  System.out.println("Dd's test1()");  }
}

class OverridingTest {
	public static void main(String[] args) {
		Bb b = new Bb();
		Cc c = new Cc();
		b.test1();		// Bb's test1();
		b.test2();		// Bb's test2();
		c.test1();		// Bb's test1();
		c.test2();		// Cc's test2();
		// �ν��Ͻ��� �������� �Ͽ� ������ Ŭ�������� �������̵��� �޼ҵ尡 ȣ���

		Aa ab = new Bb();
		Aa ad = new Dd();
		ab.test1();		// Bb's test1()
		ad.test1();		// Dd's test1()
	}
}
