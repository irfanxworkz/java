class Operation2
{
	int data=50;
	void change(Operation2 a)
	{
		a.data=a.data+102;//changes will be int the instance variable
	}
	public static void main(String args[])
	{
		Operation2 op2=new Operation2();
		System.out.println("before change "+op2.data);
		op2.change(op2);
		System.out.println("after change "+op2.data);
	}
}