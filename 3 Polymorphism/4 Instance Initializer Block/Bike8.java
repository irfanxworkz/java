class Bike8
{
	int speed;
	Bike8()
	{
		System.out.println("constructor is invoked");
	}
	{System.out.println("Instance initialiazer block is invoked");}

	public static void main(String args[])
	{
		Bike8 b1=new Bike8();
		Bike8 b2=new Bike8();
	}
}