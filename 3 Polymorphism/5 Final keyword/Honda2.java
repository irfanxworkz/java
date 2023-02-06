class Bike
{
	final void run()
	{
		System.out.println("running...");
	}
}
class Honda2 extends Bike
{
	public static void main(String args[])
	{
		Honda2 h=new Honda2();
		h.run();
		//new Honda2().run();
	}
}