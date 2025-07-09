class StringArrDup
{
	public static void main(String[] args)
	{
		String s=new String("Hello all good morning");
		String str1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(str1.indexOf(ch)==-1)
				{
					str1=str1+ch;
				}
			}
		}
		System.out.print(str1);

	}
}
