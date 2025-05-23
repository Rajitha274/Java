class Condition
{
	public static void main(String[] args)
	{
		int age =55;
		String gender = "female", occupation= "business";
		if(age>=60 && age<=100)
		{
			if(gender == "male")
				System.out.println("provide pension of 3000");
			else
				System.out.println("provide pension of 5000");
		}
		else if(age>=18 && age<60)
		{
			if(occupation == "govt employee")
				System.out.println("provide health insurance for entire family");
			else if(occupation == "private")
				System.out.println("provide health insurance for that person");
			else
				System.out.println("provide no health insurance ");

		}
		else if(age>=0 && age<18)
		{
			if(age<10)
 				System.out.println("provide free medical checkups");
			else
				System.out.println("provide scholarship 10000");


		}
		else
			System.out.println("Invalid age");

	}
}