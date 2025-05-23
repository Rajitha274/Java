class TernaryRoman
{
	public static void main(String[] args)
	{
		int num = 1000;
		String s = (num==10)?"X":(num==100)?"C":(num==1000)?"M":(num==10000)?"X":"invalid";
		System.out.println(s);
	}
}