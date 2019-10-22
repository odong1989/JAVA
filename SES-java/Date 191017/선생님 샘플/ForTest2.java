class ForTest2 {
	public static void main(String[] args) {

/*--------
	*
	**
	***
	****
	*****
---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");

/*--------
	*****
	****
	***
	**
	*
---------*/
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");

/*--------
		*
	   **
	  ***
	 ****
	*****
---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("----------");

/*--------
	*****
	 ****
	  ***
	   **
		*
---------*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("----------");

/*--------
   *
  ***
 *****
*******
---------*/
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 4; j++) {
				if (j < 3 - i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("----------");

/*--------
   *
  ***
 *****
  ***
   *
---------*/
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 3; j++) {
				if (j < 2 - i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4 - i; j++) {
				if (j <= i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
