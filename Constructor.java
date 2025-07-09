class Main
{
	public static void main(String[] args)
	{
		Customer customer=new Customer();
		customer.printDetails();
	}
}
class Customer
{
	String name;
	int c_id;
	String email;
	Customer()
	{
		name="Rajitha";
		c_id=123;
		email="rajitha@gmail.com";
	}
	void printDetails()
	{  
		System.out.println(name+"   "+c_id+"   "+email);
	}
}