public class RecursionExample4
{
	static int n1=0,n2=1,n3=0;
	static void printFibo(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibo(count-1);
		}
	}
	public static void main(String args[])
	{
		int count=15;
		System.out.println(n1+" "+n2);//printing 0 and 1
		printFibo(count-5);//n-2 because 2 number are already printed
	}
}