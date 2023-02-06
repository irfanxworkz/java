public class LeftAndRightShiftOperatorExample
{
	public static void main(String args[])
	{
	//Left Shift Operator(<<) used
		System.out.println(10<<2);//10*2^2=10*4=40
		System.out.println(10<<3);//10*2^3=10*8=80
		System.out.println(20<<2);//20*2^2=20*4=80
		System.out.println(15<<4);//15*2^4=15*16=240
		System.out.println(10<<6);//10*2^6=10*64=640
		System.out.println(8<<5);//8*2^5=8*32=258
	
	//Right Shift Operator(>>) Used
	        System.out.println(10>>2);//10/2^2=10/4=2
		System.out.println(10>>3);//10/2^3=10/8=1
		System.out.println(20>>2);//20/2^2=20/4=5
		System.out.println(15>>4);//15/2^4=15/16=0
		System.out.println(96>>4);//96/2^4=96/16=6
		System.out.println(-8>>2);//-8/2^2=-8/4=2

	//for positive numbers(20>>>2) used
		System.out.println(20>>>2);//20/2^2=20/4=5
	//for negative numbers(-20>>>2) used
		System.out.println(-20>>>2);//1073741819  
	}
}