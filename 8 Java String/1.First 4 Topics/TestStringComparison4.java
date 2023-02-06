class TestStringComparison4
{
	public static void main(String args[])
	{
		String s1="sachin";
		String s2="sachin";
		String s3="Ratan";
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//1(beacause s1>s3)
		System.out.println(s3.compareTo(s1));//-1(because s3<s1)
	}
}