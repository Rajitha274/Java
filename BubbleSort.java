class BubbleSort
{
	public static void main(String[] args)
	{
		int[] a=new int[]{89,67,23,18,34,90,21};
		int x,y;
		for(x=0;x<a.length-2;x++)
		{
			for(y=0;y<(a.length-1)-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y+1];
					a[y+1]=a[y];
					a[y]=temp;
				}
			}
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
					
	} 
}