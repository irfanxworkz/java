class Bike
{
	void run()
	{
		System.out.println("Running");
	}
}
class Splendor extends Bike
{
	void run()
	{
		System.out.println("running with safely 60kmph");
	}
	
	public static void main(String args[])
	{
		Bike b=new Splendor();//upcasting
		//Bike b=new Bike();//from this Bike class Run method 
		b.run();
	}
}