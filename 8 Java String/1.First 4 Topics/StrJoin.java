public class StrJoin
{
	public static void main(String args[])
	{
		String s1=new String("Hello");
		String s2=new String("India");
		String s3=String.join("  ",s1,s2);// String 3 to store the result
		System.out.println(s3.toString());

	}
}