public class UnaryOperatorExample2
{
	public static void main(String args[])
	{
		int a=10;
		int b=10;
		int c=10;
		int d=-10;
		boolean e=true;
		boolean f=false;
		System.out.println(a++ + ++a);//10+12=22
		System.out.println(b++ + b++);//10+11=21
		System.out.println(b);
		System.out.println(b--);
		System.out.println(++b);
		System.out.println(b);
		System.out.println(~c);
		System.out.println(~b);
		System.out.println(~d);
		System.out.println(!e);
		System.out.println(!f);
	}
}