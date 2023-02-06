public class LogicalAndBitwiseAndOperatorExample
{
	public static void main(String args[])
	{
	 int a=10;
	 int b=5;
	 int c=20;
		//Logical And Operator(&&) used
		System.out.println(a<b&&a<c);//false && true = false
		System.out.println(a>b&&a<c);//true && true =true
		System.out.println(a<b&&a>c);//false&&false=false
		
		//Bitwise And Operator(&) used
		System.out.println(a<b&a<c);//false&true=false
		System.out.println(a>b&a<c);//true&true=true
		System.out.println(a<b&a>c);//false&false=false
		
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
	}
}