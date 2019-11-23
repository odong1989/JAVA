//SES Java Book 138page
//객체의 생성과 초기화
public class Book{
	//1.변수 선언
	String title;
	int page;
	int price;
	
	//2.생성자
	//#생성자 언급예제인데 생성자가 없는지는 의문.
	//어차피 없으면 자바측에서 암묵적으로 생성자 해주긴하지만
	//생성자를 설정않았으므로
	//public Book(){
	//}
	//를 자바가 스스로 만들어서 처리한 셈이다.
	
	public String getTitle(){
		retrun title;
		//좀더 확실히 하고프면 this.title식으로 this 사용.
	}

	public void setTitle(String bookTitle){
		title=booktitle;
	}
	
	public int getPage(){
		return page;
	}
	
	public void setPage(int bookPage){
		page=bookPage
	}
	
	public int getPrice(){
		return price;
	}

	public void setPrice(int bookPrice){
		price=bookPrice;
	}

	//public static void main(String[] args) 
	//{
	//	System.out.println("Hello World!");
	//}
}
