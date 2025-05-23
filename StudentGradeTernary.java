class StudentGradeTernary
{
	public static void main(String[] args)
	{
        	int m1=94, m2=95,m3=96,phy=98,che=99;
		double total = m1+m2+m3+phy+che;
		double per = (total/500)*100;
		String s = (per>=90)?"A+ grade" :(per>=80)?"A grade":(per>=70)?"B grade":(per>=60)?"C grade":(per>=35)?"D grade":"Fail";
		System.out.println(per+" "+s);
	
}
			
}
