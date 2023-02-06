interface Printable
{
	void print();
}
class A6 implements Printable//used implements for interface
{
	public void print()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		A6 obj=new A6();
		obj.print();
	}
}