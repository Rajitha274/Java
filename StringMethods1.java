class StringMethods
{
	public static void main(String[] args)
	{
		String s=new String("Hello All");
		String s1=new String("hello all");

		System.out.println(s.indexOf('o')==s.lastIndexOf('o'));
		System.out.println(s.indexOf("All")==s.lastIndexOf("All"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s1.replace('h','H'));
		

	}
}