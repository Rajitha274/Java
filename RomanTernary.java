class RomanTernary
{
	public static void main(String[] args)
	{
		int n=4;
		String s = (n==1)?"I": (n==2)?"II" : (n==3)?"III":(n==4)?"IV": (n==5)?"V":(n==6)?"VI":(n==7)?"VII":(n==8)?"VIII":(n==                  9)?"IX":(n==10)?"X": "Invalid";
		System.out.println(s);
	}
}