//SES java Book 253page

public class ConstructorSuperTest{
	public static void main(String[] args){
		Student student = new Student("ö��",10,"12345");

		System.out.println();
	}
}

class Student extends Person
{
	private String no;

	public Student(String name, int age, String n){
		super(name,age); //�θ�Ŭ������ �����ڸ� ȣ���Ѵ�.
		no=n;
	}
}

class Person 
{
	private String name;
	private int age;

	public Person(String name,int age){
	name = name; age=age;
	}

}




