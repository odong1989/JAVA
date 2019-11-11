import java.awt.Frame;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Button;
import java.awt.Component;
//19.11.11. 1교시
class TypeTest3 
{
	public static void main(String[] args) 
	{
		Integer a = new Integer(100);
		Double b = new Double(1.2);
		Number c = new Integer(200);
		Object d = new Integer(300);
		// Number e  = new Boolean(true); //에러가 나기에 주석처리함.
		// Number e는 Boolean타입을 쓸수 없다. Boolean은 Number과는 동급의 이웃에 불과하기 때문에 상속받은게 없다.
		Object f  = new String("aaa");

System.out.println("Integer a = new Integer(100);");
System.out.println("Double b = new Double(1.2);");
System.out.println("Number c = new Integer(200);");
System.out.println("Object d = new Integer(300);");
System.out.println("Object f  = new String(\"aaa\");");

		System.out.print("a instanceof Integer : "); System.out.println(a instanceof Integer);
		System.out.print("a instanceof Number : ");System.out.println(a instanceof Number);
		System.out.print("c instanceof Integer : ");System.out.println(c instanceof Integer);
		System.out.print("c instanceof Number : ");System.out.println(c instanceof Number);
//		System.out.println(a instanceof Double); //에러로 처리되기에 주석처리함.
		System.out.print("d instanceof Integer : ");System.out.println(d instanceof Integer);
		System.out.print("d instanceof String : ");System.out.println(d instanceof String);
		System.out.println("--------------------------------------------------");


		//연습문제1. 아래의 변수들이 상속관계인지 확인하세요.
		Frame	  g	= new Frame();
		Container h = new Dialog(g);
		Button	  i = new Button();
		Component j = new Frame();

		System.out.print("g instanceof Container : ");	System.out.println(g instanceof Container);
		System.out.print("h instanceof Dialog : ");		System.out.println(h instanceof Dialog);
//		System.out.println(i instanceof Container);//
		System.out.print("j instanceof Container : ");	System.out.println(j instanceof Container);
		System.out.print("j instanceof Frame : ");		System.out.println(j instanceof Frame);
		System.out.print("j instanceof Button : ");		System.out.println(j instanceof Button);

	//1교시 종료----------------------------------------------------------------------------------
	}
}
