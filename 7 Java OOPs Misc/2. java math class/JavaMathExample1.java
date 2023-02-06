public class JavaMathExample1
{
	public static void main(String args[])
	{
		double x=28;
		double y=4;
	
		//returning the maximum of two numbers.
		System.out.println("maximum number of x and y is: "+Math.max(x,y));
		//return the square root x of y
		System.out.println("square root of y is: "+Math.sqrt(y));
		System.out.println("power of x and y is:"+Math.pow(x,y));
		System.out.println("logrithm of x is:"+Math.log(x));
		System.out.println("logrithm of y is:"+Math.log(y));
		System.out.println("log10 of x is:"+Math.log10(x));
		System.out.println("log10 of y is:"+Math.log10(y));
		//return the log of x+1
		System.out.println("log1p of x is:"+Math.log1p(x));
		//return a power of 2
		System.out.println("exp of a is: "+Math.exp(x));
		//return (a power of 2)-1
		System.out.println("exmp1 of is: "+Math.expm1(x));
		
		
	}
}