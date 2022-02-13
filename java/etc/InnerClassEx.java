class OuterClass {
	private String myName;
	private int num;
	OuterClass(String name) {
		myName = name;
		num = 0;
	}
	public void whoAreYou() {
		num++;
		System.out.println(myName + " OuterClass " + num);
	}
	class InnerClass {
		InnerClass() { whoAreYou(); }
		// inner 클래스에서는 outer 클래스의 멤버에 직접 접근할 수 있음. private에도 접근 가능
	}
}

class InnerClassEx {
	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("1st");
		OuterClass out2 = new OuterClass("2nd");
		out1.whoAreYou();										// 1st OuterClass 1
		out2.whoAreYou();										// 2nd OuterClass 1

		OuterClass.InnerClass inn1 = out1.new InnerClass();		// 1st OuterClass 2
		OuterClass.InnerClass inn2 = out2.new InnerClass();		// 2nd OuterClass 2
		OuterClass.InnerClass inn3 = out1.new InnerClass();		// 1st OuterClass 3
		OuterClass.InnerClass inn4 = out1.new InnerClass();		// 1st OuterClass 4
		OuterClass.InnerClass inn5 = out2.new InnerClass();		// 2nd OuterClass 3
		// inner 클래스의 인스턴스를 생성하려면 반드시 outer 클래스의 인스턴스를 이용해야 함
		// inner 클래스의 인스턴스들은 outer 클래스의 인스턴스 안에 존재하게 됨
	}
}
