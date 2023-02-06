class Animal
{
	Animal()//Animal class Constructor
	{
		System.out.println("Animal is created");
	}
}
class Dog extends Animal
{
	Dog()//Dog class constructor
	{
		System.out.println("dog is created");
	}
}
class TestSuper4
{
	public static void main(String args[])
	{
		Dog d=new Dog();	
	}
}