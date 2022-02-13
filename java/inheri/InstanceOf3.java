class BasicBox {
	int n = 100;
	public void basicWrap() { System.out.println("basic wrap"); }
}

class PaperBox extends BasicBox {
	public void paperWrap() { System.out.println("paper wrap"); }
}

class GoldBox extends PaperBox {
	public void goldWrap() { System.out.println("gold wrap"); }
}

class InstanceOf3 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
	}
	public static void wrapBox(Object box) {
	// �Ű������� �ڷ����� Object�̹Ƿ� ��� ������ �����͸� �Ű������� ���� �� ����
		if (box instanceof GoldBox) {
			((GoldBox)box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		} else {		// ���� ���� basicbox�ۿ� �����Ƿ� else if�� �ƴ� esle�� �ᵵ ������
			((BasicBox)box).basicWrap();
			// Object�� �޾ұ� ������ BasicBox�� �ƴ� ObjectŬ�������� basicWrap()�޼ҵ带 �����Ű�Ƿ� �������� BasicBoxŬ������ ����ȯ�� �ؾ� ��
		}
	}
}


Object - BasicBox - PaperBox - GoldBox