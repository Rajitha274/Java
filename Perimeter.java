class Library
{
	public static void main(String[] args)
	{
		int day = 16;
		if(day>0 && day<=5)
			System.out.println(" fine will be 50 paise");
		else if(day>=6 && day<=10)
			System.out.println("fine will be one rupee");
		else if(day>10 && day<=30)
			System.out.println("fine will be 5 rupees");
		else
			System.out.println("your membership will be cancelled");
	}
}























	{
		int len =5, breadth=4;
		double area = len*breadth, perimeter= 2*(len+breadth);
		if(area>perimeter)
			System.out.println("Area is greater");
		else
			System.out.println("perimeter is greater");
		
	}
}