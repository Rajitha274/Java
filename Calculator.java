class Main
{
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.calAdd(10,30);
	}
}
class Calculator
{

	void calAdd(int a, int b)
	{
		System.out.println(a+b);
	}
	void calAdd(double x,double y)
	{
		System.out.println(x+y);
	}
	void calAdd(String name)
	{
		System.out.println(name);
	}


	
}
