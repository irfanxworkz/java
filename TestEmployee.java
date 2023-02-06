class Employee
{
	int id;
	String name;
	double salary;
	void insert(int i, String n, double s)
	{
		id=i;
		name=n;
		salary=s;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}
public class TestEmployee
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insert(101,"Irfan",45950.40);
		e2.insert(202,"Rahul",35432.60);
		e3.insert(303,"Nadeem",25762.49);
		e1.display();
		e2.display();
		e3.display();
	}
}