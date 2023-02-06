public class StrFormat
{
	public static void main(String args[])
	{
		String s1=new String("Hello");//String 3
		String s2=new String("Mini");//String 2
		String s3=String.format("%s%s",s1,s2);//String 3 to store result
		System.out.println(s3.toString());//Displays result
	}
}