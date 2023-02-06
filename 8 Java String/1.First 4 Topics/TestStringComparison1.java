class TestStringComparison1
{
	public static void main(String args[])
	{
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4="sourav";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
	}
}