import java.util.Scanner;

class ArrayTest11 
{
	public static void main(String[] args) 
	{
		int a[]   = new int[6];
		int b[][] = new int[2][3];
		
	
		System.out.println("a의 길이 : "+ a.length);		
		System.out.println(" b.length = 'b은 몇개의 행이 있습니까?' : "+ b.length);
		System.out.println(" b[0].length = 'b의 0행은 몇개의 칸으로 구성되었나요?' : "+ b[0].length);
		System.out.println("");


		System.out.println("a[0]의    값 : "+ a[0]);
		System.out.println("b[0][0]의 값 : "+ b[0][0]);
		System.out.println("");
		
		//1차원 배열 a가 보유한 값을 확인
		for (int i=0;i< a.length ; i++ )
		{
		System.out.println("a["+ i +"]의    값 : "+ a[i]);
		}
		System.out.println("");


		//2차원 배열 b가 보유한 값을 확인.
		for (int j=0;j< b.length ; j++ )
		{
			for (int k=0; k< b[j].length ; k++ )
			{
				//int b[][] = new int[2][3]; 인경우
				//3칸 출력 후  
				System.out.println("b["+j+"]["+k+"]의    값 : "+ b[j][k]);
			}
		}
		System.out.println("");
		
		//=========================================================================================
		//학생 5명의 국어 영어 수학 점수
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
		System.out.println("\t국어\t영어\t수학\t ");
		for (int i=0; i < score.length ; i++)
		{
			System.out.printf("학생%d \t ", i);
			for (int j=0; j < score[i].length ;j++ )
			{
				System.out.printf("%d  \t",score[i][j]);
			}
		System.out.println("");
		}

	}
}
