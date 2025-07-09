class ArrRepeat
{
	public static void main(String[] args)
	{
		int[] a=new int[]{12,67,98,34,23,98,98,67,12,12,12,98,100};
		int[] b=new int[a.length];
		int x,y;
		int max=0,maxval=0;
		for(x=0;x<=a.length-1;x++)
		{
			if(b[x]==1)
			{
				continue;
			}
			int count=1;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=1;
				}
			}
			
			if(count>=max)
			{
				max=count;
				maxval=a[x];
			}	
		}
		System.out.println(maxval+" "+max);

	}
}