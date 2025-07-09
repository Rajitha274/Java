import java.util.Scanner;
class TwoDArray
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][3];
		int x,y;
		for(x=0;x<a.length;x++)
		{
			
			for(y=0;y<a[x].length;y++)
			{
				Scanner sc=new Scanner(System.in);

				System.out.println("enter new row values ");

				a[x][y]=sc.nextInt();

				
			}
			System.out.print(a[x][y]+"   ");


			System.out.println();
		}	
	}
}