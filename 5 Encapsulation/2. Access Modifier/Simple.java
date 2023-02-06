class A2
{
	/*protected void msg()
	{
		System.out.println("hello java");
	}*/
	void msg()
	{
		System.out.println("hello java");
	}
}
public class Simple extends A2
{
	void msg()
	{
		System.out.println("hi java");
	}
	public static void main(String args[])
	{
		//Simple obj=new Simple();
		A2 obj=new Simple();
		obj.msg();
	}
}