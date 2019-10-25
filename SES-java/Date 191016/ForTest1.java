        //① 0 1 2 3 4
        //② 1 2 3 4 5
        //③ 5 4 3 2 1
        //④ 10 20 30 40 50
        //⑤ 1 3 5 7 9
        //⑥ 1 2 3 4   6 7 8 9 (for2번 활용)
        //⑦ 1 2 3 4   6 7 8 9(if문 하나써서 for1개만 사용)
        //⑧ 1 2 3 4   6 7 8 9(continue를 활용하여 숫자5일 경우 통과시키는 방법도 있다!)
        //⑨ 1 2 3 4   6 7 8 9(break는 아쉽지만 5이후는 못하지. 탈출이라...)
        //⑩ 1 2 3 4   6 7 8 9(System.exit를 활용하여 완전종료. 5이후는 진행 못한다.)
        //⑪ 1 2 3 4    6 7 8 9(return;을 활용한 메소드종료. 5이후는 진행못함.)
        //⑫ 1 10 100 1000 10000


//

class ForTest1
{
    public static void main(String[] args)
    {

        //① 0 1 2 3 4
        for(int i = 0; i<5; i++) //for_1
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        


/* 위의 진행을 흐름디버깅표(가제)
   
for_1의 진행디버깅          
  ___|_i_|__T/F__|_ print__|_________
     | 0 | TRUE  |    0    |
     | 1 | TRUE  |    1    |
     | 2 | TRUE  |    2    |
     | 3 | TRUE  |    3    |
     | 4 | TRUE  |    4    |
     | 5 | FALSE |  (종료)  |

[?]프로그램 진행순서도 등을 만들때
   위와 같이 정리해서 표기합니까?
[선생님 답변] 그러지는 않는다.

*/

    
        //② 1 2 3 4 5
        for(int i = 1; i<=5; i++)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        


        //③ 5 4 3 2 1
        for(int i = 5; i > 0; i--)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //④ 10 20 30 40 50
        for(int i = 10; i<=50; i+=10)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //⑤ 1 3 5 7 9
        for(int i = 1; i<=9; i=i+2)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //⑥ 1 2 3 4 6 7 8 9 (for2번 활용)
        for(int i = 1; i<=4; i++)
        {
            System.out.print(i +" ");
        }
        for(int i = 6; i<=9; i++)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        

        //⑦ 1 2 3 4 6 7 8 9(if문 하나써서 for1개만 사용)
        for(int i = 1; i<=9; i++)
        {
            if(i!=5)
            System.out.print(i +" ");
        }
            System.out.println(" ");        
 
   //(잠시 쉬는 시간)------------------------------------------------------------------------------------------------------------------------------------

        //⑧ 1 2 3 4 6 7 8 9(continue를 활용하여 숫자5일 경우 통과시키는 방법도 있다!)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
            continue; //반복문을 종료시키지는 않지만 출력은 않는 셈이 된다.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        
        
        //⑨ 1 2 3 4   6 7 8 9(break는 아쉽지만 5이후는 못하지. 탈출이라...)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
            break; //반복문을 종료시키지는 않지만 출력은 않는 셈이 된다.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        

        //⑩ 1 2 3 4 6 7 8 9( System.exit를 활용하여 완전종료)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
//            System.exit(0); //프로그램을 완전종료시킨다.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        

        //⑪ 1 2 3 4 6 7 8 9(return;을 활용한 종료)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
 //           return; //정확히는 메소드 한개만 종료지 프로그램 자체의 종료는 아니다.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        


    //------------------------------------------------------------------------------------------------------------------------------------

        //⑫ 1 10 100 1000 10000
        for(int i = 1; i<=10000; i*=10)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    
    }
}
