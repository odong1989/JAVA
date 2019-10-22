
//구구단 출력 (2중 for문)
public class Gugudan3 {

	public static void main(String[] args) {
		int a, b;	

		for (a = 1; a <= 9; a++) {
			for (b = 1; b <= 9; b++) {
				System.out.print(b + "*" + a + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}

}
