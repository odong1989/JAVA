/*
	������ : SES �ڹ� �ڹ�å 151������
*/
class VarArgs
{
	void checkVars(int... vars){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}


	void checkVars2(int... vars){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}


	/*å���� "���������� ������ �����ϴ� �ѹ��� �����ϸ� �׻� �ż����� ������ �Ű��������� �Ѵ�"�� ������
	  �������� �޼ҵ尡 �ߺ��̸� �ȵǴ� ������ Ȯ���غ���.
	  �޼ҵ��� �Ķ���� ����� �����϶�� ��Ʈ�� Ȯ�εǾ���.*/
	


	void checkVars3(int notError, int... vars){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}


	/*
	//�������� int... vars�� �ڿ� int error��� int������ �ֱ⿡
	//"���������� ������ �׻� �޼����� ������ �Ű������� ����Ѵ�"�� ��Ģ�� �����ؼ� ������ ó���ȴ�.
	void checkVarsError(int... vars, int error){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}
	*/


}



