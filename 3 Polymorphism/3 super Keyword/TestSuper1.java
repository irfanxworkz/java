class Animal
{
	String color="white";
}
class Dog extends Animal
{
	String color="black";
	
	void printColor()
	{
		
		System.out.println(super.color);//print color of animal class
		System.out.println(color);
	}
}

class TestSuper1
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.printColor();
	}
}