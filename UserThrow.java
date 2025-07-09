class Main
{
	public static void main(String[] args)
	{
		m1();
	}
	static void m1()
	{
		try
		{
			m2();
		}catch(NullPointerException e)
		{
			System.out.println("in m1 block");
		}
	}
	static void m2()
	{
		m3();
	}
	static void m3()
	{
		throw new NullPointerException();
	}

}