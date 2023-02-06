class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	/*void eat()
	{
		System.out.println("Dog is eating");
	}*/
}
class BabyDog1 extends Dog
{
	/*void eat()
	{
		System.out.println("BabyDog1 is drinking");
	}*/
	public static void main(String args[])
	{
		Animal a=new BabyDog1();
		a.eat();
	}
}