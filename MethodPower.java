import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number :");
		int num=sc.nextInt();
		PowerNbr power = new PowerNbr();
		int sum=power.calSum(num);
		int pro=power.calPro(num);
		power.checkPow(sum,pro);
	}
}
class PowerNbr
{
	int calSum(int num)
	{
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
	int calPro(int num)
	{
		int rem=0,pro=1;
		while(num>0)
		{
			rem=num%10;
			pro=pro*rem;
			num/=10;
		}
		return pro;
	}
	void checkPow(int sum,int pro)
	{
		System.out.println(sum==pro ?"Power number":"not a power number");
	}

}