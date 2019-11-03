import java.util.Scanner;
/*
1. 상품 가격을 입력받아 현금으로 최소한의 화폐개수로 지불할 수 있도록 계싼한다
        (예) 가격 : 3600원
            [결과]
            50000원 0장
            10000원 0장
              5000원 0장
              1000원 3장
                500원 1장
                100원 1장
                  50원 0장
                  10원 0장
*/
class HW1_190809
{
	public static void main(String[] args) 
	{
/*.선생님의 경우
int price, n50, n10, n5, n1, rest;
//rest : temp_saver

System.out.print("price input : ");
price = input.nextInt();

rest = price;
n50=rest/ 50000;
rest = rest % 50000;
n10=rest/ 10000;
rest = rest % 10000;
n5=rest/ 5000;
rest = rest % 5000;
n1=rest/ 1000;
rest = rest % 1000;

System.out.print(price + "원은 ");
System.out.print("5만원권 "+ n50 + "장, ");
System.out.print("1만원권 "+ n10 + "장, ");
System.out.print("5원권 "+ n5 + "장, ");
System.out.print("1원권 "+ n1 + "장 ");

(이하 밑부분은 못적음. 다만 if문으로 0장인 현금권은 출력않는 것으로 설정)
*/
		
		
		int price;
		int cnt_50000won=0, cnt_10000won=0,
			cnt_5000won=0,cnt_1000won=0,
			cnt_500won=0,cnt_100won=0,
			cnt_50won=0,cnt_10won=0;

		System.out.println("상품의 가격에 따른 최소현금 장수 계산입니다.");
		System.out.println("금액을 입력해주세요.");

		Scanner input_price = new Scanner(System.in);
		price = input_price.nextInt();
		System.out.println("상품의 가격은"+price+"입니다.");

		if(price > 0){

			cnt_50000won=price/50000;
			price= price-(50000*cnt_50000won);			
			System.out.println("50000원 권은 "+ cnt_50000won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_10000won = price/10000;
			price= price-(10000*cnt_10000won);
			System.out.println("10000원 권은 "+ cnt_10000won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_5000won = price/5000;
			price= price-(5000*cnt_5000won);
			System.out.println("5000원 권은 "+ cnt_5000won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_1000won = price/1000;
			price= price-(1000*cnt_1000won);
			System.out.println("1000원 권은 "+ cnt_1000won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_500won = price/500;
			price= price-(500*cnt_500won);
			System.out.println("500원 권은 "+ cnt_500won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_100won=price/100;
			price= price-(100*cnt_100won);
			System.out.println("100원 권은 "+ cnt_100won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_50won=price/50;
			price= price-(50*cnt_50won);
			System.out.println("50원 권은 "+ cnt_50won +"장입니다.");
//		System.out.println("상품의 가격은"+price+"입니다.");

			cnt_10won=price/10;
			price= price-(10*cnt_10won);
			System.out.println("10원 권은 "+ cnt_10won +"장입니다.");


//		System.out.println("상품의 가격은"+price+"입니다.");

/*			 System.out.println("계산을 시작합니다.");
			cnt_50000won=price/50000;
			if(cnt_50000won>0){
				price= price-(50000*cnt_50000won);
				System.out.println("50000원 권은 "+ cnt_50000won +"입니다.");
			}
			else if( (cnt_10000won=price/10000) >0){
			cnt_10000won=price/10000;
				price= price-(10000*cnt_10000won);
				System.out.println("10000원 권은 "+ cnt_10000won +"입니다.");
			}
			/*
			else if(cnt_50000won>0){
				price= price-(50000*cnt_50000won);
				System.out.println("50000원 권은 "+ cnt_50000won +"입니다.");
			}
			else if(cnt_50000won>0){
				price= price-(50000*cnt_50000won);
				System.out.println("50000원 권은 "+ cnt_50000won +"입니다.");
			}
			else if(cnt_50000won>0){
				price= price-(50000*cnt_50000won);
				System.out.println("50000원 권은 "+ cnt_50000won +"입니다.");
			}
			*/

		}
		else{
			System.out.println("입력오류입니다.");
		}
	}
	
}
