class Vehice
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}

class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running safely");
	}

	public static void main(String args[])
	{
		Bike2 obj=new Bike2();//creating objects
		obj.run();//calling methods
	}
}