class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
class TestInheritance2
{
	public static void main(String args[])
	{
		BabyDog d=new BabyDog();
		d.eat();
		d.bark();
		d.weep();
	}
}