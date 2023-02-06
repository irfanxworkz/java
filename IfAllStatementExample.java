public class IfAllStatementExample
{
	public static void main(String args[])
	{
		int x = 10;
		int y = 12;
		//Simple if-statement
		if(x+y > 20)
		{
			System.out.println("x+y is greater then 20");
		}

		//if-else statement
		if(x+y <20)
		{
			System.out.println("x+y is less then  20");
		}
		else
		{
			System.out.println("x+y is greater then 20");
		}

		//if-else-if Statement
		String city = "Jaipur";

		if(city == "Meerut")
		{
			System.out.println("city is Meerut");
		}
		else if(city == "Noida")
		{
			System.out.println("city is Noida");
		}
		else if(city == "Agra")
		{
			System.out.println("city is Agra");
		}
		else
		{
			System.out.println(city);
		}

		//Nested If-statement
		String address = "Delhi, India";
		
		if(address.endsWith("India"))
		{
			if(address.contains("Meerut"))
			{
				System.out.println("Your City is Meerut");
			}
			else if(address.contains("Noida"))
			{
				System.out.println("Your city is noida");
			}
			else
			{
				System.out.println(address.split(",")[0]);
			}
		}
		else
		{
			System.out.println("You are not living in india");
		}
	}
}