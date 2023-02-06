class TestArray2
{
	static void A(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		if(min>arr[i])
		min=arr[i];
		System.out.println(min);
	}
	public static void main(String args[])
	{
		int a[]={33,30,5,7,9};//declaration and initialization arry
		A(a);//passing array to ,ethod
	}	
}