//creating the custom wrapper class
class TestJavatpoint
{
	private int i;
	TestJavatpoint(){}
	TestJavatpoint(int i)
	{
		this.i=i;
	}
	public int getValue()
	{
		return i;
	}
	public void setValue(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
}
//testing the custom wrapper class
public class Javatpoint
{

	public static void main(String args[])
	{
		TestJavatpoint j=new TestJavatpoint(10);
		System.out.println(j);
	}
}