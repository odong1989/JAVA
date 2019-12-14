package global.sesoc.study191122;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class DataIOTest3  {
	public static void main(String[] args) throws Exception{
		ArrayList<Data> list =new ArrayList<>();
		list.add(new Data("±è", 10 ,"±¤ÁÖ"));
		list.add(new Data("¹Ú", 20 ,"¼­¿ï"));
		
		//°´Ã¼ ÀúÀå
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStrea("list.dat"));
		out.defaultWriteObject(list);
		out.close();
		
		//°´Ã¼ ÀÐ±â
		ObjectInputStream in =new 
		
		
		
		
	}
	
}

