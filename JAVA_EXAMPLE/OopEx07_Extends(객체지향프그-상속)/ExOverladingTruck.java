//SES JAVA BOKK 263page

public class ExOverladingTruck
{
	private static final String DEFAULT_COLOR = "White";
	private int numberOfWheel;
	private double maxLoad;
	private double weight;
	private String color;

	//������ �����ε�(������ �����ڰ� �������ִ� ��/�Ķ���ͷ� �����Ѵ�.
	
	//������-1�� �Ķ���� 4�� ��� ���.
	public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight, String color){
		this.numberOfWheel = numberOfWheel;
		this.maxLoad = maxLoad;
		this.weight = weight;
		this.color = color;
	}

	//������-2�� �Ķ���Ͱ� 3���� String color�� ������.
	public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight){
		this(numberOfWheel, maxLoad, weight, DEFAULT_COLOR );
		// �Ķ���� 4�� ��� ����ϴ�
		//public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight, String color){
		//������-1���� ȣ���Ͽ���. ���� ������ �⺻������ ä����.
	}
}