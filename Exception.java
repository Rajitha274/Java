class Exception
{
	public static void main(String[] args)
	{
		/*try   //ArrayIndexOutOfBoundsException
		{
			int[] a=new int[]{10,20,30,40};
			System.out.println(a[7]);
			System.out.println("hloo");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("hi");*/




		/*try   //StringIndexOutOfBoundsException
		{
			String a=new String("hello");
			System.out.println(a.charAt(7));
			System.out.println("hloo");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}*/


		

		/*try   //NullPointerException
		{
			String s= new String("hello");
			s=null;
			System.out.println(s.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception Handled");
		}*/





		try   //IllegalArgumentException
		{
				
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception Handled");
		}



		/*try       //ArithmeticException
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}*/




		try
		{
			String s=new String("raji");
			int num=Integer.parseInt(s);
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("");
		}




		
	}
}