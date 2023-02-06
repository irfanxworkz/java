import java.util.*;
public class TestSubString2
{
	public static void main(String args[])
	{
		String text=new String("Hello my name is irfan");
		String[] sentences=text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}
}