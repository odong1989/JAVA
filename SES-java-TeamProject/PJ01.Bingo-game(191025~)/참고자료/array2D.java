import java.util.Scanner;

class array2D 
{
	public static void main(String[] args) 
	{
		//��ǥ : ��� ���� �����ϸ� �� ������ ĭ�� ��ǥ(x,y)���� ������ �� �־�� �Ѵ�.
		//[?]�¸������� ��� �Ұ�?
		//[!]�¸��� �ش��ϴ� �ٵ��� ��ǥ�� 3���� ��� ������ �� �־�� �ҵ�?
		//��[?] : �׷� ���ڵ�� �ص� �Ǵ°� �ƴѰ�?
		

		String[][] table = { {"1","2","3"},
							 {"4","5","6"},
						     {"7","8","9"} };
		//���� ����: https://hyeonstorage.tistory.com/175 [������ �ϰ� �;��]

		


		System.out.println("2�����迭�� ���� ����) : "+table.length);
		System.out.println("2�����迭�� 1��� �����ϴ� ��(ĭ)�� ����) : "+table[0].length);

		System.out.println("==========================================================");

		int[][] victoryCondition={{1,2,3},
						  	 	  {4,5,6},
						  	 	  {7,8,9},
						  	 	  {1,4,7},
						  	 	  {2,5,8},
						  	 	  {3,6,9},
						  	 	  {1,5,9},
						  	 	  {3,5,7} }; 
		System.out.println("victoryCondition 2�����迭�� ���� ����) : "+victoryCondition.length);
		System.out.println("victoryCondition 2�����迭�� 1��� �����ϴ� ��(ĭ)�� ����) : "+victoryCondition[0].length);


		System.out.println("1�� 3���� �� : " + victoryCondition[0][2]);
		System.out.println("2�� 3���� �� : " + victoryCondition[1][2]);
		System.out.println("7�� 2���� �� : " + victoryCondition[6][1]);

		System.out.println("==========================================================");
		boolean[] winFlag={false,false,false};
		System.out.println("boolean�� �迭 winFlag�� 1��° ĭ�� �� : " + winFlag[0]);		
		System.out.println("boolean�� �迭 winFlag�� 2��° ĭ�� �� : " + winFlag[1]);		
		System.out.println("boolean�� �迭 winFlag�� 3��° ĭ�� �� : " + winFlag[2]);		

		winFlag[0]=true;
		System.out.println("boolean�� �迭 winFlag�� 1��° ĭ�� �� : " + winFlag[0]);		
	}//main end
}//class end
