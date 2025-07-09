class Length
{
	public static void main(String[] args)
	{
		String s=new String("Hello");
		System.out.println(s.length());
		System.out.println("reverse of the string");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}