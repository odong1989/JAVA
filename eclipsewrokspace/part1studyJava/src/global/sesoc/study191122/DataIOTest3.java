package global.sesoc.study191122;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class DataIOTest3  {
	public static void main(String[] args) throws Exception{
		ArrayList<Data> list =new ArrayList<>();
		list.add(new Data("��", 10 ,"����"));
		list.add(new Data("��", 20 ,"����"));
		
		//��ü ����
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStrea("list.dat"));
		out.defaultWriteObject(list);
		out.close();
		
		//��ü �б�
		ObjectInputStream in =new 
		
		
		
		
	}
	
}

