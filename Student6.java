class Student6
{
	int id;
	String name;
	//constructor to intilize integer and string
	Student6(int i,String n)
	{
		id=i;
		name=n;
	}
	//constructor to initilize another object
	Student6(Student6 m)
	{
		id=m.id;
		name=m.name;
	}
	void display()
	{
		System.out.println(id+" "+name);	
	}

	public static void main(String args[])
	{
		Student6 s1=new Student6(111,"IRFAN");
		Student6 s2=new Student6(s1);
		s1.display();
		s2.display();
	}
}