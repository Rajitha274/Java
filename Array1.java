class Main
{
	public static void main(String[] args)
	{
		int[] a={10,20,30,40,50,60};
		int[] b=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}

	}
}