class A
{
	A()
	{
		System.out.println("Hello a");
	}
	void display()
	{
		System.out.println("Hello b");
	}
	A(int x)
	{
		this();
		System.out.println("value of a is: "+x);
	}
}

class TestThis5
{
	public static void main(String args[])
	{
		A a=new A(10);
		//A a1=new A();
		a.display();
	}
}