class Counter
{
	//int count=0; //will get memory each time when the instance is created
	static int count=0; //will get memory only once and retain its values
	
	Counter()
	{
		//count ++;//incrementing values
		count ++; //incrementing the values of static variable
		System.out.println(count);
	}
	public static void main(String args[])
	{
		//creating object
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	}
}