class UpperCase
{
	public static void main(String[] args)
	{
		char c = 'r';
		int num = (int)c;
		if(c>='A' && c<='Z')
		{
			num = num+32;
			char ch = (char)num;
			System.out.println(ch);
		}
		else if(c >='a' && c<='z')
		{
			num = num-32;
			char ch = (char)num;
			System.out.println(ch);
	
		}
		else
		{
			System.out.println("invalid");
		}
	}
}