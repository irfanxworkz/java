class A
{
	 private A()//private constructor
	{
		int data=40;
		System.out.println("value of data is: "+data);
	}
	private  void msg()
	{
		System.out.println("Hello java");
	}
}
public class Simple2
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.msg();
		
	}
}