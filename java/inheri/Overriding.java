class Speaker {
	private int vol;
	public void showCurrentState() {
		System.out.println("불륨 크기 : " + vol);
	}
	public void setVol(int vol) { this.vol = vol; }
}

class BaseSpeaker extends Speaker {
	private int base;
	public void showCurrentState() {
	// 상위클래스인 Speaker의 ShowCurrentState() 메소드를 오버라이딩한 메소드
		super.showCurrentState();
		// 오버라이딩된 메소드에서만 상위클래스의 기본 메소드를 super 키워드를 이용하여 호출할 수 있음
		System.out.println("베이스 크기 : " + base);
	}
	public void setBase(int base) { this.base = base; }
}

class Overriding {
    public static void main(String[] args) {
		BaseSpeaker bs = new BaseSpeaker();
		bs.setVol(10);
		bs.setBase(20);
		bs.showCurrentState();
		// 오버라이딩된 메소드를 호출할 경우 무조건 인스턴스 기준으로 취하위 클래스의 오버라이딩된 메소드가 호출됨
	}
}
