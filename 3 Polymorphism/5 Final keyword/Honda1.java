final class Bike
{

}
class Honda1 extends Bike
{
	void run()
	{
		System.out.println("running safely with 100 kmph");
	}
	public static void main(String args[])
	{
		Honda1 h1=new Honda1();
		h1.run();
	}
}