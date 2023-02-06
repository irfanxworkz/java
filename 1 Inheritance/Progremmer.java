class Employee
{
	float salary=40000;
}

class Progremmer extends Employee
{
	int bonus=10000;
	
	public static void main(String args[])
	{
		Progremmer p=new Progremmer();
		System.out.println("Programmer Salary is: "+p.salary);
		System.out.println("bonus of Programmer is: "+p.bonus); 
	}
}