class WhileTest1 
{
	public static void main(String[] args) 
	{
		int i,sum=0;

		//for¹®
		for(i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("sum of for : " + sum);

		//while¹®
		sum=0;
		i=1;

		while(i<=10)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum of while : " + sum);

		//do-while¹® / JAVA
		sum=0;
		i=1;

		do{			
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("sum of do-while : " + sum);
	}
}
