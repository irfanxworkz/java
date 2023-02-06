class Bike
{
	int speedlimit=90;
}
class Honda3 extends Bike
{
	int speedlimit=100;
	public static void main(String args[])
	{
		Bike obj=new Honda3();//upcasting
		System.out.println(obj.speedlimit);
	}
}