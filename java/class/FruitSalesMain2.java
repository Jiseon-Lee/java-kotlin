class FruitSeller {
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	// 일반 메소드에서는 멤버상수에 값을 지정할 수 없으므로 APPLE_PRICE를 상수로 선언할 수 없음
	// 일반 메소드는 다시 호출할 수 있으므로 상수의 값을 변경될까봐 오류를 발생시킴

	public void initMember(int num, int money, int price) {
	// 멤버변수들을 초기화시키는 메소드
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		myMoney += money;
		numOfApple -= num;
		return num;
	}

	public void showSaleResult() {
		System.out.println("보유 개수 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer {
	int numOfApple = 0;
	int myMoney = 10000;

	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitSalesMain2 {
	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller();
		// FruitSeller형 인스턴스 seller1을 선언 및 생성
		seller1.initMember(30, 0, 1500);
		// seller1 인스턴스 안의 initMember()메소드를 호출하여 멤버변수들의 값을 초기화

		FruitSeller seller2 = new FruitSeller();
		// FruitSeller형 인스턴스 seller2를 선언 및 생성
		seller2.initMember(20, 0, 1000);
		// seller2 인스턴스 안의 initMember()메소드를 호출하여 멤버변수들의 값을 초기화

		FruitBuyer buyer = new FruitBuyer();
		// fruitBuyer형 인스턴스 buyer를 선언 및 생성

		buyer.buyApple(seller1, 4500);	// seller1 판매자에게 4500
		buyer.buyApple(seller1, 4500);

		System.out.println("사과 판매자1 현황");
		seller1.showSaleResult();

		System.out.println("사과 판매자2 현황");
		seller2.showSaleResult();

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();
	}
}
/*
문제점
 - 상수였던 APPLE_PRICE가 변수로 변경됨
 - 인스턴스 생성시 두 개의 명령이 필요
 - initMember() 메소드를 언제든지 호출할 수 있음(다시 호출되면 판매기록이 리셋됨)

