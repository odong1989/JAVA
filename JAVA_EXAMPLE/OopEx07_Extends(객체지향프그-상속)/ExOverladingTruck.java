//SES JAVA BOKK 263page

public class ExOverladingTruck
{
	private static final String DEFAULT_COLOR = "White";
	private int numberOfWheel;
	private double maxLoad;
	private double weight;
	private String color;

	//생성자 오버로딩(동명의 생성자가 여러개있는 것/파라미터로 구별한다.
	
	//생성자-1번 파라미터 4개 모두 사용.
	public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight, String color){
		this.numberOfWheel = numberOfWheel;
		this.maxLoad = maxLoad;
		this.weight = weight;
		this.color = color;
	}

	//생성자-2번 파라미터가 3개로 String color를 제외함.
	public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight){
		this(numberOfWheel, maxLoad, weight, DEFAULT_COLOR );
		// 파라미터 4개 모두 사용하는
		//public ExOverladingTruck(int numberOfWheel, double maxLoad, double weight, String color){
		//생성자-1번를 호출하였다. 없는 색깔은 기본값으로 채웠음.
	}
}