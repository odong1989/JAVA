/*
	참고서적 : SES 자바 자바책 151페이지
*/
class VarArgsTest
{
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		va.checkVars(1);
		va.checkVars2(1,2,3,4,5);	
		va.checkVars();		
	}
}
