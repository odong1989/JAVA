package global.sesoc.javaoopstudy.student;

//����� ���� �ڷ���(Value Object)
//�����ϳ��� ǥ���ϴ� �ڷ����Դϴ�.
//���谡 ���� �� �ٷ� ���� ���۵Ǵ� �� �� �ϳ��Դϴ�.

class StudentVer2Capsure//���赵&�Ӽ�(����)�� �����ϴ� ����
{
	/*             ��ü
		�ͼӼ�(����)	|	���ൿ(�޼ҵ�)
	----------------��-------------------------
		1) �̸�		|
		2) �й� 		|
		3) �����	|
		4) �����	|
		5) ���м���	|
	*/

	
	//�ͼӼ� = ����(�������, �ʵ�)	
	//���漺����   : <-������-----------------------------������->
	//����㰡���� :    �㰡       �㰡          �㰡    |   ���㰡
	//����������   : (public > protected > (default) > private)
	

	//ĸ��ȭstep1.private�� �����Ͽ� ������ �����մϴ�. 
	//�ͼӼ� = ����(�������, �ʵ�)	�� �����մϴ�.
	private String name;
	private int kor;
	private int eng;
	private int math;
	/*final�� ���� �ȵǳ���?
	  1���� �Է¹ް� ��ĥ���� ����.
	  final�� ������ �ٲܼ� ���� ������������ ��쿡 Ȱ���մϴ�.
	*/
	/*	String name;�� public String name;�ΰ���?
		�ƴմϴ�.
	default String name;�� ���ĸ�Ī�ε� default�� �����ص� �Ǽ�
	���ݱ��� String name;���� �ۼ��ص� �����۵� �Ȱ�����.
	*/



	//�α�� = �޼ҵ�
	//����ڵ��� view�� ���ϰ� �ϱ����� ��±���� ������ �Ͽ���.
	public void printST(){
	System.out.println(this.name + this.kor+ this.eng + this.math);
/*this�� �Ƚᵵ ����� ������, �� ��� �ϳ���?
=>�������ġ�� ���������� ������ �򰥸��� ��ó��,
  SQL���� �����ϴ� ���� �����Ͽ� �����ϴ� ��ó��
  �����ϳ��� ������ ������ �����Ǿ� ��ǻ�Ͱ� �򰥸� ���� �ִ� ��츦 ������ ����ϴ� ���Դϴ�.
  ���⼭ �� ��ü(this)�� 
  �ε��Ͽ� Ȱ���ϴ� StudentTest�� Student�� ������ �����ϴ� ������ ����ŵ�ϴ�.
*/
	}


	//���� ���� �޼ҵ��	
	public void setKor(int inputKor)
	{
	//ĸ��ȭStep2. ���� �Է��ϴ� ����� �޼ҵ带 ���ϴ� ������ ������ �Ͽ����ϴ�.
	//�̷�
		if(inputKor < 0 || inputKor > 100)
		{
			return;
		}
	
		this.kor = inputKor;
	}

	public int getKor(){
		return this.kor;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}
	//���� ���� �޼ҵ�� ����


	//���� ���� �޼ҵ�
	public void setEng(int inputEng)
	{
	//ĸ��ȭStep2. ���� �Է��ϴ� ����� �޼ҵ带 ���ϴ� ������ ������ �Ͽ����ϴ�.
	//�̷�
		if(inputEng < 0 || inputEng > 100)
		{
			return;
		}
	
		this.eng = inputEng;
	}


	public int getEng(){
		return this.eng;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}
	//���� ���� �޼ҵ� ����



	//���м����޼ҵ�
	public void setMat(int inputMat)
	{
	//ĸ��ȭStep2. ���� �Է��ϴ� ����� �޼ҵ带 ���ϴ� ������ ������ �Ͽ����ϴ�.
	//�̷�
		if(inputMat < 0 || inputMat > 100)
		{
			return;
		}
	
		this.math = inputMat;
	}
		
	public int getMat(){
		return this.math;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}

	
	public int getTotal(){
		return (this.kor + this.eng + this.math);
	}	





	/* �ڷ����� ������ �⺻�����Ǵ� main�޼ҵ�� �ʿ䰡 �����ϴ�.
	   �����Ű���� ������ �ƴϴϱ��.
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	*/
}
