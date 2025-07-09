class StringArrDup
{
	public static void main(String[] args)
	{
		//String s=new String("Hello all good morning");
		String[] arr=new String[]{"hello","all","all","good","morning"};
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr1[i]==1)
			{
				continue;
			}
			int count=1;
			for(int x=i+1;x<arr.length;x++)
			{
				if(arr[i]==arr[x])
				{
					count++;
					arr1[x]=1;
				}
			}
			if(count>1)
				System.out.print(arr[i]+" ");
		}
	}
}
