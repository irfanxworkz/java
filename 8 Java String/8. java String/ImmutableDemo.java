final class Employee
{
	final String PanCardNumber;
	public Employee(String PanCardNumber)
	{
		this.PanCardNumber=PanCardNumber;
	}
	public String getPanCardNumber()
	{
		return PanCardNumber;
	}
}
public class ImmutableDemo
{
	public static void main(String args[])
	{
		Employee e=new Employee("ABC123");
		String s1=e.getPanCardNumber();
		System.out.println("pancard number: "+s1);
	}
}