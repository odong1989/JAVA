/* 11�� 13�� �������̴�.
 * StudentTest191113 ���� �̸��� �������� classStudent��Ű���� ��ġ������ �̸��� ������ �����̴�.
 * 
 * */
package study191113;

import java.util.ArrayList;

public class StudentTest191113 {
	
	public static void main(String[] args) 
	{
		Student a = new Student();
		Student b = new Student(new String("��"),92,90,90);		
		Student c = new Student(new String("ȫ"),92,90,90);	
		
		
		System.out.println(b);//"�� 92 90 90"������ ���� ����� �� �־�! 
		/*StudentŬ�������� ������Ʈ Ŭ�������� �⺻������ ��ӹ޴�
		 * public String toString()�޼ҵ带 ������ ���̱⿡ ��������������.
		 * �ȱ׷��� ��ó�� �޸��ּҸ� ������.
		 */
		System.out.println(b==c);//�̰Ŵ� 

		System.out.println("b�л��� c�л��� �̸��� �������������� ��� �Ȱ�����? : " + b.equals(c));
		//[����]���߿� ���� ������ ��! �������̵��Ȱ����� �ؾ� �մϴ�!
		//StdudentŬ�������� �������̵�(Ʃ��)�� �ǽ��Ͽ���.�ȱ׷��� �ּҰ��񱳷� �ؼ� ������ False�� ���´�.
		
		System.out.printf("%3.2f \n",b.getAvg());	
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("��",10,10,10));
		list.add(new Student("��",10,10,10));		
		System.out.println(list);	
		
		
	}
}