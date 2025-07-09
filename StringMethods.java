class StringMethods
{
	public static void main(String[] args)
	{
		String s=new String("Hello All Good Morning all");
		System.out.println(s.length()+ " => length method");
		System.out.println(s.toUpperCase()+ "  => to upper case method");
		System.out.println(s.toLowerCase()+ "  =>to lower case method");
		System.out.println(s.charAt(3)+ " => to charAt() method");
		System.out.println(s.equals("Hello All Good Morning")+ " => .equals() method");
		System.out.println(s==("Hello All Good Morning")+ " == ");
		System.out.println(s.trim()+" trim method ");
		System.out.println(s.lastIndexOf('e')+" => lastIndex method ");

		System.out.println(s.lastIndexOf("all")+" => lastIndex method ");
		System.out.println(s.concat("good morning"));
		String[] a=s.split(" ");
		for(String temp: a)
			System.out.println(temp);
	}
}