class DataTypeTest 
{
	public static void main(String[] args) 
	{
		int a;
		short b;
		long c;
		float d;
		double e;
		char f;
		boolean g;
		String s;

		a= 111;
		b= 30000;
		c= 1000000000000L;
		//Long莫 雌呪脊艦陥. 虞澗 税耕戚陥.
		/*LONG莫 戚虞壱背亀 摺幻背辞澗 int莫生稽 坦軒馬形壱 廃陥.
		  聡, 1000000000000戚 long戚 坦軒拝 呪 赤澗 葵戚嬢亀
		  陳戚 鈷企稽 int莫生稽 坦軒馬形壱 馬奄拭 拭君亜 貝陥.
		  益掘辞 瑛諾焼亀 収切魁拭 'L'聖 細食辞 
		  "戚 収切澗 巷繕闇 LONG莫生稽 坦軒馬虞"澗 悪薦戚陥.
		*/
		e = 1.0;
		e = 1/23e2;
		d = 1.5f;

		f='A';
		System.out.println(f);
		f=65;
		System.out.println(f);
		f = '\u0041'; //16遭呪稽 65虞澗 坪球戚陥.
		System.out.println(f);

		f=10;//10腰精 鯵楳坪球戚陥. 聡 鯵楳坦軒 吉陥. 
				//戚什追戚覗 庚切稽 企重 弦戚廃陥. 析鋼収切10生稽 神背馬奄 疏焼辞...

		f='\n';//戚什追戚覗 庚切稽 鯵楳聖 走獣梅陥. 
		System.out.println(f);

		s="せせせ \n せせせせ";
		System.out.println(s);

		s="abc\nde\tfg";//\n:鯵楳, \t:吐(食君牒 因拷)
		System.out.println(s);

		s="井稽澗 c:\\newdir\\test 脊艦陥.";// 据掘澗 c:\newdir\test 戚走幻 戚什追戚覗庚切稽 神背廃陥
		System.out.println(s);
		
		a = 1;
		f= '1';
		s="1";
		System.out.println(a+1);//舘授廃 収切域至
		System.out.println(f+1);//'1'税 政艦坪球 49拭 1聖 希梅陥. 
										  // char莫(65000妊薄) + int莫昔汽  int亜 妊薄勲戚 希 滴艦
										  //int莫生稽 域至馬食 収切稽 坦軒鞠醸陥.
		System.out.println(s+1);//袷 紺鯵税 庚切亜 奄託牒坦軍 細精 暗.

		g = true;
		g = false;
		g = a>1;

		System.out.println(g);

//		System.out.println(a);
//		System.out.println(b);		
//		System.out.println("Hello World!");
	}
}
