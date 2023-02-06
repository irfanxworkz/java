class StringBuilderExample2
{
	public static void main(String args[])
	{
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("world");
		//sb.replace(1,3,"java");
		//sb.delete(1,3);
		sb.reverse();
		System.out.println(sb);
	}
}