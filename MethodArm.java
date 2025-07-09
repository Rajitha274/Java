import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		Sample s= new Sample();
		int res = s.checkArmstrong(num);
				
		int val=s.checkMethod(num,res);
		s.checkArm(num,val);


		
	}
}
class Sample
{
	int checkArmstrong(int num)
	{
		int count=0,sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	int checkMethod(int num,int res)
	{
		int sum=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(int)Math.pow(rem,res);
			num=num/10;
		}
		return sum;

	}
	void checkArm(int num,int val)
	{
		System.out.println(val==num ?"Armstrong":"not armstrong");
	}
	
}