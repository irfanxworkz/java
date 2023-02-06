//java programe to convert object into primitives
//unboxing example of integer to int
public class WrapperExample2
{
	public static void main(String args[])
	{
		//converting Integer to int
		Integer a=new Integer(3);
		int i=a.intValue();//converting integer to int explicitly
		int j=a;//unboxing now compiler will write a.intValue() internally
		System.out.println(a+" "+i+" "+j);
	}
}