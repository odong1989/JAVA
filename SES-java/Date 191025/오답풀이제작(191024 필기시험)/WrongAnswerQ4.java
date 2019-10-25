//	20191024 필기시험 오답풀이 - 문제 4번
//	(작성자 : 김보성)

//original class name : public class Test3  
class WrongAnswerQ4
{
	public static void main(String[] args) 
	{
		// add code : 본 실행문의 이해를 돕기위해 본래의 코드 외에 추가한 내용입니다. 
		int i=0;
		int result = 0;

		System.out.println("i++의 for반복문 내에서의 진행과정 출력입니다."); //add code
		for( ; i<=10 ; i++)
		{
			result+=i;

		System.out.printf("i : %2d, result : %2d \n",i,result);//add code
		}
		System.out.println("");//add code		

		System.out.println(i+ ", "+result);


		//아래의 코드들은 전부 확인용 추가코드입니다.
		//i++(후증감),++i	
		int j=0;
		int resultJ = 0;

		System.out.println("++j for반복문 내에서의 진행과정 출력입니다."); 
		for( ; j<=10 ; ++j)
		{
			resultJ+=j;

		System.out.printf("j : %2d, resultJ : %2d \n",j,resultJ);
		}
		System.out.println("");

		System.out.println(j+ ", "+resultJ);

	}
}



