class TestArray4
{
	public static void main(String args[])
	{
		int arr[]={33,3,4,5};
		System.out.println("printing original elements");
		for(int i:arr)
		System.out.println(i);
		System.out.println("printing clone of the array");
		int carr[]=arr.clone();
		for(int i:carr)
		System.out.println(i);
		System.out.println("are both equal?");
		System.out.println(arr==carr);
	}
}