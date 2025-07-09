class Main
{
	public static void main(String[] args)
	{
		Superclass sc=new Subclass();
		sc.m1();
	}
}
class Superclass
{
	static void m1()
	{
		System.out.println("i am parent");
	}
}	
class Subclass extends Superclass
{

	static void m1()
	{
		System.out.println("i am child");
	}
}