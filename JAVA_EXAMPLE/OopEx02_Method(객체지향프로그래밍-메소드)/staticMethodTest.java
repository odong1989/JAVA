/*
	��ó : SES �ڹ�å 159������
	staticMethodŬ������ ���� �δ� ���� �����ϰ� �ǽ�.
*/

class staticMethodTest{
	public static void main(String[] args){
		staticMethod st = new staticMethod();	 
		st.go();

		//main�޼ҵ忡�� �ٷ� ������ �� �ִ�.
		staticMethod.goStatic();
		goStatic();
		System.out.println(goStatic());

		//�Ұ��ɻ���1 - go()�� ��ü�� �������� ������ ���� ����.
		//System.out.println(go());


		//�Ұ��ɻ���2 - static int goStatic()�� this�� ���� ������ �Ұ����ϴ�.
		//System.out.println(this.i);
	}



}