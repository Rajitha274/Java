class StrMethodArm
{
	public static void main(String[] args)
	{
		String s="153";
		int len=s.length();
		int x=Integer.parseInt(s);
		int sum=0,copy=x,rem=0;
		while(x!=0)
		{
			rem=x%10;
			sum=sum+(int)Math.pow(rem,len);
			x/=10;
		}
		if(sum==copy)
			System.out.println("Armstrong");
		else
			System.out.println("not armstrong");
	}
}