//1.�ۺ� Ŭ������ 1���� ���� �֤����!
//2.�� �ڹ� ������ ���� �ۺ�Ŭ������ �̸����� �ؾ� �ճ���.
//3.�ڹ� ������ 1�������� Ŭ���� ������ 3���� ����������!
//  (#������ ������ ����)

//������� ���� : InheritTest.java
class A 
{
	public int num = 1;
	//Constructors
	public A(){ System.out.println("AŬ������ �������Դϴ�."); }

	//Method
	public void print() { System.out.println("AŬ������ �޼ҵ��Դϴ�."); }
}

class B extends A{
	public B(){ System.out.println("BŬ������ �������Դϴ�."); }
	public void bMethod(){ System.out.println("BŬ������ bMethod() �޼ҵ��Դϴ�."); }

	//�������̵�(��ӹ��� ���� �ٽ� �����ϴ� ��)�� �ǽõǾ���.
	public int num = 2;
	public void print(){ System.out.println("BŬ������ print() �޼ҵ��Դϴ�. �������̵��� ����Ǿ�����."); }
}

class C extends A{ 
	public int num = 3;
	public C(){ System.out.println("CŬ������ �������Դϴ�."); }
	public void cMethod(){ System.out.println("CŬ������ cMethod() �޼ҵ��Դϴ�."); }

}