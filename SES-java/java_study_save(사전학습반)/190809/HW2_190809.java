import java.util.Scanner;

class HW2_190809
/*
2. ���� 3���� �Է¹޾� ���� ū�� �ι�° ����° ������ �������.

   3. �¾ �ظ� �Է¹޾� �츦 ����Ѵ�(1989�� -> ���)
[����] ���س⵵�� Ȯ���� %12 ������������ Ȱ���Ͽ� �츦 Ȯ���Ѵ�.
*/
{
	public static void main(String[] args) 
	{
		int input1, input2,input3;
		int view1,view2,view3;

		System.out.println("3���� ������ �޾� ����ū������ ����մϴ�.");

		System.out.println("1��° ���� �Է��� �ּ���.");
		Scanner scan = new Scanner(System.in);
		input1= scan.nextInt();
		
		System.out.println("2��° ���� �Է��� �ּ���.");
		input2=scan.nextInt();

		System.out.println("3��° ���� �Է��� �ּ���.");
		input3= scan.nextInt();

		System.out.println("\n�Է��Ͽ� �ֽ� 3���� ���� �Ʒ��� �����ϴ�.");
		System.out.println("ù���� �� : " + input1);
		System.out.println("�ι��� �� : " + input2);
		System.out.println("������ �� : " + input3+"\n");
		//�������� ��� �ҽ��� �ٸ����� ūƲ�δ� 3���� ���� �ް� �ٷ� �� ������ �ִ� ���� ������.
			
/*

max = a ; 
if(a<b){
	if(a>c){
		//����������� a�� ¯�ΰŴ�.
		if(b>c){
			//a>b>c ������ ���� ������ �����ǰڴ�.
		}
		else{
			//a>c>b
		}
	}
	else{
	}
}
else{}


*/
		//������� ����� ���� ����
		if(input1>input2 && input1 > input3){
			view1 = input1;
			input1=-99999;
			//�񱳰� �Ϸ�Ǹ� �ش� ��ǲ�� Integer.MIN_VALUE(�ּҰ�)���� �ʱ�ȭ�Ѵ�.
		}
		else if(input2>input3){
			view1 = input2;
			input2=Integer.MIN_VALUE;
		}
		else{
			view1=input3;
			input3=-99999;
		}

		//�ι�° ����� ���� ����
		if(input1>input2 && input1>input3){
			view2 = input1;
			input1=-99999;
		}
		else if(input2>input3){
			view2 = input2;
			input2=-99999;
		}
		else{
			view2=input3;
			input3=-99999;
		}

		//����° ���� ����
		if(input2 ==-99999 && input3 ==-99999 ){
			view3 = input1;
			input1=-99999;
		}
		else if(input1 ==-99999 && input3 ==-99999){
			view3 = input2;
			input2=-99999;
		}
		else{
			view3=input3;
			input3=-99999;
		}

		System.out.println("�Է��Ͽ� �ֽ� ���� ���� ū������ �����ϸ�,");
		System.out.println(view1+","+view2+","+view3+"�Դϴ�");	

	}
}
