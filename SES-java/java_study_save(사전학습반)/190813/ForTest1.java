public class ForTest1 {
	public static void main(String[] args) 
	{
		//0 1 2 3 4
		for(int i =0;i<5;i++)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");

		//1 2 3 4 5
		for(int i =1;i <=5 ;++i)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");

		//0 2 4 6 8 
		for(int i =0;i<=8;i+=2)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");

		//5 4 3 2 1 
		for(int i =5;i>=1;i--)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");

		//10 20 30 40 50 60 70 80 90 100
		for(int i =0;i <=100 ;i+=10)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");

		//10 20 30 40 50 60 70 80 90 100
		for(int i =1;i <=10000 ;i*=10)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
	}
}
