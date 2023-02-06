class TestStringComparison3
{
	public static void main(String args[])
	{
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		System.out.println(s1==s2);//true(beacause both refer to same Instance)
		System.out.println(s1==s3);//false(bacause s3 refer to instance created in non pool)
	}
}