class TernaryMajor
{
	public static void main(String[] args)
	{
		int age = 109;
		String s = (age<0 || age>100)?"Invalid":(age>=60)?"Person is senior citizen":(age>=18)?"person is major" : "minor";
		System.out.println(s);
	}
}