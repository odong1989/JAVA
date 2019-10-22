class ArrayTest6 
{
	public static void main(String[] args) 
	{
		int ar[] = new int[6];

/*
		//무작위로 채워봅시다.(범위 : 1~45)
		for(int i=0; i<6; i++)
		{
			ar[i] = (int)(Math.random()*45)+1 ;//랜덤범위 : 1~45
	
			//그 이전까지의 모든 숫자
			//같은 값이 발견될 경우 
			//현재 숫자를 다시 생성하여 진행하도록 하세요.
			for(int j=0; j < i; j++)
			{
				if(ar[j] == ar[i]){
					ar[i] = (int)(Math.random()*45)+1 ;//랜덤범위 : 1~45
				}
			}	
		}
*/


		//무작위로 채워봅시다.(범위 : 1~45)
		for(int i=0; i<6; i++)
		{
			ar[i] = (int)(Math.random()*6)+1;
	
			for(int j=0; j < i; j++)
			{
				if(ar[j] == ar[i])
				{
					i--;
					break;
				}
			}	
		}
			
		//정상기입 확인출력용.
		for(int k=0; k<6; k++)
		{
			System.out.print(ar[k]+" "); 
		}
	
	}
}
