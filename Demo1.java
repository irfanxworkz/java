abstract class MyClass //abstract class Declaration
{
	abstract void display();//abstract method declaration
}
public class Demo1 extends MyClass// inherite Demo class
{
	void display()//method implementation
	{
		System.out.println("Abstract Method?....");	
	}
	public static void main(String args[])
	{
		MyClass obj=new Demo1();
		obj.display();
	}
}