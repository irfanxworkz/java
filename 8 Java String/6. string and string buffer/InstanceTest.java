public class InstanceTest
{
	public static void main(String args[])
	{
		System.out.println("Hashcode test of string: ");
		String str="java";
		System.out.println(str.hashCode());
		str=str+"Tpoint";
		System.out.println(str.hashCode());
		System.out.println("Hash code test of StringBuffer: ");
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb.append("tpoint");
		System.out.println(sb.hashCode());
	}
}