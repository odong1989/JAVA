//ArrayList����1
//SES�ڹ�å 303������ 

public class StudentArrayTestEX
{
	//Step1. ��������
	private String name;
	private double score;

	//Step2. ������ ����
	public StudentArrayTestEX(String name, double score){
		this.name = name;
		this.score = score;
	}
	public StudentArrayTestEX(){}//������ �⺻��. ������ �������� �ʿ��� �߰��س־���.

	//Step3. �޼ҵ�
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getScore(){
		return score;
	}

	public void setScore(double score){
		this.score = score;
	}


}
