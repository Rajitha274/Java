class EvenPerSquare
{
	public static void main(String[] args)
	{
		int num=36;
		double val = Math.sqrt(num);
		if(val*val == num && num%2==0)
			System.out.println("number is even perfect square");
		else
 			System.out.println("number is not even perfect square");
	}
}