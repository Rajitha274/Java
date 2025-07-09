class Exce
{
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.name);
		s=null;
		System.out.println(s.name);
		
	}
}
class Student
{
	String name;
}