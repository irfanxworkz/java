public class JavaMathExample2
{
	public static void main(String args[])
	{
		int a=30;
		//converting value to radian
		double b = Math.toRadians(a);
		//return the trignometric sine of a
		System.out.println("Sine Value of a is: "+Math.sin(a));
		System.out.println("cos Value of a is: "+Math.cos(a));
		System.out.println("tan Value of a is: "+Math.tan(a));
		System.out.println("arc Sine Value of a is: "+Math.asin(a));
		System.out.println("arc cos Value of a is: "+Math.acos(a));
		System.out.println("arc tan Value of a is: "+Math.atan(a));
		System.out.println("hyperbolic Sine Value of a is: "+Math.sinh(a));
		System.out.println("hyperbolic cos Value of a is: "+Math.cosh(a));
		System.out.println("hyperbolic tan Value of a is: "+Math.tanh(a));
	}
}