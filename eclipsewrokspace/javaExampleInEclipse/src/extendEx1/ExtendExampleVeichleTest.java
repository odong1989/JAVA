package extendEx1;

public class ExtendExampleVeichleTest extends ExtendExampleVeichle{
	public static void main(String[] args) {
	ExtendExampleVeichle testCar = new ExtendExampleVeichle();
	Truck testCar2 = new Truck(4,4,4);
	
	testCar.start();
	
	testCar2.start();
	
	}
}
