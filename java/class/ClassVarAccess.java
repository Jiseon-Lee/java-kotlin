class AccessWay {
	static int num = 0;
	AccessWay() { incrCnt(); }
	public void incrCnt() { num ++; }
}

class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay.num++;	// 인스턴스의 존재 여부와 상관없이 클래스 멤버는 존재하고 있음
		AccessWay way = new AccessWay();
		way.num++;			// 인스턴스를 통해 클래스 변수에 접근가능
		AccessWay.num++;	// 클래스를 통해 클래스 변수에 접근가능
		System.out.println("num : " + AccessWay.num);	// 4
	}
}
