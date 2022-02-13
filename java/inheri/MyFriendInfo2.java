import java.util.*;

class Friend {
// ģ������ �⺻����(�̸�, ��ȭ, �ּ�)���� ������ Ŭ����
	String name, phone, addr;	// ģ������ �⺻�������� ������ �������-

	public Friend(String name, String p, String a) {
	// FriendŬ������ �����ڷ� �޾ƿ� �Ű��������� ��������� ����(�ϳ��� �ν��Ͻ��� ������ �� ģ�� �⺻������ �����)
		this.name = name;
		phone = p;
		addr = a;
	}

	public void showAllInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("�ּ� : " + addr);
	}

	public String getName() { 
		return name;
	}
}

class HighFriend extends Friend {
// ��ģ���� ������ Ŭ������ Friend�� ��ӹ޾� ģ�� �⺻������ ������ ��
	String work;		// �������� ��ģ������ �ִ� ������ ������ �������

	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);	// �޾ƿ� ������ �� �⺻�������� �μ��� �Ͽ� ����Ŭ������ FriendŬ������ �����ڸ� ȣ��
		this.work = work;
	}

	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("���� : " + work);
	}

	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("���� : " + work);
	}
}

class UnivFriend extends Friend {
// ����ģ���� ������ Ŭ������ Friend�� ��ӹ޾� ģ�� �⺻������ ������ ��
	String major;		// �������� ����ģ������ �ִ� ������ ������ �������
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);	// �޾ƿ� ������ �� �⺻�������� �μ��� �Ͽ� ����Ŭ������ FriendŬ������ �����ڸ� ȣ��
		this.major = major;
	}
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("���� : " + major);
	}
	public void showBasicInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("���� : " + major);
	}
	public void nothing() {
		
	}
}

class FriendHandler {
// Friend, HighFriend, UnivFriend Ŭ�������� �̿��Ͽ� ���� �۾��� ó���ϴ� Ŭ����
	private Friend[] myFriends;
	private int numOfFriends;		// ����� ģ�� �� �Ǵ� ���� ������ �ε��� ��ȣ

	public FriendHandler(int n) {
		myFriends = new Friend[n];	// [, , , , , , , , , ,]
		numOfFriends = 0;
	}

	private void addFriendInfo(Friend fren) {
		myFriends[numOfFriends] = fren;		// �޾ƿ� ģ������ �ν��Ͻ��� myFriends�迭�� ����
		numOfFriends++;						// ���� ģ�� ������ ������ �ε����� ���� 1����(���� ����Ǿ��ִ� ģ������ �ν��Ͻ��� �����̱⵵ ��)
	}

