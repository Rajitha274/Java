import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		int[] arr= new int[]{10,20,30,53,78,1,34};
		int firstmax=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(int num: arr)
		{
			if(num>firstmax)
			{
				secmax=firstmax;
				firstmax=num;
			}
			else if(num>secmax  && num!=firstmax)
			{
				secmax=num;
			}
		}
		System.out.println(secmax);
	}
}