public class JumpStatementBreakAndContinueExample
{
	public static void main(String agrs[])
	{
		for(int n=0;n<=10;n++)
		{
			System.out.println(n);
			if(n==6)
			{
				break;
			}
		}
		
		a:
		for(int i=0;i<=10;i++)
		{
			b:
			for(int j=0;j<=15;j++)
			{
				c:
				for(int k=0;k<=20;k++)
				{
					System.out.println(k);
					if(k==5);
					{
						break a;
					}
				}
			}
		}

		//contine statement
		for(int i=0;i<=2;i++)
		{
			for(int j=i;j<=5;j++)
			{
				if(j==4)
				{
					continue;
				}
				System.out.println(j);
			}
		}
	}
}