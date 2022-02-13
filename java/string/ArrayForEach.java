class ArrayForEach {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++ ) {
			sum += arr[i];
		}
		System.out.println("배열 요소들의 합(for) : " + sum);

		sum = 0;
		for (int e : arr) {
			sum += e;
		}
		// arr배열의 모든 요소들을 차례대로 변수 e에 넣고 루프를 돔(무조건 처음부터 끝까지 루프를 돔)
		System.out.println("배열 요소들의 합(for-each) : " + sum);

		for (int e : arr) { //arr = {1, 2, 3, 4, 5};
			e++;		// arr배열의 값을 e에 담아 1증가(원분의 값은 변하지 않음)
			System.out.print(e + " ");		// 2 3 4 5 6
		}
		System.out.println();
		for (int e : arr) {
			System.out.print(e + " ");		// 1 2 3 4 5
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			arr[i]++;		
			System.out.print(arr[i] + " ");		// 2 3 4 5 6
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		// 2 3 4 5 6
		}
		System.out.println();

		String[] arrStr = {"a" , "b", "c", "d"};
		for (String e : arrStr) {
			System.out.print(e + " ");		// a b c d
		}
		System.out.println();

		for (String e : arrStr) {
			e = e + "-";
			System.out.print(e + " ");		// a- b- c- d-
		}
		System.out.println();

		for (String e : arrStr) {
			System.out.print(e + " ");		// a b c d
		}
		System.out.println();
	}
}
