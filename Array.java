import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{10,20,30,40,50};
		
		System.out.println("reverse first half");
		int x;
		for(x=(arr.length-1)/2;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		for(x=((arr.length-1)/2)+1;x<=arr.length-1;x++)
		{
			System.out.print(arr[x]+" "  );
		}

		System.out.println("");
		System.out.println("reverse second half");
		int y;
		for(y=0;y<=(arr.length-1)/2;y++)
		{
			System.out.print(arr[y]+" ");
		}
		for(y=arr.length-1;y>=((arr.length-1)/2)+1;y--)
		{
			System.out.print(arr[y]+" ");
		}

	}
}