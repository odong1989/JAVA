import java.util.Scanner;

class ArrayTest9_RE
{
	/*
		조건① 배열을 생성하고 무작위로 5개의 숫자를 받으십시오
		    (랜덤범위 : 1 ~ 15)
		조건②사용자에게 1개의 숫자를 입력받습니다.
		조건③사용자가 입력한 값이 5개의 랜덤생성중에 있는지 확인
	*/

	public static void main(String[] args) 
	{
		int ar[];
		ar=new int[5];
		Scanner input = new Scanner(System.in);
		int input_user;

		//랜덤 5개 생성 및 저장	
		for (int i=0; i<ar.length ; i++ )
		{
			ar[i] = (int)(Math.random()*15)+1;
		}

		//사용자의 원하는 값 수신
		System.out.print("원하는 값을 입력 : ");
		input_user = input.nextInt();
		
		for(int j=0; j<ar.length ; j++){
			if(ar[j] == input_user) 
			{
				System.out.println("ar[j] ="+ar[j] + "input_user" + input_user);
				break;
			}
		System.out.println("ar[j] =" + ar[j]);
		}

		
	}
}
