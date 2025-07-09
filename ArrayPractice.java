class Main
{
	public static void main(String[] args)
	{
		/*int[] a=new int[]{10,20,30,40};
		int x;
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}*/



		/*int[] a=new int[]{89,34,56,21,6,87};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
			
		}
		System.out.println("maximum element is: "+a[a.length-1]);
		System.out.println("smallest element : "+a[0]);*/





		/*int a[]=new int[]{12,67,98,45,29};
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println("sum is "+sum);
		System.out.println("average is  "+sum/a.length);*/





		/*int[] a=new int[]{12,67,34,98,12,6};
		int max=a[0];
		int i;
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);*/







		int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] b=new int[3][3];
		int x,y;
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a[x].length;y++)
			{
				b[x][y]=a[y][x];
				System.out.print(b[x][y]+"  ");				
			}
			System.out.println();
		}
		
	
	}
}