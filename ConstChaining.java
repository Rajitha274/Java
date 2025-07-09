class ConstChaining
{
	public static void main(String[] args)
	{
		Customer customer=new Constructor();
	}
}
class Customer
{
	Customer()
	{
		this(456);
		System.out.println("Default constructor");
	}
	Customer(int x)
	{
		this(456.7);
		System.out.println("parameterized constructor");
	}
	Customer(double y)
	{
		System.out.println("double value parameterized constructor");
	}


}