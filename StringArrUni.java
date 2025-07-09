class StringArrUni
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				s1=s1+c;
			}
			
		}
		System.out.println(s1);
	}
}
