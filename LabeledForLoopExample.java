public class LabeledForLoopExample
{
	public static void main(String[] args)
	{
		//using Label for outer and for loop
		aa:
		   for(int i=1;i<=3;i++)
		   {
		 	bb:
			   for(int j=1;j<=3;j++)
			   {
				if(i==2 && j==2)
				{
					break aa;
					//continue bb;
				}
				System.out.println(i+" "+j);
  			   }
   		   }
	}
}