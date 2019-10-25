class LoopTest2 
{
	public static void main(String[] args) 
	{

	//--------------------------------------------------------------------------------------------------------
	//(0)일반적인 이중반복문(중간제어없음)

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("break 활용 종료");
	System.out.println("=======================================================================================");

	/*
	0)break등을 사용않을 경우의 출력
	i=0,j=0 | i=0,j=1 | i=0,j=2 | i=0,j=3 | i=0,j=4 |
	i=1,j=0 | i=1,j=1 | i=1,j=2 | i=1,j=3 | i=1,j=4 |
	i=2,j=0 | i=2,j=1 | i=2,j=2 | i=2,j=3 | i=2,j=4 |
	i=3,j=0 | i=3,j=1 | i=3,j=2 | i=3,j=3 | i=3,j=4 |
	i=4,j=0 | i=4,j=1 | i=4,j=2 | i=4,j=3 | i=4,j=4 |
	프로그램 종료
	*/

	//--------------------------------------------------------------------------------------------------------
	//(1)break 활용

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
					break;
					/*여기서 내가 헷갈리지 말아야 할 것이 
					  (X) break 사용 = 프로그램이 종료 
					  (ㅇ) break 사용 = break가 있는 반복문의 이하 내용들을 실행않고 탈출한다는 것이다.
					*/ 
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("break 활용 종료");
	System.out.println("=======================================================================================");

	/*
	1)break 사용시
	i=0,j=0 | i=0,j=1 |
	i=1,j=0 | i=1,j=1 |
	i=2,j=0 | i=2,j=1 |
	i=3,j=0 | i=3,j=1 |
	i=4,j=0 | i=4,j=1 |
	*/

	//--------------------------------------------------------------------------------------------------------
	//(2)continue 활용

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				continue;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("continue 활용 종료");	
	System.out.println("=======================================================================================");

	/*
	2)continue 사용시
	i=0,j=0 | i=0,j=1 | i=0,j=3 | i=0,j=4 |
	i=1,j=0 | i=1,j=1 | i=1,j=3 | i=1,j=4 |
	i=2,j=0 | i=2,j=1 | i=2,j=3 | i=2,j=4 |
	i=3,j=0 | i=3,j=1 | i=3,j=3 | i=3,j=4 |
	i=4,j=0 | i=4,j=1 | i=4,j=3 | i=4,j=4 |
	프로그램 종료
	*/

	//--------------------------------------------------------------------------------------------------------
	//(3) (#goto문 연습1 : goto문+break)

		out: //반복문의 이름을 out이라고 설정했습니다.
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				break out;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end



	System.out.println("goto break(out: & break out:) 종료");	
	System.out.println("=======================================================================================");
	/*
	//실행결과 : 
		i=0,j=0 | i=0,j=1 | goto break(out: & break out:) 종료
	*/


	//--------------------------------------------------------------------------------------------------------
	//(4) (#goto문 연습2 : goto문+continue)

		out: //반복문의 이름을 out이라고 설정했습니다.
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				continue out;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end

	System.out.println("goto continue(out: & continue out:) 종료");	
	System.out.println("=======================================================================================");
	/*
	//실행결과
	i=0,j=0 | i=0,j=1 | i=1,j=0 | i=1,j=1 | i=2,j=0 | i=2,j=1 | i=3,j=0 | i=3,j=1 | i=4,j=0 | i=4,j=1 | goto continue(out: & break out:) 종료
	*/

	
	for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				return;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("return실행문 종료");	
	System.out.println("=======================================================================================");



	
	for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				System.exit(0);
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("return실행문 종료");	
	System.out.println("=======================================================================================");

	}
}



