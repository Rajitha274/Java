class Main
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
	}
		
}