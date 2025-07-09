class ArrFrequency
{
	public static void main(String[] args)
	{
		int[] a={10,20,30,10,40,20,10,30,14,40,70,80,10,30};
		int[] b=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			int count=1;
			if(b[x]==1)
			{
				continue;
			}
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{	
					count++;
					b[y]=1;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]+" "+count);
			}
		}
	}
}