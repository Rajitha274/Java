class Main
{
	static int a=10,b,max;
	static String clg;
	static
	{
		b=a+10;
		
	}
	static
	{
		a=10;
		max=23+b;
		b=100;
	}
	public static void m1()
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("max= "+max);
	}
	public static void main(String[] args)
	{
		a=a+10;
		Main.m1();
	}
}