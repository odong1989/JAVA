        //�� 0 1 2 3 4
        //�� 1 2 3 4 5
        //�� 5 4 3 2 1
        //�� 10 20 30 40 50
        //�� 1 3 5 7 9
        //�� 1 2 3 4   6 7 8 9 (for2�� Ȱ��)
        //�� 1 2 3 4   6 7 8 9(if�� �ϳ��Ἥ for1���� ���)
        //�� 1 2 3 4   6 7 8 9(continue�� Ȱ���Ͽ� ����5�� ��� �����Ű�� ����� �ִ�!)
        //�� 1 2 3 4   6 7 8 9(break�� �ƽ����� 5���Ĵ� ������. Ż���̶�...)
        //�� 1 2 3 4   6 7 8 9(System.exit�� Ȱ���Ͽ� ��������. 5���Ĵ� ���� ���Ѵ�.)
        //�� 1 2 3 4    6 7 8 9(return;�� Ȱ���� �޼ҵ�����. 5���Ĵ� �������.)
        //�� 1 10 100 1000 10000


//

class ForTest1
{
    public static void main(String[] args)
    {

        //�� 0 1 2 3 4
        for(int i = 0; i<5; i++) //for_1
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        


/* ���� ������ �帧�����ǥ(����)
   
for_1�� ��������          
  ___|_i_|__T/F__|_ print__|_________
     | 0 | TRUE  |    0    |
     | 1 | TRUE  |    1    |
     | 2 | TRUE  |    2    |
     | 3 | TRUE  |    3    |
     | 4 | TRUE  |    4    |
     | 5 | FALSE |  (����)  |

[?]���α׷� ��������� ���� ���鶧
   ���� ���� �����ؼ� ǥ���մϱ�?
[������ �亯] �׷����� �ʴ´�.

*/

    
        //�� 1 2 3 4 5
        for(int i = 1; i<=5; i++)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        


        //�� 5 4 3 2 1
        for(int i = 5; i > 0; i--)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //�� 10 20 30 40 50
        for(int i = 10; i<=50; i+=10)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //�� 1 3 5 7 9
        for(int i = 1; i<=9; i=i+2)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    

        //�� 1 2 3 4 6 7 8 9 (for2�� Ȱ��)
        for(int i = 1; i<=4; i++)
        {
            System.out.print(i +" ");
        }
        for(int i = 6; i<=9; i++)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        

        //�� 1 2 3 4 6 7 8 9(if�� �ϳ��Ἥ for1���� ���)
        for(int i = 1; i<=9; i++)
        {
            if(i!=5)
            System.out.print(i +" ");
        }
            System.out.println(" ");        
 
   //(��� ���� �ð�)------------------------------------------------------------------------------------------------------------------------------------

        //�� 1 2 3 4 6 7 8 9(continue�� Ȱ���Ͽ� ����5�� ��� �����Ű�� ����� �ִ�!)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
            continue; //�ݺ����� �����Ű���� ������ ����� �ʴ� ���� �ȴ�.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        
        
        //�� 1 2 3 4   6 7 8 9(break�� �ƽ����� 5���Ĵ� ������. Ż���̶�...)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
            break; //�ݺ����� �����Ű���� ������ ����� �ʴ� ���� �ȴ�.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        

        //�� 1 2 3 4 6 7 8 9( System.exit�� Ȱ���Ͽ� ��������)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
//            System.exit(0); //���α׷��� ���������Ų��.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        

        //�� 1 2 3 4 6 7 8 9(return;�� Ȱ���� ����)
        for(int i = 1; i<=9; i++)
        {
            if(i==5){
 //           return; //��Ȯ���� �޼ҵ� �Ѱ��� ������ ���α׷� ��ü�� ����� �ƴϴ�.
            }
            System.out.print(i +" ");

        }
            System.out.println(" ");        


    //------------------------------------------------------------------------------------------------------------------------------------

        //�� 1 10 100 1000 10000
        for(int i = 1; i<=10000; i*=10)
        {
            System.out.print(i +" ");
        }
            System.out.println(" ");        
    
    }
}
