/*
	��ó : SES �ڹ�å 159������
*/

class staticMethodTest{
	public static void main(String[] args){
		staticMethod st = new staticMethod();	
		st.go();

		//main�޼ҵ忡�� �ٷ� ������ �� �ִ�.
	 	staticMethod.goStatic();

		//�Ұ��ɻ���1 - go()�� ��ü�� �������� ������ ���� ����.
		//System.out.println(go());


		//�Ұ��ɻ���2 - static int goStatic()�� this�� ���� ������ �Ұ����ϴ�.
		//System.out.println(this.i);
	}



}