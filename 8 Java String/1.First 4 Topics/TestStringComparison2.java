class TestStringComparison2
{
	public static void main(String args[])
	{
		String s1="sachin";
		String s2="SACHIN";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
	}
}