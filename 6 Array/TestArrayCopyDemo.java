class TestArrayCopyDemo
{
	public static void main(String args[])
	{
		//declaring a source array
		char[] CopyFrom={'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
		//declaring a destination array
		char[] CopyTo=new char[7];
		//copying array using system.arraycopy()method
		System.arraycopy(CopyFrom,2,CopyTo,0,7);
		//printing the destination array
		System.out.println(String.valueOf(CopyTo));
	}
}