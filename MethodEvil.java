import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		Sample s = new Sample();
		int sq= s.calSq(num);
		int sum=s.calSum(sq);
		s.checkEvil(num,sum);
		
		
	}
}
class Sample
{
	int calSq(int num)
	{
		int d=(int)Math.pow(num,2);
		return d;
	}
	 

	int calSum(int sq)
	{
		int rem=0,sum=0;
		while(sq>0)
		{
			rem=sq%10;
			sum=sum+rem;
			sq/=10;
		}
		return sum;
	}
	
	
	void checkEvil(int num,int sum)
	{
		System.out.println(num==sum?"Evil number":"Not a Evil Number");
	}
		
	
									
	
}