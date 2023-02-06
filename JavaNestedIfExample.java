public class JavaNestedIfExample
{
	public static void main(String args[])
	{
	//Creating two variable for age and weight
		int age=20;
		int weight=30;
	//applying condition on age and weight
		if(age>18)
		{
//both condition are true then statement execute otherwise not if first condition false not check inner loop direct transfer else statement	
			if(weight>50)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("you are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("You Must Be greater then 18");
			
		}
		
	}
}