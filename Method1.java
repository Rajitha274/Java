import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=sc.nextInt();
		Sample s=new Sample();
		int res=s.calSq(num);
		System.out.println(res);
	}
}
class Sample
{
	int calSq(int num)
	{
		num = (int) Math.pow(num,2);
		return num;
	}
}