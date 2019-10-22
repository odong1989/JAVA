
//구구단 출력 (2중 for문)
public class Gugudan2 {

	public static void main(String[] args) {
		int a, b;	

		for (a = 1; a <= 9; a++) {
			for (b = 1; b <= 9; b++) {
				System.out.println(a + "*" + b + "=" + a * b);
			}
			System.out.println();
		}
	}

}
