import java.unit.Scanner;

		/* (+a)
			입력7일때
		   000*	
		   00***
		   0*****
		   *******
		   0*****
           00***
		   000*

		   입력11일때
		   00000*		
		   0000***
		   000*****	
		   00*******
		   0*********
		   ***********
		   0*********
           00*******
		   000*****
		   0000***
		   00000*		
		*/

class ForTest_alpha
{
	public void output(int line_x, int nothing) 
	{
		for(line_x =0; line_x<=2 ; line_x++)
		{
			if (Flag_trun == 0)
			{
			//공란의 정삼각형
			for(; nothing>line_x ; nothing--)
			{
				System.out.print(" ");
			}
			//세모난 삼각형
			for(int star=1+2*line_x; star>0;star--)
			{
				System.out.print("*");
			}
			System.out.println("");
			}

	}

	public static void main(String[] args) 
	{
		byte Flag_turn=0;
		Scanner input = new Scanner();

		System.out.println("+a, 내가 입력한 홀수에 따라서 알아서 다이아가 생성되도록한다.(입력홀수=");
		System.out.println("* 입력홀수= 다이아의 허리둘레");
		System.out.println("원하는 다이아의 둘레를입력하세요(홀수만 가능) ");

		/*입력한 값의 2배+1을 한 공간을 확보한 다음에 
		  중앙점을 기준으로 늘어간다면 어떨까?
배열의 개념이라고 해야하나?
*/

	}


	}//main end
}//class end
