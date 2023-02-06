class Animal
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("eating fruits");
	}
}
class BabyDog extends Dog//multilevel inheritance
{
	void eat()
	{
		System.out.println("Drinking milk");
	}

	public static void main(String args[])
	{
		//Animal a1,a2,a3;
		//a1=new Animal();
		//a2=new Dog();
		//a3=new BabyDog();
		//a1.eat();
		//a2.eat();
		//a3.eat();	
	
		//Animal a1,a2,a3;//this type also used
		//a1=new Animal();
		//a1.eat();
		//a2=new Dog();
		//a2.eat();
		//a3=new BabyDog();
		//a3.eat();

		Animal a; //and this type also use
		a=new Animal();
		a.eat();
		a=new Dog();
		a.eat();
		a=new BabyDog();
		a.eat();
	}	
}

