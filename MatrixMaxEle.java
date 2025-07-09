class MatrixMaxEle
{
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int x=0;x<a.length;x++)
		{
			int val=0;
			for(int y=0;y<a[x].length;y++)
			{
				val=a[x][y];		
			}
			if(val>max)
			{
				max=val;
			}
			System.out.println("maximum element is: "+max);
		}
		
	}
}