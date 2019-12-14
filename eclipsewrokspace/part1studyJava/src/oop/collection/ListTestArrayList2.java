package global.sesoc.oop.collection;

import java.util.Scanner;
import java.util.ArrayList;

class ListTestArrayList2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> slist = new ArrayList<>();
		String n;
		int k,e,m;	

		while(true) {
			System.out.print("이   름 : ");	
			n = scan.next();
			System.out.print("국어점수 : ");	
			k = scan.nextInt();
			System.out.print("영어점수 : ");	
			e = scan.nextInt();
			System.out.print("수학점수 : ");	
			m = scan.nextInt();	
			
			slist.add(new Student(n,k,e,m));
			System.out.print("계속 입력하시겠습니까?(y/n)");
			if(scan.next().equalsIgnoreCase("n")){
				break;	
			}
		}

//상속을 이용하여 진행하게 됩니다.
		System.out.println(slist);//이렇게 하면 저장된 메모리 주소값을 알려준다. 우리가 원하는게 나오는게 아니죠.
		System.out.print(slist.get(0).getName());
		System.out.print(slist.get(0).getKor());
		System.out.print(slist.get(0).getEng());
		System.out.print(slist.get(0).getMath());
		Student s = new Student("홍길동", 100, 100,100);
		
		
//		System.out.println(slist.indexOf(s));
	//배열의 사이즈, 3번째 셀 삭제등 해보세요.


	}

}