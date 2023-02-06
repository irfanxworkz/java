class Student
{
	int rollno;
	String name;
	static String college = "ITS";
	//static method can change the values of static variable
	static void change()
	{
		college = "BBDIT";
	}
	//constructor to initilize values
	Student(int r, String n)
	{	
		rollno = r;
		name = n;
	}
	//method to display values
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}

//Test classs to create and display the values of object
public class TestStaticMethod
{
	public static void main(String args[])
	{
	//calling change methods
		//Student.change();
	//creating object
		Student s1=new Student(111,"Irfan");
		Student s2=new Student(222,"Rahul");
		Student s3=new Student(333,"Karan");
	//calling display method
		s1.display();
		s2.display();
		s3.display();
	}
} 