//	20191024 �ʱ���� ����Ǯ�� - ���� 4��
//	(�ۼ��� : �躸��)

//original class name : public class Test3  
class WrongAnswerQ4
{
	public static void main(String[] args) 
	{
		// add code : �� ���๮�� ���ظ� �������� ������ �ڵ� �ܿ� �߰��� �����Դϴ�. 
		int i=0;
		int result = 0;

		System.out.println("i++�� for�ݺ��� �������� ������� ����Դϴ�."); //add code
		for( ; i<=10 ; i++)
		{
			result+=i;

		System.out.printf("i : %2d, result : %2d \n",i,result);//add code
		}
		System.out.println("");//add code		

		System.out.println(i+ ", "+result);


		//�Ʒ��� �ڵ���� ���� Ȯ�ο� �߰��ڵ��Դϴ�.
		//i++(������),++i	
		int j=0;
		int resultJ = 0;

		System.out.println("++j for�ݺ��� �������� ������� ����Դϴ�."); 
		for( ; j<=10 ; ++j)
		{
			resultJ+=j;

		System.out.printf("j : %2d, resultJ : %2d \n",j,resultJ);
		}
		System.out.println("");

		System.out.println(j+ ", "+resultJ);

	}
}



