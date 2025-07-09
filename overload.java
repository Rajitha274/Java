class Main
{
	public static void main(String[] args)
	{
		Sample ch;
		ch=new Child();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
		
	}
}
class Sample
{
	void m1()
	{
		System.out.println("parent m1");
	}
	void m2()
	{
		System.out.println("parent m2");
	}
	
	void m3()
	{
		System.out.println("parent m3");
	}
	void m4()
	{
		System.out.println("parent m4");
	}

}
class Child extends Sample
{
	void m1()
	{
		System.out.println("child m1");
	}
	void m3()
	{
		System.out.println("child m3");
	}

}