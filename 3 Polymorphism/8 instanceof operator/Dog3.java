class Animal
{

}
class Dog3 extends Animal
{
	static void method(Animal t)
	{
		Dog3 d=(Dog3)t;//downcasting
		System.out.println("downcasting also performed");
		
		/*if(a instanceof Dog3)
		{
			Dog3 d=(Dog3)a;//downcating
			System.out.println("ok downcasting performed");
		}*/
	}
	
	public static void main(String args[])
	{
		Animal c=new Dog3();
		Dog3.method(c);
	}
}