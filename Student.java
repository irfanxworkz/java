public class Student
{
	private int roll;
	private String name;
	public int getRoll()//Accessor method
	{
		Student obj=new Student();
		return roll;
	}
	public void setRoll(int roll)//mutator method
	{
		Student obj=new Student();
		this.roll=roll;
	}
	public String getName()//Accessor method 
	{
		Student obj=new Student();
		return name;
	}
	public void setName(String name)
	{
		Student obj=new Student();
		this.name=name;
	}
	public void display()
	{
		Student obj = new Student();
		System.out.println("Roll No: "+roll);
		System.out.println("Student name: "+name);
	}
}