public class StringExample
{
	public static void main(String args[])
	{
		String s1="Java";//creating string by java string literal
		char ch[]={'s','t','r','i','n','g','s'};
		String s2=new String(ch);//converting char array to string
		String s3=new String("example");//creating java String by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(ch);//without converting char array to String

	}
}