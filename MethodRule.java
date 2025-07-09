class Method
{
	public static void main(String[] args)
	{
		Sample s=new Sample();
		int val =s.method1(10,30,'r',20.0);
		System.out.println(val);
	
	}
}
class Sample
{
	int method1(int a,int x,char z,double y)
	{
		return x+a;
	}
}