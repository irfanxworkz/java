public class InstanceMethodExample
{
public static void main(String[] args)
{
	//Creating an Object of the class
	InstanceMethodExample obj=new InstanceMethodExample();
	
	//invoking instance method
	System.out.println("The sum is: "+obj.add(12,13));
}
//user defined method because we have not used static keyword
public int add(int a, int b)
{
 	int s;
	s=a+b;
	//returing the sum
	return s;
}

}