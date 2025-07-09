import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		Sample s= new Sample();
		int res= s.checkPalin(num);
		System.out.println(res==num ?"palindrome":"not palindrome");


		
	}
}
class Sample
{
	int checkPalin(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num=num/10;
		}
		return rev;
	}
}