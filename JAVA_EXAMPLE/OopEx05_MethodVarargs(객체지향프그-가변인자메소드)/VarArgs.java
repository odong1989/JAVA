/*
	참고서적 : SES 자바 자바책 151페이지
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


	/*책에서 "가변인자의 선언은 정의하는 한번만 가능하며 항상 매서드의 마지막 매개변수여야 한다"는 조건이
	  여러개의 메소드가 중복이면 안되는 것인지 확인해보다.
	  메소드의 파라미터 선언시 주의하라는 멘트로 확인되었다.*/
	


	void checkVars3(int notError, int... vars){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}


	/*
	//가변인자 int... vars의 뒤에 int error라는 int변수가 있기에
	//"가변인자의 선언은 항상 메서드의 마지막 매개변수를 써야한다"는 법칙을 위배해서 에러로 처리된다.
	void checkVarsError(int... vars, int error){
		for(int i = 0; i<vars.length; i++)
		{
			System.out.println(vars[i]);			
		}
			System.out.println("-------checkVars END----------");					
	}
	*/


}



