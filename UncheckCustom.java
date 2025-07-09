/*class Main
{
	public static void main(String[] args)
	{
		throw new XyzException("i am unchecked custom exception");	
	}
}
class XyzException extends RuntimeException
{
	public XyzException(String msg)
	{
		super(msg);
	}
}*/








class Main
{
	public static void main(String[] args)throws XyzException
	{
		throw new XyzException("i am checked custom exception");	
	}
}
class XyzException extends Exception
{
	public XyzException(String msg)
	{
		super(msg);
	}
}