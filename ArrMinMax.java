class Main
{
	public static void main(String[] args)
	{	
		int[] a=new int[]{14,67,34,90,23,87};
		Sample s=new Sample();
		int min=s.calMin(a);
		int max=s.calMax(a);
		s.calSum(a,min,max);
		
	}
}
class Sample
{
	int calMin(int[] a)
	{
		int min=0;
		for(int x=1;x<a.length;x++)
		{
			if(a[min]>a[x])
				min=x;
		}
		return min;
	}
	int calMax(int[] a)
	{
		int max=0;
		for(int x=1;x<a.length;x++)
		{
			if(a[max]<a[x])
				max=x;
		}
		return max;
	}
	void calSum(int[] a,int min,int max)
	{
		int sum=a[min]+a[max];
		System.out.println(sum);
	}

		
}