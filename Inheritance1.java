class Inheritance1
{
	public static void main(String[] args)
	{
		Child ch=new Child(10,"Rajitha");
		ch.printChild();
	}
}
class Parent
{
	int roll;
	String name;
	void m1()
	{
		System.out.println("parent class");
	}
	Parent()
	{
		this.roll=roll;
		this.name=name;
	}
	
		
}
class Child extends Parent
{
 	Child(int roll,String name)
	{
		super.roll=roll;
		super.name=name;
		
	}
	void printChild()
	{
		System.out.println(roll+" "+name);
		super.m1();
	}
}