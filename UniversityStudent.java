class UniversityStudent
{
	public static void main(String[] args)
	{
		double sub_A= 68, sub_B=44;
		if((sub_A>=55 && sub_B>=45) || ((sub_A<=55 && sub_A>=45)&&(sub_B>=55)))
			System.out.println("He is qualified");
		else if(sub_A >65 &&sub_B<45)
			System.out.println("He is allowed reappeared in exam in B to qualify");
		else
			System.out.println("fail");
	}
}