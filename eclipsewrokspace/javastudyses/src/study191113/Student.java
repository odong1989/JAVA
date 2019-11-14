/* 11�� 13�� �������̴�.
 * Student���� �̸��� �������� classStudent��Ű���� ��ġ������ �̸��� ������ �����̴�.
 * 
 * */

package study191113;//start first



public class Student// Student ������ extends, implements�� �ü� �ֽ��ϴ�!
{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
		
	public double getAvg() {
		double avg = getTotal()/3.0; 	
		return avg;	
	}

	//Object Ŭ���������״�� �����´�.
	@Override //toString()�� �������̵��ϰ� �ִ�. �����Ϸ��� �������̵��Ǵ��� Ȯ���ض�~ ��� ����̴�.
	//System.out.printf("%3.2f \n",b.getAvg());	, System.out.println(list);
	//�� ���� ������¿��� ���ȴ�. ��ɵ ����ȴ�.
	public String toString() //�������̵��� �ǽ��ߴٰ� �Ҽ� ������
	{
		String output=name +" "+ kor +" "+ eng + " "+ math ;
		return output;
	}
	
	
	
	
	
	/*[tip]�����ϴ� �Ǽ��ø��� - �������̵��� �޼ҵ� ���� ��ҹ��� �Ǽ��� �ٲ� ���
	 * public String tostring() //�ڹٴ� �������̵��� �ƴ϶�, tostring()�̶�� �޼ҵ尡 ���� �����Ǿ���!��� �����ϰ� ����. 
		{
		String output=name +" "+ kor +" "+ eng + " "+ math ;
		return output;
		}
		
		�����Ͻ� ������ ������ �ʾƼ� ��ġ ������ ����.
	
		[tip]@Override��� �־�θ� 
			"�����Ϸ���, ���� �������̵��� �ϰ� �ִµ� �����Ϸ��� üũ����"
			�ϰԵȴ�.
		    ��Ŭ���������� 
	 * */
	

	//Object Ŭ���������״�� �����´�.
	public boolean equals(Object obj)
	{//����Ŭ���������� ����� ����? �̷����� Ȯ���� �������� ���� �޼ҵ������ �����Դ�.
	 //��ó�� ������ �޼ҵ带 �������̵�(Ʃ��)�� ������ �ڽ��� ���ؾ� �Ѵ�.
	 //���� �������̵� �ϴ� ������ ������ �޼ҵ带 �״�� ����ϸ�
	 //���α׷��Ӱ� ���ϴ� �����񱳰� �ƴ�, �����ϰ� �ּҰ��񱳸� �ϴϱ� ���� ���⿡ Ʃ���� �ϴ� ���̴�.
		
		
	 // this�� ����Ű�� ��ü�� 
		if(!(obj instanceof Student))//�Ķ���� ���� ��ü���� �´����� Ȯ���Ѵ�.
		{
			return false;//�Էµ��ڷᰡ ������ ���� �������� ������ false�� ��¥�ؾ��ϴϱ�.
		}
		
		Student st = (Student) obj; //��ü�� 1�����̰� obj�� ����Ű�ٰ� st��� ���̰� �Բ� ����Ű�� �Ǵ� ��������.
		//�� ������ 2���� 1���� ����Ű�� �ϳİ��? 
		//�����ϰ� st��� ���� �� �����ϱ��(#ª�� ����ʹٸ� �̷��� ����� Ȱ���� ����� �����)
		
		/*������� ������ Ȯ���ϰ� ���� ����� �ڵ�---------------------------------
		if(this.kor == st.kor)
		//if(this.kor == ((Student)obj).kor)�� ����!
		{
			return true;
		}
		
		else {
			return false;
		}
		������� ������ Ȯ���ϰ� ���� ����� �ڵ�����---------------------------------*/
	
		//�̸����� ������ �������� ��� �Ȱ����� Ȯ���ϰ�;��
		if(this.name.contentEquals(st.name) && this.kor == st.kor && this.eng == st.eng && this.math == st.math)
		//if(this.kor == ((Student)obj).kor)�� ����!
		{
			return true;
		}
		
		else {
			return false;
		}
	
	
	}
	
}
