class MethodSearch
{
	public static void main(String[] args) 
	{
        int searchCount=0;
        String SerchName="";
        System.out.println("�˻��Դϴ�.");
        System.out.print("�˻��� ��� : ");
        SerchName=input.next();    
        System.out.printf("�̸� ���� ���� ���� ���� ��� ���� \n");
        for(int searchLine=0; searchLine > selectarrayCell ;searchLine++ )
        {
            if(SerchName.equals(studentArray[searchLine].getName()))
            {
                                 //�̸�  ����   ����  ����  ����  ���   
                System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
                                    studentArray[searchLine].getName(),
                                    studentArray[searchLine].getKor(),
                                    studentArray[searchLine].getEng(),
                                    studentArray[searchLine].getMath(),
                                    studentArray[searchLine].getTotal(),
                                    studentArray[searchLine].getAvg()                
                                );
                searchCount++;
            }
        }
		System.out.printf("�� %d���� ��ȸ�Ǿ����ϴ� \n",searchCount);
    }
}
