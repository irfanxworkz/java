public class RecursionExample1
{
	static void p()
	{
		System.out.println("Hello");
		p();
	}
	/*void p()
	{
		System.out.println("Hello");
		p();
	}*/
	public static void main(String args[])
	{
		/*RecursionExample1 r=new RecursionExample1();
		r.p();*/
		p();
	}
}