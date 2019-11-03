import java.util.Scanner;

class HW2_190809
/*
2. 정수 3개를 입력받아 가장 큰수 두번째 세번째 순으로 정렬출력.

   3. 태어난 해를 입력받아 띠를 출력한다(1989년 -> 뱀띠)
[조언] 기준년도를 확인후 %12 나머지연산을 활용하여 띠를 확인한다.
*/
{
	public static void main(String[] args) 
	{
		int input1, input2,input3;
		int view1,view2,view3;

		System.out.println("3개의 정수를 받아 가장큰값부터 출력합니다.");

		System.out.println("1번째 값을 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		input1= scan.nextInt();
		
		System.out.println("2번째 값을 입력해 주세요.");
		input2=scan.nextInt();

		System.out.println("3번째 값을 입력해 주세요.");
		input3= scan.nextInt();

		System.out.println("\n입력하여 주신 3개의 값은 아래와 같습니다.");
		System.out.println("첫번쨰 값 : " + input1);
		System.out.println("두번쨰 값 : " + input2);
		System.out.println("세번쨰 값 : " + input3+"\n");
		//선생님의 경우 소스는 다르지만 큰틀로는 3개의 값을 받고 바로 각 변수에 넣는 점은 동일함.
			
/*

max = a ; 
if(a<b){
	if(a>c){
		//여기까지오면 a가 짱인거다.
		if(b>c){
			//a>b>c 순으로 값의 순서가 결정되겠다.
		}
		else{
			//a>c>b
		}
	}
	else{
	}
}
else{}


*/
		//가장먼저 출력할 숫자 결정
		if(input1>input2 && input1 > input3){
			view1 = input1;
			input1=-99999;
			//비교가 완료되면 해당 인풋을 Integer.MIN_VALUE(최소값)으로 초기화한다.
		}
		else if(input2>input3){
			view1 = input2;
			input2=Integer.MIN_VALUE;
		}
		else{
			view1=input3;
			input3=-99999;
		}

		//두번째 출력할 숫자 결정
		if(input1>input2 && input1>input3){
			view2 = input1;
			input1=-99999;
		}
		else if(input2>input3){
			view2 = input2;
			input2=-99999;
		}
		else{
			view2=input3;
			input3=-99999;
		}

		//세번째 숫자 결정
		if(input2 ==-99999 && input3 ==-99999 ){
			view3 = input1;
			input1=-99999;
		}
		else if(input1 ==-99999 && input3 ==-99999){
			view3 = input2;
			input2=-99999;
		}
		else{
			view3=input3;
			input3=-99999;
		}

		System.out.println("입력하여 주신 값은 가장 큰값부터 정렬하면,");
		System.out.println(view1+","+view2+","+view3+"입니다");	

	}
}
