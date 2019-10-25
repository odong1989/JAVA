import java.util.Scanner;

class ArrayTest11_plus
{
	public static void main(String[] args) 
	{
		//=========================================================================================
		//ArrayTest11의 학생 5명의 국어 영어 수학점수 입력&출력문이다.
		//출력순서를 국어점수부터 모두 출력후 영어 점수 모두 출력 수학점수를 마지막으로 모두 출력하도록 해보자
		//출력결과는 같지만 내부의 처리 프로세스가 다르다고 할 수 있겠다.
		int score[][] = new int[5][3];
		Scanner input = new Scanner(System.in);

		for (int i=0; i < score.length ; i++)
		{
			System.out.printf("학생%d의 성적입력 \n",i);

			for (int j=0; j < score[i].length ;j++ )
			{
				System.out.printf("학생%d의 과목%d의 성적 : ", i,j);
				score[i][j] = input.nextInt(); 
			}
		}
		System.out.println("");			

		//출력
		//완벽하게 되지는 못했다 좀더 수정해보자
		System.out.println("\t국어\t영어\t수학\t ");
		for (int i=0; i < score[0].length ; i++)
		{
			System.out.printf("학생%d \t ", i);
			for (int j=0; j < score.length ;j++ )
			{
				System.out.printf("%d  \t",score[j][i]);
			}
		System.out.println("");
		}
	}
}
