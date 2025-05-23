class ValueCheck
{
	public static void main(String[] args)
	{
		char ch = '*';
		if( ch>='A' && ch<='Z')
			System.out.println("input " + ch +" is capital letter");
		else if( ch>='a' && ch<='z')
			System.out.println("input " + ch +" is small letter");
		else if( ch>='0' && ch<='9')
			System.out.println("input " + ch +" is digit");	
	
		else if( ch==' ')
			System.out.println("input " + ch +" is space");
		else
			System.out.println("Symbol");	
	

	
	}
}