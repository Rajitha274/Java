class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,30,40,60,47,19,17};
		int count1=0;
		for(int x=0;x<a.length;x++)
		{
			int number=a[x],count=0;
			for(int y=1;y<=number;y++)
			{
				if(number%y==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(number+" is prime number");
				count1++;
			}	
		}
		System.out.println("count of prime numbers "+count1);
	}
}