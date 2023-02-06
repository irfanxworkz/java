class A
{
	static final int data;// static blank final variable
	static{data=50;}//static block

	public static void main(String args[]) 
	{
		System.out.println(A.data);
	}
}