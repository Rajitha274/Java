import java.util.Scanner; 
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value : ");
		int a=sc.nextInt();
		System.out.print("enter b value : ");
		int b=sc.nextInt();

		Multi m= new Multi();
		int mul=m.calMul(a,b);
		System.out.println(mul);
	}
}
class Multi
{
	int calMul(int a,int b)
	{
		return a*b;
	}
	//return a*b;
}