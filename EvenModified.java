class EvenOdd
{
	public static void main(String[] args)
	{
		int num = 6788;
		int num1=0,num2=0, num3=0;
		num1 = num/100;
   		num2 = num%100; 

		if(num%2 == 0)
		{
			num3 = num1+num2;	
		}
		else 
		{
			num3 = num1-num2;	
		}
			System.out.println(num3);
	}
}