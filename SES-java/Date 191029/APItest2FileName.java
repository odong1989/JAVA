import java.util.Scanner;

class APItest2FileName
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.print("���ϸ� �Է� : ");
		String file = scan.nextLine();
		
		System.out.println("file �� �� :" + file);

		//-----------------------------------------------------------------------------------------------------------------------------
		//[����1]"exe", "com" Ȯ������ ������ ��� "�ø��� ���ٰ� �Ͻʽÿ�.
		//contains�� �����Ͻ�(���ϸ��� company�����Ÿ� ���ϸ����� ƨ��� �һ�簡 ����...)

		//������ ���
		//System.out.print(file.substring(file.lastIndexOf(".")+1,file.length()));//��� üũ��
		if (file.substring(file.lastIndexOf(".")+1,file.length()).equals("exe") || file.substring(file.lastIndexOf(".")+1,file.length()).equals("com"))
		{
			System.out.println("exe�� com�� �ȵ� ");
		}
		
		//�������� ���
		if(file.endsWith(".exe") || file.endsWith(".com") )
		{
			System.out.println(" \"exe\"�Ǵ� \"com\" Ȯ���ڸ� ���� ������ �ø� �� �����ϴ�. ");	
		}

		//������ ��� - ��/�ҹ��� ����(���� �ҹ��ڷ� ��ȯ)
		if(file.toLowerCase().endsWith(".exe") || file.toLowerCase().endsWith(".com") )
		{//���ڿ��� ������ �ҹ��ڷ� ��ȯ �� exe/com ���θ� Ȯ��
			System.out.println(" \"exe\"�Ǵ� \"com\" Ȯ���ڸ� ���� ������ �ø� �� �����ϴ�. ");	
		}	

		//-----------------------------------------------------------------------------------------------------------------------------

		//[����2]	Ȯ���ڸ� ����ϼ���. �Ǵ� "Ȯ���ڰ� �����ϴٶ�� ����Ͻʽÿ�.
		//���ǹ��(Ȯ���� �ִ� ���θ� �˰� Ȯ���� �����ô� ���ۼ�)
		System.out.println("���ϸ� : "+file.substring(file.lastIndexOf(".")+1));
		
		//������
		String ext="";
		String sa[];
		System.out.println("file.contains : " + file.contains("."));
		

		//Ȯ���� üũ(.���� üũ)
		if (!file.contains("."))//����� ����� ����Ѵ�. ������ ��������ν� ���� ��츦 �Ǵ��Ѱ�.
		{						//file.contains(".")�� ���� .�� ���� �� false�� �Ǵµ� !�� ���� not��Ŵ���ν� true���� ��ȯ�Ͽ� ���ǹ��� �۵���Ų��. 
			System.out.println("Ȯ���ڰ� �����ϴ�.");
		}
		//Ȯ���� ���
		else
		{
			//���1 - lastIndexOf�� ���� �߰� �� ������ �ڸ������ ������ �Ѵ�.
			ext = file.substring(file.lastIndexOf('.')+1);
			System.out.println("Ȯ����(ext) : "+ext);

			//2
			System.out.println("----------------------------------------------------");

			sa = file.split("[.]");
			/*
				split�� ��� �׳� .�� ���� ���Խ����� �����Ͽ� ���۵��� �Ѵ�.
				split�� ��� .�� �˻��ϰ� �ʹٸ� [.]���� �Ͽ� ���Խ��� �ƴ϶� .�� �˻��ϰ� �ʹٰ� Ȯ���ϰ� ������.
				
				�ڹ� ��ũ��Ʈ���� ���Խ��� �� ���� ����ϴµ� 
				������ ������� �Է��� ���۵��� �ٷιٷ� �����ϱ� �����̶��Ѵ�.
			*/
			System.out.println("sa : "+ sa[1]);
			ext = sa[sa.length -1];
			System.out.println("Ȯ����(ext) : "+ext);
		}

		//-----------------------------------------------------------------------------------------------------------------------------

	
	}
}