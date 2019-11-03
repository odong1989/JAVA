import java.util.Scanner;

class ArrayTest2_RE 
{
	public static void main(String[] args) 
	{
		//int형 10개짜리 배열 생성
		int array[]= new int[10];
		Scanner Scan = new Scanner(System.in);

		for(int cnt=0;cnt<array.length;++cnt)
		{
			//배열요소 0~9번까지 키보드로 입력받아 대입
			System.out.println(cnt+"번칸 입니다.");
			array[cnt]=Scan.nextInt();
			System.out.println(cnt+"번칸 값 : "+array[cnt]+"");
		}


		//배열의 내용 확인출력
		for(int cnt=0;cnt<array.length;cnt++)
		{
			System.out.println(cnt+"번째 값 : "+array[cnt]);
		}

		//배열의 합계값 출력
		int total=0;
		for(int cnt=0;cnt<array.length;cnt++)
		{
			System.out.print(array[cnt]+"+");
			total+=array[cnt];
			if(cnt==9){
				System.out.println("="+total);
			}
		}

	}
}