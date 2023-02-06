abstract class Bike
{
	abstract void run();//no method body and abstract
}
class Honda4 extends Bike
{
 	void run()
	{
		System.out.println("running safety");
	}
	public static void main(String args[])
	{
		Bike obj=new Honda4();//upcasting
		obj.run();
	}
}