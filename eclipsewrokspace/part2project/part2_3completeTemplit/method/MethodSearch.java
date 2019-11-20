class MethodSearch
{
	public static void main(String[] args) 
	{
        int searchCount=0;
        String SerchName="";
        System.out.println("검색입니다.");
        System.out.print("검색할 사람 : ");
        SerchName=input.next();    
        System.out.printf("이름 국어 영어 수학 총점 평균 석차 \n");
        for(int searchLine=0; searchLine > selectarrayCell ;searchLine++ )
        {
            if(SerchName.equals(studentArray[searchLine].getName()))
            {
                                 //이름  국어   영어  수학  총점  평균   
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
		System.out.printf("총 %d건이 조회되었습니다 \n",searchCount);
    }
}
