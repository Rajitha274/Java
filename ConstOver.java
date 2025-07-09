class Main
{
	public static void main(String[] args)
	{
		Sample s=new Sample(10);	
	}
}
class Sample
{
	Sample()
	{
		System.out.println("default");
	}
	Sample(int x)
	{
		System.out.println(x);
	}
	Sample(double x)
	{
		System.out.println(x);
	}
}