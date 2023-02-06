//java program to demonstrate the use of the parameterized constructor.
class Student4
{
	int id;
	String name;
	
	//creating a parameterized constructer
	Student4(int i,String n)
	{
		id=i;
		name=n;
	}
	//method to displaying the values.
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String args[])
	{
		//creating objects and passing values
		Student4 s1=new Student4(111,"Irfan");
		Student4 s2=new Student4(222,"Rahul");
		s1.display();
		s2.display();
	}
}