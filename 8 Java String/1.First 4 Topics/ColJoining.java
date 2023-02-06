import java.util.*;
import java.util.stream.Collector;
public class ColJoining
{
	public static void main(String args[])
	{
		List <String> liststr = Arrays.asList("abc","pqr","xyz");//List of string array
		String str=liststr.stream().collect(Collector.joining(" "));//performing joining operations
		System.out.println(str.toString());//display result
	}
}