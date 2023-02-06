public class AllLoopStatementExample
{
	public static void main(String args[])
	{
		//TODO Auto-generated method stub

		//for loop statement
		int sum = 0;
		for(int j=1;j<=10;j++)
		{
			sum = sum + j;
			//System.out.println("the sum of first 10 natural number is "+sum);
		}
		System.out.println("the sum of first 10 natural number is "+sum);

		//java for-each loop 
		String[] names ={"Java","C","C++","Python","Javascript"};
		System.out.println("printing the content of the array names:\n");
		for(String name:names)
		{
			System.out.println(name);
		}
		
		//java while loop
		int i=0;
		System.out.println("printing the list of first 10 even numbers");
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
		}

		//do-while loop
		int j=1;
		System.out.println("printing the list of first 10 odd numbers");
		do
		{
			System.out.println(j);
			j=j+2;
		}while(j<=10);		
	}
}