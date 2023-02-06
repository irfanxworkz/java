class Student5
{
	int id;
	String name;
	int age;
	//creating two arg constructor
	Student5(int i,String n)
	{
		id=i;
		name=n;
	}
	//creating three arg constructor
	Student5(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	//creating method
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}

	//main method
	public static void main(String args[])
	{
		//creating objects
		Student5 s1=new Student5(111,"IRFAN");
		Student5 s2=new Student5(222,"KARAN",25);
		s1.display();
		s2.display();
	}
}
