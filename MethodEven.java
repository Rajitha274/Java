import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int num=sc.nextInt();
			if(num%2==0)
			{
				System.out.println(num+" Even");
				break;	
			}
			else
				System.out.println(num+" odd");
			
			System.out.println("Enter another number");


		}	
	}
}