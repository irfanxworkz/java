public class StringOperation6
{
	public static void main(String args[])
	{
		String s=new String("sachin Tendulkar");
		String s2=s.intern();
		System.out.println(s2);
	}
}