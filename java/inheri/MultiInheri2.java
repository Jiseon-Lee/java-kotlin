interface TV {
	void onTV();
}

class TVImpl {
	public void onTV() { System.out.println("���� ��� ��"); }
}

interface Computer {
	void dataReceive();
}

class ComputerImpl {
	public void dataReceive() { System.out.println("���� ������ ���� ��"); }
}

class IPTV implements TV, Computer {
	ComputerImpl com = new ComputerImpl();
	TVImpl tv = new TVImpl();
	public void dataReceive() {
		com.dataReceive();
	}
	public void onTV() {
		tv.onTV();
	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

class MultiInheri2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV tv = iptv;
		// IPTV�� ����Ŭ������ TV�� �ν��Ͻ��� IPTV�� �ν��Ͻ��� ����

		Computer com = iptv;
		// IPTV���� ������ Computer�� �ν��Ͻ��� IPTV�� �ν��Ͻ��� �����
		// Computer�� interface������ ����Ŭ�����ΰ� ó�� ������ ���� ����
	}
}
