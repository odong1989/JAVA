class test_for
{
	public static void main(String[] args) 
	{
		// 1+2+3+4+5+6+7+8+9+10
		int total=0;

		for(int cnt=1;cnt<11;cnt++){
			total=total+cnt;
		}
		System.out.println("1~10까지의 합계 : "+total );

		//1~100이내의 홀수들의 합		
		total=0;
		for(int cnt=1;cnt<101;cnt+=2){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 홀수의 합 : "+total );

		//1~100사이의 3의 배수의 합계
		total=0;
		for(int cnt=3;cnt<=100;cnt+=3){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 3의배수 합 : "+total );

		//1~100사이의 3의배수&5의배수인 숫자들의 합계
		//나의 경우 15가 최소공통배수임을 보고 그에 따라 증감적용
		total=0;
		for(int cnt=15;cnt<=100;cnt+=15){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 3의배수&5의배수 합 : "+total );


		//1~100사이의 3의배수&5의배수인 숫자들의 합계
		//선생님의 방식
		total=0;
		for(int cnt=15;cnt<=100;cnt++){
			//조건문을 안에 넣어서 쓰는, 혼용도 가능토록 신경
			if(cnt%3==0&&cnt%5==0)
			{
				total+=cnt;
			}
		}
		System.out.println("1~100이내의 3의배수&5의배수 합 : "+total );
	}

}
