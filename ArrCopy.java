class Main
{
	public static void main(String[] args)
	{
		double[] a= new double[]{12.4,45.0,78.0,67.0,89.7,45.9,34.5,24.0,76.0,57.5};
		double[] b= new double[a.length];
		System.out.println("copying a array elements to b array elements");
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");

		}
		System.out.println();
		System.out.println("copying a array elements to b array elements in reverse order");
		for(int x=a.length-1;x>=0;x--)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");

		}

	}
}