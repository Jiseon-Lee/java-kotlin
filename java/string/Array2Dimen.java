class Array2Dimen {
	public static void main(String[] args) {
		int [][] arr = new int[3][4];
		// int�� ������ 12���� ������ �� �ִ� 3�� 4�� ¥�� 2���� �迭�� ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		int[][] arr2 = {
			{1, 2},
			{3, 4, 5},
			{6, 7, 8, 9}
		};
		System.out.println("arr2 �迭�� �� �� : " + arr2.length);		// arr2 �迭�� �� �� : 3
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "���� ����(�� ��) : " + arr2[i].length);
			// 1���� ����(�� ��) : 2
			// 2���� ����(�� ��) : 3
			// 3���� ����(�� ��) : 4
		}
	}
}