	public void addFriend(int choice) {		// choice = 1�̸� ��ģ�� ���� choice = 2�̸� ����ģ�� ����
	// ����ڰ� �Է��ϴ� ģ�������� �޾� �����Ű�� �޼ҵ�
		String name, phone, addr, work, major;	// ģ�������� ������ �������� ����

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");		name = sc.nextLine();	// .nextInt();	.nextDouble();
		System.out.print("��ȭ : ");		phone = sc.nextLine();
		System.out.print("�ּ� : ");		addr = sc.nextLine();
		// ���� ���� ģ�� ��� �ʿ�� �ϴ� �⺻����(FriendŬ������ �������)���� �Է¹���

		if (choice == 1) {	// �� ģ�� ��Ͻ�
			System.out.print("���� : ");		work = sc.nextLine();	// �� ģ�� ���� ���� �Է¹���
			addFriendInfo(new HighFriend(name, phone, addr, work));	// �̸����� HighFriend�� �ν��Ͻ� ���� �� �� �ν��Ͻ��� �μ��� �Ͽ� addFriendInfo() �޼ҵ� ȣ��
		} else {			// ���� ģ�� ��Ͻ�
			System.out.print("���� : ");		major = sc.nextLine();	// ���� ģ�� ���� ���� �Է¹���
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("�Է¿Ϸ�");
	}

	public void showAllInfo() {
	// ��� ģ������ ��� ������ �����ִ� �޼ҵ�
		for (int i = 0; i < numOfFriends; i++) {		// each���� ���� �� �Ǵ� numOfFriends��� myFriends.length���� java.lang.NullPointerException
			myFriends[i].showAllInfo();
			// myFriends[i] : myFriends �迭�� i�ε����� ����ִ� Friend�� �ν��Ͻ�
			// .showAllInfo() : �ȿ� �ִ� showAllInfo() �޼ҵ� ȣ��
			// showAllInfo() �޼ҵ�� ����Ŭ����(HighFriend, UnivFriend)���� �������̵��߱� ������ ����Ŭ������ Friend�� �ƴ� ����Ŭ������ �޼ҵ尡 �����
			System.out.println();
		}
	}

	public void showBasicInfo() {
	// ��� ģ������ �⺻ ������ �����ִ� �޼ҵ�
		for (int i = 0; i < numOfFriends; i++) {
			if (myFriends[i] instanceof HighFriend) {	// �迭�� i�ε����� ����ִ� �ν��Ͻ��� HighFriend������ ����ȯ�� �����ϸ�
				((HighFriend)myFriends[i]).showBasicInfo();
			} else {
				((UnivFriend)myFriends[i]).showBasicInfo();
			}
			System.out.println();
		}
	} // myFriend["ȫ�浿","����ġ" , , , , , , ]

	public void searchFriend() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� : ");	
		String keyword = sc.nextLine();		// �Է��� �˻���(ģ�������� �� �̸�)

		for (int i = 0; i < numOfFriends; i++) {
		// ����� ģ�������鸸ŭ ������ ���鼭 �Է¹��� �˻���� ������ �̸��� �ִ��� �˻� �� ���
		// �̸� : myFriends �迭�ȿ� ����ִ� �ν��Ͻ����� name �������
			if (keyword.equals(myFriends[i].getName())) {
			// �˻���� ������ �̸��� ���� �ν��Ͻ��� myFriends�迭�� ������
				myFriends[i].showAllInfo();
				return;				// �޼ҵ带 ������ ���ؼ� (���̻� �޼ҵ带 �� ������ ����) -> ���������� ������ �ȵǰ���?����
			}
		}
		System.out.println("�˻������ �����ϴ�.");
	}

//	public void showFriendInfo(String name) {
//		boolean isFriend = false;
//		for (int i = 0; i < numOfFriends; i++) {
//			if (myFriends[i].name.equals(name))	{
//				myFriends[i].showAllInfo();
//				isFriend = true;
//				break;
//			}
//		}
//		if (!isFriend) {
//			System.out.println("�˻������ �����ϴ�.");
//		}
//		System.out.println();
//	}
}

class MyFriendInfo2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);
		// FriendHandler �� �ν��Ͻ� handler�� ���� �� ����
		
		while (true) {	// ���ѷ����μ� ��� ���鼭 ���α׷� ��� ���¸� ����
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. ��ģ�� ����");
			System.out.println("2. ����ģ�� ����");
			System.out.println("3. ��ü���� ���");
			System.out.println("4. �⺻���� ���");
			System.out.println("5. ģ���˻�-�̸�");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();	// ����ڰ� �Է��� �޴���ȣ�� choice������ ����

			switch (choice) {
				case 1: case 2:	// ����ڰ� �Է��� �޴���ȣ�� 1�̰ų� 2�̸�
					handler.addFriend(choice);	break;		// ������ �޴���ȣ�� �μ��� �Ͽ� handler�ν��Ͻ��� addFriend()�޼ҵ带 ȣ��
				case 3:
					handler.showAllInfo();		break;
				case 4:
					handler.showBasicInfo();	break;
				case 5:
					handler.searchFriend();		break;
// ���� �� �ڵ�			Scanner sc1 = new Scanner(System.in);					// �˻�� �޼ҵ� �ȿ��� �޵���
//					System.out.print("�˻��� �̸� : ");		handler.showFriendInfo(sc1.nextLine()); break;
				case 9:
					System.out.println("���α׷��� �����մϴ�.");
					return;		// ���θ޼ҵ� ���� -> ���α׷� ����
			}
		}
	}
}
