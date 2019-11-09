import java.util.HashMap;
import java.util.ArrayList;

class MapTestHashMap
{
	public static void main(String[] args) 
	{
		//저는 해시맵을 쓸거에요.
		//key값은 Integer / value는 String으로 할겁니다. 
		HashMap<Integer, String> map = new HashMap<>();

		//      <----key값---> <-------Value값----->		
		map.put(new Integer(1), new String("홍길동"));
		map.put(new Integer(2), new String("박철민"));
		map.put(new Integer(3), new String("김숙희"));
		System.out.println("map에 저장된 값은 아래와 같습니다.");
		System.out.println(map);
		System.out.println("");

		System.out.println("1번 키의 value를 최창식으로 바꿔봅시다.");
		System.out.println("똑같은 키값이 있다면 기존값은 삭제되는, 즉 [변경]이 되는거죠.");
		map.put(new Integer(1), new String("최창식"));
		System.out.println(map);
		System.out.println("");

		System.out.println("0번 키, value : 정복동으로 추가해봅시다.");
		map.put(new Integer(0), new String("정복동"));
		System.out.println(map);
		System.out.println("");


		System.out.println("1번째 키를 삭제해봅니다.");
		System.out.println(map.get(new Integer(1)));
		map.remove(new Integer(1));
		System.out.println(map);		
		System.out.println("");
		
		//----------------------------------------------------------------

		
		HashMap<String, Object> map2 = new HashMap<>();
		
		map2.put("id","abc");
		map2.put("name","홍길동");
		map2.put("cart",new ArrayList<Integer>());
		map2.put("id",new Integer(10));
		//순서가 있고, 같은 종류의 데이터를 갖고오려면 ArrayList!
		//게시판의 글 목록같은 똑같은 것이 여러개인 경우가 ArrayList라는 거죠!
		//다양한 종류의 값을 저장해야 할 때에는 맵이 편하다는 것이죠.
	
	
	}
}
