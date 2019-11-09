import java.util.HashMap;
import java.util.ArrayList;

class MapTestHashMap
{
	public static void main(String[] args) 
	{
		//���� �ؽø��� ���ſ���.
		//key���� Integer / value�� String���� �Ұ̴ϴ�. 
		HashMap<Integer, String> map = new HashMap<>();

		//      <----key��---> <-------Value��----->		
		map.put(new Integer(1), new String("ȫ�浿"));
		map.put(new Integer(2), new String("��ö��"));
		map.put(new Integer(3), new String("�����"));
		System.out.println("map�� ����� ���� �Ʒ��� �����ϴ�.");
		System.out.println(map);
		System.out.println("");

		System.out.println("1�� Ű�� value�� ��â������ �ٲ㺾�ô�.");
		System.out.println("�Ȱ��� Ű���� �ִٸ� �������� �����Ǵ�, �� [����]�� �Ǵ°���.");
		map.put(new Integer(1), new String("��â��"));
		System.out.println(map);
		System.out.println("");

		System.out.println("0�� Ű, value : ���������� �߰��غ��ô�.");
		map.put(new Integer(0), new String("������"));
		System.out.println(map);
		System.out.println("");


		System.out.println("1��° Ű�� �����غ��ϴ�.");
		System.out.println(map.get(new Integer(1)));
		map.remove(new Integer(1));
		System.out.println(map);		
		System.out.println("");
		
		//----------------------------------------------------------------

		
		HashMap<String, Object> map2 = new HashMap<>();
		
		map2.put("id","abc");
		map2.put("name","ȫ�浿");
		map2.put("cart",new ArrayList<Integer>());
		map2.put("id",new Integer(10));
		//������ �ְ�, ���� ������ �����͸� ��������� ArrayList!
		//�Խ����� �� ��ϰ��� �Ȱ��� ���� �������� ��찡 ArrayList��� ����!
		//�پ��� ������ ���� �����ؾ� �� ������ ���� ���ϴٴ� ������.
	
	
	}
}
