class Student
{
	int id;
	String name;
}
class TestStudent3
{
	public static void main(String args[])
	{
		//Creating Objects
		Student s1= new Student();
		Student s2= new Student();
		//Initializing Objects
		s1.id=101;
		s2.id=202;
		s1.name="Sonu";
		s2.name="Akram";
		//Printing Data
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name); 
	}
}