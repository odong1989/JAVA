
//구구단 출력 (3중 for문)
public class Gugudan4 {

	public static void main(String[] args) {
		int a, b, c;	

		for (a = 1; a <= 7; a += 3) {
			for (b = 1; b <= 9; b++) {
				for (c = a; c <= a + 2; c++) {
					System.out.print(c + "*" + b + "=" + b * c + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
