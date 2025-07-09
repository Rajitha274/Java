class StrArr
{
	public static void main(String[] args)
	{
		String[] str=new String[]{"Hello","all","good","mrng","all","mrng"};
		String[] str1=new String[str.length];
		for(int i=0;i<=str.length-1;i++)
		{
			int count=1;
			if(str1[i]==1)
			{
				continue;
			}
			for(int y=i+1;i<=str.length-1;i++)
			{
				if(str[i]==str[y])
				{	
					count++;
					str[i]=1;
				}
			}
			if(count>1)
				System.out.println(str[i]+" "+count);
		}
	}
}