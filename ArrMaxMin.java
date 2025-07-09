class Main
{
	public static void main(String[] args)
	{	
		int[] a=new int[]{14,67,34,90,23,87};
		Sample s=new Sample();
		int sum=s.calSum(a);
		System.out.println(sum);

				
	}
}
class Sample
{
	int calSum(int[] a)
	{
		int min=0,max=0,sum=0;
		for(int x=1;x<a.length;x++)
		{
			if(a[min]>a[x])
				min=x;
			else if(a[max]<a[x])
				max=x;
		}
		sum=a[min]+a[max];
		return sum;
	}
}
		