//java programe to convert primitive into objects
//autoboxing example of int to interger

public class WrapperExample1
{
	public static void main(String args[])
	{
		//converting int into integer
		int a=20;
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly
		Integer j=a;//autoboxing, now compiler will write integer valueof(a) internally
		System.out.println(a+" "+i+" "+j);
	}
}