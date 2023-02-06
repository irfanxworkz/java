abstract class Shape
{
	abstract void draw();//no method body
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
class TestAbstraction1
{
	public static void main(String args[])
	{	
		Shape s=new Circle1();//upcasting
		s.draw();
		/*Shape s1,s2;
		s1=new Circle1();
		s1.draw();
		s2=new Rectangle();
		s2.draw();*/
	}
}