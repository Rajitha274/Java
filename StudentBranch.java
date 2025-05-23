class StudentBranch
{
	public static void main(String[] args)
	{
		String college = "Vika college of engineering and technology";
		System.out.println(college);
		System.out.println("CSE");
		int fee=0;
		int scholarship=0;
		String branch = "CSE";
		if(branch=="ECE")
       		{
			System.out.println("This branch subjects are:\n"+"Chemistry\n" + "Design thinking\n" + "SDLC\n" + "Physics");
			fee = 50000;
			scholarship = 10000;			
		}
		else if(branch== "CSE")
		{
			System.out.println("This branch subjects are:\n"+"Java\n" + "Operating system\n" + "DBMS\n" + "DAA");
			fee = 40000;
			scholarship=5000;
		}
		else if(branch== "EEE")
		{
			System.out.println("Network Analysis\n" + "python\n" + "Digital Logic Design\n" + "Signals and Systems");
			fee = 30000;
			scholarship=7000;
		}
		else if(branch== "civil")
		{
			System.out.println("Concrete Technology\n" + "Design of steel structures\n" + "construction management\n" + "Geology for civil engineers");
			fee = 30000;
			scholarship=5000;
		}
		else if(branch== "IT")
		{
			System.out.println("C programming\n" + "DSA\n" + "Engineering Graphics\n" + "Java");
			fee = 80000;
			scholarship=10000;
		}
		else if(branch== "mech")
		{
			System.out.println("Engineering mechanics\n" + "Environmental Science\n" + "python\n" + "workshop practice");
			fee = 40000;
			scholarship=5000;
		}
			System.out.println("Fee is: " +fee);
			System.out.println("scholarship is:"  +scholarship);




	}
}