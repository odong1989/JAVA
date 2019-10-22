class ForTest1 {
	public static void main(String[] args) {

		/*---------
		0 1 2 3 4
		1 2 3 4
		2 3 4
		3 4
		4
		---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		5 4 3 2 1
		---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1
		---------*/
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		---------*/
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		1 0 0 0 0
		0 1 0 0 0
		0 0 1 0 0
		0 0 0 1 0
		0 0 0 0 1
		---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i == j ? "1 " : "0 ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		0 
		1 2
		2 3 4
		3 4 5 6
		4 5 6 7 8
		---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = i; j <= i * 2; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

		/*---------
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		---------*/
		int n = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(++n + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

	}
}

