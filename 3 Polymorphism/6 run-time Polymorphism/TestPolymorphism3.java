class Animal
{
	void eat()
	{
		System.out.println("eating...from class Animal");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("eating bread...");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("eating rat");
	}
}
class Lion extends Animal
{
	void set()//print Animal Class void method and programme run no error
	//void eat()
	{
		System.out.println("eating meat");
	}
}

class TestPolymorphism3
{
	public static void main(String args[])
	{
		Animal a;
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a=new Lion();
		a.eat();
	}
}