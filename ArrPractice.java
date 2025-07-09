import java.util.Scanner;
/*class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements of first array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter size second array");
		int size1=sc.nextInt();
		System.out.println("enter elements of second array");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		int[] arr2=new int[arr.length+arr1.length];
		Sample s=new Sample();
		s.mergeArr(arr,arr1,arr2);	
	}
}
class Sample
{
	void mergeArr(int[] arr,int[] arr1,int[] arr2)
	{
		for(int x=0;x<arr.length;x++)
		{
			arr2[x]=arr[x];
			System.out.print(arr2[x]+" ");
		}
		for(int x=0;x<arr1.length;x++)
		{
			arr2[x]=arr1[x];
			System.out.print(arr2[x]+" ");
		}

	}
}*/











/*class Main
{
	public static void main(String[] args)
	{
		int[] arr= new int[]{12,56,87,97,45,34,12,45,45,56};
		int[] arr1=new int[arr.length];
		int x;
		for(x=0;x<arr.length;x++)
		{
			if(arr[x]==1)
			{
				continue;
			}
			for(int y=x+1;y<arr.length;y++)
			{
				
				if(arr[x]==arr[y])
				{
					
					arr1[y]=1;
				}
			}
			

		
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr1[i]==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}*/






class Main
{
	public static void main(String[] args)
	{
		String s=new String("madam");
		boolean b=true;
		for(int i=0,j=s.length()-1;i<s.length();i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				b=false;
				break;
			}
		}
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}
	
}