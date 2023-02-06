//let's see an example to print the classloader name

public class ClassLoaderExample
{
	public static void main(String[] agrs)
	{
		Class c=ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}
}