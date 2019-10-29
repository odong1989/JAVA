import java.util.Scanner;

class array2D 
{
	public static void main(String[] args) 
	{
		//목표 : 어떠한 셀을 선택하면 그 선택한 칸의 좌표(x,y)값을 가져올 수 있어야 한다.
		//[?]승리조건은 어떻게 할거?
		//[!]승리에 해당하는 줄들의 좌표값 3개를 묶어서 따져볼 수 있어야 할듯?
		//재[?] : 그럼 숫자들로 해도 되는거 아닌감?
		

		String[][] table = { {"1","2","3"},
							 {"4","5","6"},
						     {"7","8","9"} };
		//선언 참고: https://hyeonstorage.tistory.com/175 [개발이 하고 싶어요]

		


		System.out.println("2차원배열의 행의 개수) : "+table.length);
		System.out.println("2차원배열의 1행당 보유하는 값(칸)의 개수) : "+table[0].length);

		System.out.println("==========================================================");

		int[][] victoryCondition={{1,2,3},
						  	 	  {4,5,6},
						  	 	  {7,8,9},
						  	 	  {1,4,7},
						  	 	  {2,5,8},
						  	 	  {3,6,9},
						  	 	  {1,5,9},
						  	 	  {3,5,7} }; 
		System.out.println("victoryCondition 2차원배열의 행의 개수) : "+victoryCondition.length);
		System.out.println("victoryCondition 2차원배열의 1행당 보유하는 값(칸)의 개수) : "+victoryCondition[0].length);


		System.out.println("1행 3열의 값 : " + victoryCondition[0][2]);
		System.out.println("2행 3열의 값 : " + victoryCondition[1][2]);
		System.out.println("7행 2열의 값 : " + victoryCondition[6][1]);

		System.out.println("==========================================================");
		boolean[] winFlag={false,false,false};
		System.out.println("boolean형 배열 winFlag의 1번째 칸의 값 : " + winFlag[0]);		
		System.out.println("boolean형 배열 winFlag의 2번째 칸의 값 : " + winFlag[1]);		
		System.out.println("boolean형 배열 winFlag의 3번째 칸의 값 : " + winFlag[2]);		

		winFlag[0]=true;
		System.out.println("boolean형 배열 winFlag의 1번째 칸의 값 : " + winFlag[0]);		
	}//main end
}//class end
