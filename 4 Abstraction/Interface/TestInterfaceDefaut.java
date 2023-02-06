interface Drawable
{
	void draw();
	default void msg()
	{
		System.out.println("default method");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing ractangle");
	}
}
class TestInterfaceDefaut
{
	public static void main(String args[])
	{
		Drawable d=new Rectangle();
		d.draw();
		d.msg();	
	}
}