class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{121,67,88,45,36,99,44};
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int rev=0,number=a[x],copy=number;
			while(number!=0)
			{
				rev=rev*10+(number%10);
				number/=10;
			}
			if(rev==copy)
			{
				System.out.println(a[x] +" is palindrome number");
				count++;
			}
		}
		System.out.println("count of palindrome numbers "+count);
	}
}