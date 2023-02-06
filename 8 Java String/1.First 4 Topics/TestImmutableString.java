class TestImmutableString
{
	public static void main(String args[])
	{
		String s="Sachin";
		s.concat("tendulkar");//concat() method appends the string at the end
		System.out.println(s);//will print sachin because string are immutable objects
		String s1="Irfan";
		s1=s1.concat(" Pathan");
		System.out.println(s1);
	}
}