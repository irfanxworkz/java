interface Printable
{
	void print();
}
interface Showable extends Printable//an interface extends another interface 
{
	void show();
}
class TestInterface4 implements Showable
{
	public void print()
	{
		System.out.println("hello");
	}
	public void show()
	{
		System.out.println("welcome");
	}
	public static void main(String args[])
	{
		TestInterface4 obj=new TestInterface4();
		obj.print();
		obj.show();
	}
}