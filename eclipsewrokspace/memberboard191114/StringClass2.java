//SES java book 209page

public class StringClass2{
	public static void main(String[] args) 
	{
		String str = "hello";
		System.out.println("str : " + str);
		System.out.println("Length : " +str.length());

		System.out.println("str.replace('h','H') : " + str.replace('h','H'));
		System.out.println("str : " + str);
		System.out.println("str.substring(2)     : " + str.substring(2));
		System.out.println("str.substring(2,4)   : " + str.substring(2,4));		
		System.out.println("str.indexOf(\"he\")  : " + str.indexOf("he"));
		System.out.println("str.indexOf(\"he\",1) : " + str.indexOf("he",1));
		System.out.println("str.indexOf('o') : " + str.indexOf('o'));

		System.out.println("str.lastIndexOf(\"1\") : " + str.lastIndexOf("1"));
		System.out.println("str.lastIndexOf('1',2) : " + str.lastIndexOf('1',2));
		System.out.println("str.lastIndexOf('1',1) : " + str.lastIndexOf('1',1));

		System.out.println("korea?".compareTo("korea!"));		
		System.out.println("Apple".compareTo("apple"));		
		System.out.println("���ѹα�".compareTo("���ѹα�"));
	}
}
