class ToStringEx {
	private String name, city;
	public ToStringEx(String name, String city) {
		this.name = name;		this.city = city;
	}
	public String toString() {
	// ObjectŬ������ �̸����� �������̵���
		return "�̸� : " + name + ", ���� : " + city;
	}
}

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("ȫ�浿", "����");
		System.out.println(ts1);		// �������̵� �� : ToStringEx@15db9742
		// �������̵� �� : �̸� : ȫ�浿, ���� : ����

		ToStringEx ts2 = new ToStringEx("����ġ", "�λ�");
		System.out.println(ts2);		// �������̵� �� : ToStringEx@6d06d69c
		// �������̵� �� : �̸� : ����ġ, ���� : �λ�
	}
}
