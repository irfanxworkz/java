class A
{
	A()
	{
		System.out.println("parent class constructor is invoked");
	}
}
class B2 extends A
{
	B2()
	{
		super();
		System.out.println("child class constructor is invoked");
	}
	
	//B2(int a)
	//{
		//super();
		//System.out.println("child class constructor"+a);
	//}
	
	{System.out.println("Instance Initializer block is invoked");}

	public static void main(String args[])
	{
		B2 b1=new B2();
		//B2 b2=new B2(12);
	}
}