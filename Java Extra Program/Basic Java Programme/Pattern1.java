class Pattern1
{
	void print()
	{
		int row=4;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("A");
		}
	}
	public static void main(String args[])
	{
		Pattern1 p=new Pattern1();
		p.print();
	}

}