import java.math;

class ForTest4 
{
	public static void main(String[] args) 
	{
		int line,x,y;

		System.out.println("����1�Դϴ�.");
			for(y=1; y<=9; y++)
			{
				for(x=1; x<=9; x++)
				{
					System.out.printf("%d x %d = %2d \t",x,y,x*y);
				}
					System.out.println("");
			}
		System.out.println("------------------------------------------------------------------");

		System.out.println("����2�Դϴ�.");
			for(line=1 ; line<4 ; line++)
			{

				for(y=1; y<=9; y++)
				{
					for(x=line*3-2; x<=line*3; x++)
					{
						System.out.printf("%d x %d = %2d \t",x,y,x*y);
					}
						System.out.println("");
				}
				System.out.println("");
			}
		System.out.println("------------------------------------------------------------------"	);
		
		Math.pow(2,4);
		}
}